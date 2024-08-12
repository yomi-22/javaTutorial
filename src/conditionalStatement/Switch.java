package conditionalStatement;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        /* insure 18 - 65
        payment
        enter age
        monthly fees

        * */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please  enter your age");
        int age = scanner.nextInt();
        int tariff = 30;
        String displayMessage;
        switch (age) {
            case 18:
                displayMessage = "Your monthly tariff " + tariff;
                break;
            case 65:
                displayMessage = "Your monthly tariff " + (tariff + 20);
                break;
            default:
                displayMessage = "You are not qualified to be insured in our policy";
                break;
        }
        System.out.println(displayMessage);

        System.out.println("Please  enter your name");
        String name = scanner.next();

        String name1 = "Yomi";
        String name2 = "Lola";
        displayMessage = switch (name.toLowerCase()) {
            case "yomi" -> "Your name is " + name1.toLowerCase();
            case "lola" -> "Your name is " + name2.toLowerCase();
            default -> "Your name is not on the system";
        };
        System.out.println(displayMessage);
    }
}
