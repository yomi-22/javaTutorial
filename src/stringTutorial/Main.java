package stringTutorial;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
            System.out.println();
        }
        String name = "Yomi Ladokun";
        System.out.println(name.length());
        System.out.println(name.substring(0, 4));
        System.out.println(name.substring(5, 12));
        System.out.println(name.isBlank());
        System.out.println(name.isEmpty());
        System.out.println(" Yomi ".trim());

// small task
        Scanner scanner = new Scanner(System.in);
        // enter hours worked
        System.out.println("Enter hours worked");
        int hours = scanner.nextInt();
        // hourly rate
        System.out.println("Enter your hourly rate");
        double hourlyRate = scanner.nextDouble();
        // gross payment
        double grossPayment = hours * hourlyRate;
        // net payment
        double netIcome = grossPayment * 100 / 22.7;

        System.out.println("Take home is " + netIcome);
    }
}