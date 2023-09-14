package Lecture_3.Homework_3;

import java.util.Arrays;

public class Task_4 {

    public static void main(String[] args) {

        int [] array = {23, 4, 4, 23};
        int [] reversedArray = new int [array.length];

        int length = array.length;
        int start = 0;
        int end = length - 1;

        for (int i = 0; i < array.length; i++) {
            reversedArray[i] = array[i];
        }

        while (start < end) {
            int temp = reversedArray[start];
            reversedArray[start] = reversedArray[end];
            reversedArray[end] = temp;

            start++;
            end--;
        }

        if (Arrays.equals(array, reversedArray)) {
            System.out.println("Array is mirrored.");
        } else {
            System.out.println("Array is not mirrored.");
        }
    }
}
