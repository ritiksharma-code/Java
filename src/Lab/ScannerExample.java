package Lab;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Name, RollNo, Marks, Grade");

        String name = sc.nextLine();
        int RollNo = sc.nextInt();
        double Marks = sc.nextDouble();
        char Grade = sc.next().charAt(0);

        System.out.println("Name: "+name);
        System.out.println("RollNo: "+RollNo);
        System.out.println("Marks: "+Marks);
        System.out.println("Grade: "+Grade);
    }
}
