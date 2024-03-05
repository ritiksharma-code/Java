import java.util.Scanner;

public class IntInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.print("Enter the roll number: ");;
//        int rollno = input.nextInt();
//        System.out.println("Your roll number is: " + rollno);
//        int a = 10;     // a is identifier and 10 is literal.
//        int a = 234_000_000;    // To print 234 million, commas will be printed instead of underscore
//        System.out.println(a);
        String name = input.nextLine();
        System.out.println(name);
        float marks = input.nextFloat();
        System.out.println(marks);
    }
}
