package conditionalStatement;

import java.util.Scanner;

public class Method {
    static double expectedSalary = 25000;
    static int creditScore = 700;
    static double salary;
    static int userCreditScore;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        enterSalary();
        enterCreditScore();
        boolean qualified = isQualified();
        decision(qualified);

    }

    public static double enterSalary() {
        System.out.println("Enter your salary");
        salary = scanner.nextDouble();
        return salary;
    }

    public static int enterCreditScore() {
        System.out.println("Enter your credit score");
        userCreditScore = scanner.nextInt();
        return userCreditScore;
    }

    public static boolean isQualified() {
        if (salary >= expectedSalary && userCreditScore >= creditScore) {
            return true;
        } else {
            return false;
        }
    }

    public static void decision(boolean decision) {
        decision = isQualified();
        if (decision) {
            System.out.println("Congratulations! you are qualified");
        } else {
            System.out.println("Sorry, you are rejected");
        }
    }
    // reject anyone less than expectedSalary or creditScore

}
