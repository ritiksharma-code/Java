package Lab;

public class IfElse {
    public static void main(String[] args) {
        String name[] = {"Mohan", "Rohan", "Sohan"};
        int roll[] = {25, 36, 71};
        if(name[0] == "Mohan"&&roll[1] == 25)
            System.out.println("Details of Mohan");
        else if(name[2] == "Rohan"&&roll[1] == 36)
            System.out.println("Details of Rohan");
        else if(name[2] == "Sohan"&&roll[2] == 71)
            System.out.println("Details of Sohan");
        else
        {
            System.out.println("Invalid details!");
        }
    }
}
