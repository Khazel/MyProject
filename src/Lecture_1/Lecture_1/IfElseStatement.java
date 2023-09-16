package Lecture_1.Lecture_1;

public class IfElseStatement {

    public static void main(String[] args) {
        int a = 25;
        int b = 25;
        if (a > b) {
            System.out.println(a + " > " + b);
        } else {
            if (a < b) {
                System.out.println(a + " < " + b);
            } else {
                System.out.println(a + " = " + b);
            }
        }
        // First mistake
        int c = 7;
        if (c > 10); {
            System.out.println("c is " +c);
            System.out.println("c is bigger than 10");
        }

        // Second mistake
        int c1 = 7;
        if (c1 > 10)
            System.out.println("c is " + c1);
            System.out.println("c is bigger than 10");

        // Third mistake
        int d = 7;
        if (d == 1) {

        } else {
            System.out.println("d is bigger than 1");
        }

        /*
         * ---------------------------------------------------------------
         * 3. Logical operators
         * ---------------------------------------------------------------
         *
         * - logical AND
         * - logical OR
         * - logical XOR (exclusive or)
         * - logical NOT
         * |    A   |    B   |   A && B  |   A || B  |   A ^ B   |   !A  |
         * |--------|--------|-----------|-----------|-----------|-------|
         * |  true  |  true  |   true    |    true   |   false   | false |
         * |  true  |  false |   false   |    true   |   true    | false |
         * |  false |  true  |   false   |    true   |    true   | true  |
         * |  false |  false |   false   |    false  |   false   | true  |
         * ---------------------------------------------------------------
         */

        if ( !(true ^ true) ) {
            System.out.println("XOR");
        }

        int c2 = 5;
        if ((c2 >= 5) && !(c2 > 10)) {
            System.out.println("Hello");
        }
        if ((c2 < 10) || (c2 > 100)) {
            System.out.println("Bye");
        }
    }
}
