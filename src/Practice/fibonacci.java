package Practice;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = input.nextInt();
        int num1 = 0;
        int num2 = 1;
        int sum = 0;
        for (int i = 0; i<=n; i++)
        {
            sum = num1+num2;
            num1 = num2;
            num2 = sum;
            System.out.print(sum + " ");
        }
    }
}
