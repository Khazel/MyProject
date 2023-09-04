package Lecture_1.Homework;

import java.util.Scanner;

public class Task_11 {

    public static void main(String[] args) {

        System.out.println("Please enter a three-digit natural number");

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int firstDigit = number/100%10;
        int secondDigit = number/10%10;
        int thirdDigit = number%10;

        if ((firstDigit == secondDigit) && (secondDigit == thirdDigit)) {
            System.out.println("The numbers are equal.");
        } else {
            if ((firstDigit < secondDigit) && (secondDigit < thirdDigit)) {
                System.out.println("Ascending order.");
            } else {
                if ((firstDigit > secondDigit) && (secondDigit > thirdDigit)) {
                    System.out.println("Descending order.");
            } else {
                    System.out.println("Try with another number.");
                }
        }   }
    }
}
