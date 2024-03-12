package Practice;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 3 numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int max = a;
        if(b>max)
            max=b;
        if(c>max)
            max=c;
        System.out.println(max + " is the largest!");

//        int max = Math.max(a,b,c);        // Another Method
//        int max = Math.max(c, Math.max(a,b));        // Another Method
    }
}
