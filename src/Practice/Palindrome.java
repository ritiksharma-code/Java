package Practice;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        int n,  temp, sum = 0, r;
        System.out.print("Enter the number: ");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        temp = n;
        while(n>0)
        {
            r = n%10;
            sum = (sum * 10) + r;
            n = n/10;
        }
        if(temp == sum)
        {
            System.out.println("Palindrome Number!");
        }
        else
        {
            System.out.println("Not a Palindrome Number!");
        }
    }
}
