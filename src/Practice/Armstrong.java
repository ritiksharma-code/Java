package Practice;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        int n, temp, sum = 0, r;
        System.out.print("Enter the number: ");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        temp = n;
        while(n>0)
        {
            r = n%10;
            sum = sum + (r*r*r);
            n=n/10;
        }
        if(temp == sum)
        {
            System.out.println("Armstrong number!");
        }
        else
        {
            System.out.println("Not an Armstrong number!");
        }
    }
}
