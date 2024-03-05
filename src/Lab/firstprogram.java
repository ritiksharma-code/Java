package Lab;

public class firstprogram {
    public static String name;
    public static int marks;    // If we remove static we will get an error
    public static void main(String[] args) {
        name = "Jack";
        marks = 90;
        System.out.println(name + " Scored " + marks + "%.");;
    }
}
