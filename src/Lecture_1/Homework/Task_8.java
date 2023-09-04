package Lecture_1.Homework;

import java.util.Scanner;

public class Task_8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a three-digit number from the keyboard, without the digit 0 in this number");
        int number = sc.nextInt();

        int firstDigit = number/100%10;
        int secondDigit = number/10%10;
        int thirdDigit = number%10;

        if (number % firstDigit == 0)
        {
            System.out.println(number + " is divisible by " + firstDigit);
        } else {
            System.out.println(number + " is not divisible by " + firstDigit);
        }
        if (number % secondDigit == 0)
        {
            System.out.println(number + " is divisible by " + secondDigit);
        } else {
            System.out.println(number + " is not divisible by " + secondDigit);
        }
        if (number % thirdDigit == 0)
        {
            System.out.println(number + " is divisible by " + thirdDigit);
        } else {
            System.out.println(number + " is not divisible by " + thirdDigit);
        }
    }
}
