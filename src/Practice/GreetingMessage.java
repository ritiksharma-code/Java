package Practice;

import java.util.Scanner;

public class GreetingMessage {
    public static void main(String[] args) {
        String name;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = input.nextLine();
        System.out.println("Hello " + name + "!");
    }
}
