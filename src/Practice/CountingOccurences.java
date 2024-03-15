package Practice;

import java.util.Scanner;

public class CountingOccurences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        System.out.print("Enter the number you want to check: ");
        int check = input.nextInt();
        int count = 0;
        while(n>0)
        {
            int rem = n%10;     // last digit
            if(rem == check)
            {
                count++;
            }
            n = n/10;       // n /= 10
        }
        System.out.println("Frequency of "+check+" is: "+count+".");

    }
}
