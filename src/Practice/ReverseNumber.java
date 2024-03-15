package Practice;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = input.nextInt();
        int ans = 0, rem;
        while(n>0)
        {
            rem = n%10;
            n = n/10;
            ans = (ans*10)+rem;
        }
        System.out.println("Reverse: "+ans);
    }
}
