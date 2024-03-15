package Practice;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter EmployeeID: ");
        int empID = input.nextInt();
        System.out.println("Enter Department: ");
        String department = input.next();

        switch (empID)
        {
            case 1:
                System.out.println("Ritik Sharma");
                break;
            case 2:
                System.out.println("Vansh Bhatnagar");
                break;
            case 3:
                switch (department)
                {
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Management":
                        System.out.println("Management");
                        break;
                    default:
                        System.out.println("No department entered");
                }
                break ;
            default:
                System.out.println("Enter correct EmployeeID!");
        }
    }
}
