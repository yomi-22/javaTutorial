package conditionalStatement;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {

        double hourlyRate = 25.50;
        int maxWeeklyHours = 40;

        //break
        for (int i = 0; i < maxWeeklyHours; i++) {
            if (i == 20) {

                System.out.println(" the numbers is " + i + " before the break.");
                continue;
            }
            System.out.println("numbers are " + i);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the hours worked this week");
        int hoursWorked = scanner.nextInt();
// do while loop
        do {
            System.out.println("Please enter hours between 1 and 40");
            hoursWorked = scanner.nextInt();
        } while (hoursWorked > maxWeeklyHours || hoursWorked < 1);

        System.out.println("Your weekly payment is" + " " + (hourlyRate * hoursWorked));


        // while loop

        System.out.println("Enter your expected hourly rate worked");
        double expectedHourRate = scanner.nextDouble();

        while (expectedHourRate > hourlyRate || expectedHourRate < 5) {
            System.out.println("Our max hourly rate is " + hourlyRate + " " + "enter " +
                    "hourly rate between 5 and " + hourlyRate);
            expectedHourRate = scanner.nextDouble();
        }

        System.out.println("Your expected rate " + expectedHourRate + " is our budget");

        int maxPasswordAttempt = 4;
        String password = "P@ssword!";

        System.out.println("Enter password");
        String enteredPassword = scanner.next();
        int attempts;

        for ( attempts = 1; attempts <= maxPasswordAttempt; attempts++) {
            System.out.print("Enter your password: ");
            enteredPassword = scanner.nextLine();

            if (enteredPassword.equals(password)) {
                System.out.println("Access granted.");
                break;
            } else {
                System.out.println("Invalid password. Attempt " + attempts + " of " + maxPasswordAttempt + ".");
            }

            if (attempts == maxPasswordAttempt) {
                System.out.println("Account blocked due to too many invalid attempts.");
            }
        }
        scanner.close();
    }
}



