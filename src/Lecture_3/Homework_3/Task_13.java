package Lecture_3.Homework_3;

import java.util.Arrays;
import java.util.Scanner;

public class Task_13 {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);

        System.out.println("Please enter the number of rows to form square two dimensional array");
        int rows = sn.nextInt();
        System.out.println("Please enter the number of columns to form square two dimensional array");
        int columns = sn.nextInt();

        if ((rows < 2) || (columns < 2)) {
            System.out.println("Your array size values should be more than one");
        } else {
            if (rows != columns) {
                System.out.println("Your array is not square.");
            } else {
                int [][] array = new int [rows][columns];

                System.out.println("Please enter elements of array");

                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < array[0].length; j++) {
                        array[i][j] = sn.nextInt();
                        System.out.println(Arrays.deepToString(array));
                    }
                }

                System.out.println();

                int counterForward = 0;
                int counterBackward = 0;
                int mainDiagonalSum = 0;
                int secondDiagonalSum = 0;

                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < array[0].length; j++) {
                        mainDiagonalSum += array[i][j + counterForward];
                        break;
                    }
                    counterForward++;
                }
                System.out.println("The main diagonal sum is: " + mainDiagonalSum);

                for (int i = 0; i < array.length; i++) {
                    for (int j = array.length - 1; j >= 0; j--) {
                        secondDiagonalSum += array[i][j - counterBackward];
                        break;
                    }
                    counterBackward++;
                }
                System.out.println("The second diagonal sum is: " + secondDiagonalSum);
            }
        }
    }
}
