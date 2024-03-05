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
        byte b = (byte)(a);*/             // 257 % 256 = 1

        byte a = 40;
        byte b = 50;
        byte c = 100;
        int d = a * b / c;
        System.out.println(d);
    }
}
