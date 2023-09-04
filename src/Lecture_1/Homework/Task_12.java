package Lecture_1.Homework;

import java.util.Scanner;

public class Task_12 {

    public static void main(String[] args) {

        System.out.println("Please enter the year");

        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if (year % 4 != 0) {
            System.out.println("It is not a leap year");
        } else {
            if (year % 100 != 0) {
                System.out.println("It is a leap year");
            } else {
                if (year % 400 == 0) {
                    System.out.println("It is a leap yer");
                } else {
                    System.out.println("It is not a leap year");
                }
            }
        }
    }
}
