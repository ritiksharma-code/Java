package Practice;

import java.util.Scanner;

public class SumFunction {
    public static void main(String[] args)
    {   /*
        Syntax for functions:
            access modifier (OOPS) return_type name(arguments)
            {
                // body
                return statement;
            }
        */
//        sum();        sum function calling without return type
        int ans = sum2();       // sum2 function calling return the value of sum into ans variable
        System.out.println("The sum is: " +ans);
    }
    static int sum2()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        return sum;
    }
    static void sum()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();
        int sum = num1+num2;
        System.out.println("The sum is: " +sum);
    }
}
