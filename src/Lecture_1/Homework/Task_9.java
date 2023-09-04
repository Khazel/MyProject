package Lecture_1.Homework;

import java.util.Scanner;

public class Task_9 {

    public static void main(String[] args) {

        System.out.println("Please enter an integer in the range [0-100]");

        Scanner sc = new Scanner(System.in);
        int integer = sc.nextInt();
        // It does not work properly on the border values 5, 20, 50, 80, 100 as task does not mention what to do with them.
        if (integer == 0) {
            System.out.println("0 – it will not rain");
        }
        if ((integer > 0) && (integer < 5)) {
            System.out.println("Between 0 and 5 - minimal chance of precipitation");
        }
        if ((integer > 5) && (integer < 20)) {
            System.out.println("Between 5 and 20 - a small chance of precipitation");
        }
        if ((integer > 20) && (integer < 50)) {
            System.out.println("Between 20 and 50 - there is a chance of precipitation");
        }
        if ((integer > 50) && (integer < 80)) {
            System.out.println("Between 50 and 80 - high chance of precipitation");
        }
        if ((integer > 80) && (integer < 100)) {
            System.out.println("Between 80 and 100 - it will rain");
        }
    }
}
