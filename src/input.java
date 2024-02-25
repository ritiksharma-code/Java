// Program to take input from user
import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner input = new Scanner(System.in);
        System.out.println(input.next());           // For strings and other input, till white spaces
        System.out.println(input.nextInt());        // For integers
        System.out.println(input.nextLine());       // For strings and other input, whole line is taken as an input
    }
}
