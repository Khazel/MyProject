package Lecture_1.Homework;

import java.util.Scanner;

public class Task_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter first integer: ");
        int firstInteger = sc.nextInt();

        System.out.println("Please enter second integer: ");
        int secondInteger = sc.nextInt();

        int integerSum = firstInteger + secondInteger;
        int integerDifference = firstInteger - secondInteger;
        int integerProduct = firstInteger * secondInteger;
        int integerReminderOfDivision = firstInteger % secondInteger;
        int integerDivision = firstInteger / secondInteger;

        System.out.println("Integers sum is " + integerSum);
        System.out.println("Integers difference is " + integerDifference);
        System.out.println("Integers product is " + integerProduct);
        System.out.println("Integers remainder of division is " + integerReminderOfDivision);
        System.out.println("Integers division is " + integerDivision);

        System.out.println("Please enter first floating point number: ");
        double firstFloatingPointNumber = sc.nextDouble();

        System.out.println("Please enter second floating point number: ");
        double secondFloatingPointNumber = sc.nextDouble();

        double floatingPointNumberSum = firstFloatingPointNumber + secondFloatingPointNumber;
        double floatingPointNumberDifference = firstFloatingPointNumber - secondFloatingPointNumber;
        double floatingPointNumberProduct = firstFloatingPointNumber * secondFloatingPointNumber;
        double floatingPointNumberRemainderOfDivision = firstFloatingPointNumber % secondFloatingPointNumber;
        double floatingPointDivision = firstFloatingPointNumber / secondFloatingPointNumber;

        System.out.println("Floating point numbers sum is " + floatingPointNumberSum);
        System.out.println("Floating point numbers difference is " + floatingPointNumberDifference);
        System.out.println("Floating point numbers product is " + floatingPointNumberProduct);
        System.out.println("Floating point numbers remainder of division is " + floatingPointNumberRemainderOfDivision);
        System.out.println("Floating point numbers division is " + floatingPointDivision);
    }
}
