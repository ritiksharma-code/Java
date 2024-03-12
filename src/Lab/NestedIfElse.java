package Lab;

public class NestedIfElse {
    public static void main(String[] args) {
        String name = "Mohan";
        int roll = 25;
        int marks = 85;
        if(name == "Mohan"&&roll == 25)
        {
            if(marks>35)
            {
                System.out.println("Mohan has been promoted to next class.");
            }
            else
            {
                System.out.println("Mohan needs to give re-exam.");
            }
        }
    }
}
