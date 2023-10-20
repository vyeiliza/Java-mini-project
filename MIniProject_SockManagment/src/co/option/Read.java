package co.option;

import co.stockmanagmnet.StockManagement;
import org.nocrala.tools.texttablefmt.BorderStyle;
import org.nocrala.tools.texttablefmt.ShownBorders;
import org.nocrala.tools.texttablefmt.Table;

import java.time.LocalDate;
import java.util.Scanner;

public class Read {
    public static void readFunction() {

        Scanner sc = new Scanner(System.in);
        boolean isFound = false;
        System.out.print("Read by ID : ");
        Integer productID = Integer.parseInt(sc.nextLine());
        for (StockManagement stockManagement : Write.stockManagementArrayList) {
            if (stockManagement.getId().equals(productID)) {
                Table table = new Table(1, BorderStyle.UNICODE_BOX_DOUBLE_BORDER, ShownBorders.SURROUND);
                table.addCell(" ID            : " + productID + " ".repeat(10));
                table.addCell(" Name          : " + stockManagement.getName() + " ".repeat(10));
                table.addCell(" Unit price    : " + stockManagement.getUnitPrice() + " ".repeat(10));
                table.addCell(" Qty           : " + stockManagement.getQty() + " ".repeat(10));
                table.addCell(" Imported Date : " + LocalDate.now() + " ".repeat(10));
                System.out.println(table.render());
                isFound = true;
                break;
            }
        }
        if (!isFound) {
            System.out.println("Product with ID : " + productID + " is not found");
        }
    }
}
