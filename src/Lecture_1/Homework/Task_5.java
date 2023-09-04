package Lecture_1.Homework;

import java.util.Scanner;

public class Task_5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please inform if you are at work:");
        String atWork = sc.nextLine();
        boolean isAtWork;
        if (atWork == "Yes") isAtWork = true;
        else {
            isAtWork = false;
        }

        System.out.println("Please enter time:");
        int time = sc.nextInt();
        boolean isDay;
        if ((time >= 0) & (time < 6)) {
            isDay = false;
        } else {
            isDay = true;
        }

        System.out.println("Please enter amount of money:");
        double money = sc.nextDouble();

        if (isAtWork) { // It does not hit this condition, and I don't know how to debug with this IDE, so I cannot tell why.
            System.out.println("If I'm at work, I'll be working and won't be able to go out.");
        } else {
            if (isDay == true) {
                if (money > 10) {
                    System.out.println("If it's a day and I have more than 10$. I will go to the cinema.");
                } else {
                    System.out.println("If it's a day and I have less than 10$. or I don't have money, I'll go for a walk.");
                }
            } else {
                if (money > 20) {
                    System.out.println("If it is night and I have more than 20$. I will go to a disco.");
                } else {
                    System.out.println("If it's night and I have less than 20$. I will go to sleep.");
                }
            }
        }
    }
}
