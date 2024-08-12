package Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ExceptionExample {

    public static void main(String[] args) throws FileNotFoundException {
        // singleException();
        division();
    }

    public static void singleException() throws FileNotFoundException {
        File file = new File("C/letter.txt");
        file.canRead();
    }

    public static void division() {
        Scanner scanner = null;

        try {
            System.out.println("Enter you first number :");
            scanner = new Scanner(System.in);
            var firstNo = scanner.nextDouble();
            System.out.println("Enter you second number :");
            var secondNo = scanner.nextDouble();
            var division = firstNo / secondNo;
            System.out.println("Result " + division);
        }
        // catch more than one exception at a time using the pipe/or symbol
        catch (Exception e) {
            System.out.println("Division is fun");
            e.getStackTrace();
        }
    }

    public static void multipleException() {
        File file = new File("C/letter.txt");
        Scanner scanner = null;

        try {
            System.out.println("Enter you first number :");
            scanner = new Scanner(System.in);
            var firstNo = scanner.nextDouble();
            System.out.println("Enter you second number :");
            var secondNo = scanner.nextDouble();
            var division = firstNo / secondNo;
            System.out.println("Result " + division);

            scanner = new Scanner(file);
            scanner.next();
        }
        // catch more than one exception at a time using the pipe/or symbol
        catch (FileNotFoundException | ArithmeticException e) {
            //  e.getMessage();
            e.getStackTrace();
        }
        scanner.close();
    }
}
