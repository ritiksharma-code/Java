package Practice;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Principal: ");
        int Principal = input.nextInt();
        System.out.print("Enter Time: ");
        int Time = input.nextInt();
        System.out.print("Enter Rate: ");
        int Rate = input.nextInt();
        System.out.println("Simple Interest: " + Principal*Time*Rate + ".");
    }
}
