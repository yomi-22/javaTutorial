package conditionalStatement;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {

        // basic salary = 1000
        /* sales more than 10 items
       get 2500 extra
         *
         */
        double basicSalary = 10000;
        int expectedSaleNo = 10;
        double bonus = 2500;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter this month sales");
        int actualSale = scanner.nextInt();
        scanner.close();

        if (actualSale > expectedSaleNo) {
            basicSalary += bonus;
            System.out.println("Your total pay including bonus is " + basicSalary);
        } else if (actualSale == expectedSaleNo) {
            System.out.println("Congratulation you meant your sales target for this week");
        } else {
            System.out.println("You have not meet your sales target for this week");
        }
    }
}
