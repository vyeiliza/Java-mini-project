package co.option;

public class Next {
    public static int nextFunction(int currentPage , int rowsPerPage) {
        int totalPages = (int) Math.ceil((double) Write.stockManagementArrayList.size() / rowsPerPage);
        if (currentPage < totalPages) {
            currentPage++;
            Display.displayFunction(currentPage, rowsPerPage);
        } else {
            System.out.println("You are already on the last page.");
        }
        return currentPage;
    }
}
