package Practice;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");;
        number = input.nextInt();
        if(number%2==0){
            System.out.println(number + " is even!");
        }
        else{
            System.out.println(number + " is odd!");
        }
    }
}
