package conditionalStatement;

public class Arrays {
    public static void main(String[] args) {
        int[] numbers = {3, 10, 34, 4};
        String[] myStr = new String[5];
        myStr[0] = "Yes";
        myStr[1] = "No";
        myStr[2] = "Maybe";

        System.out.println("Array length " + numbers.length);

        System.out.println("Array single value " + numbers[0]);
        for (int i = 0; i < numbers.length; i++) {

            System.out.println("Array value " + numbers[i]);
            if (numbers[i] == 10) {
                System.out.println("You are wearing Jay Jay Okocha shirt");
            }

        }

        double[][] twodimensionalArray = new double[3][3];
        twodimensionalArray[0][0] = 12.7;
        twodimensionalArray[0][1] = 10.7;
        twodimensionalArray[0][2] = 1.7;
        twodimensionalArray[1][0] = 122.7;

        double[][] twodimensionalArray2 = {{10, 2, 3}, {9, 2, 2}};
        // print value
        for (int i = 0; i < twodimensionalArray2.length; i++) {

            for (int j = 0; j < twodimensionalArray2[i].length; j++) {
                System.out.println("2 dimensional array " + twodimensionalArray2[i][j]);
            }
        }
    }
}
