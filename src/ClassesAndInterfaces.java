import Lab1.Seller;
import Lab1.Builder;

import java.util.Scanner;

public class ClassesAndInterfaces {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Seller seller = new Seller();
        Builder builder = new Builder();
        seller.setInfo();

        seller.showInfo();
        builder.setInfo();
        builder.showInfo();

        System.out.print("строитель в отпуске?:");
        boolean isWorking = scan.next().equalsIgnoreCase("Да");
        if (isWorking) {
            builder.onLeave();
        } else {
            builder.working();
        }
        
    }
}