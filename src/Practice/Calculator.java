package Practice;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        System.out.print("Enter Operator (+, -, *, /, %): ");
        char operator = input.next().charAt(0);
        int result = 0;

        if(operator == '+'){
            result = num1+num2;
        }
        else if (operator == '-') {
            result = num1-num2;
        }
        else if (operator == '/') {
            result = num1/num2;
        }
        else if (operator == '*') {
            result = num1*num2;
        }else if (operator == '%') {
            result = num1%num2;
        }
        else{
            System.out.println("Invalid Input!");
        }

        System.out.println("Result: " + result);
    }
}
