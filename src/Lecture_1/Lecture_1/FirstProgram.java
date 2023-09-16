package Lecture_1.Lecture_1;

public class FirstProgram {

    /**
     * some
     * text
     * here
     * @param args
     */

    public static void main (String[] args){
        System.out.print("Hello ");
        System.out.println("Java!");
        System.out.println("Goodbye!");

        int age = 25;
        double price = 23.5;

        System.out.println(age);
        System.out.println(price);

        /*
        Extra
        long text
        !
         */

        char char1 = 'e';
        char char2 = 251;  // ASCII
        char char3 = '\u0065';  // UNICODE

        System.out.println(char1);
        System.out.println(char2);
        System.out.println(char3);

        boolean isMe = true;

        System.out.println(isMe);

        long longNumber = 1231231312312312313L;  // use 'L' at the end

        System.out.println(longNumber);

        float floatNumber = 1.25f;  // use 'f' at the end

        System.out.println(floatNumber);
    }
}
