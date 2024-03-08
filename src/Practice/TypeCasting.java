package Practice;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*float num = input.nextFloat();
        System.out.println(num);*/
        int num = (int)(67.56f);        // Type Casting
        System.out.println(num);

        // Automatic type promotion in expressions
        /*int a = 257;
        byte b = (byte)(a);*/            // 257 % 256 = 1

        /*byte a = 40;
        byte b = 50;
        byte c = 100;
        int d = a * b / c;
        System.out.println(d);

        System.out.println(3 * 43.02);*/      // Automatic Type promotion to float
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result  = (f*b)+(i/c) - (d*s);
        // Output: float + int -double = double
        System.out.println((f*b) + " " + (i/c) + " " + (d*s));
        System.out.println(result);
    }
}
