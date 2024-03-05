package Practice;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        System.out.print("Enter two numbers to add: ");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int sum = num1+num2;
        System.out.println("The Sum of "+num1+" and "+num2+" is: "+sum);
    }
}
