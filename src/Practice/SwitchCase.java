package Practice;

public class SwitchCase {
    public static void main(String[] args) {
        String day = "Wednesday";
        /*switch (day)
        {
            case "Sunday":
                System.out.println("Today is Sunday!");
                break;
            case "Monday":
                System.out.println("Today is Monday");
                break;
            case "Tuesday":
                System.out.println("Today is Tuesday");
                break;
            case "Wednesday":
                System.out.println("Today is Wednesday");
                break;
            case "Thursday":
                System.out.println("Today is Thursday");
                break;
            case "Friday":
                System.out.println("Today is Friday");
                break;
            case "Saturday":
                System.out.println("Today is Saturday");
                break;
            default:
                System.out.println("Invalid input!");
        }*/
                // OR
        switch (day)
        {
            case "Sunday" -> System.out.println("Today is Sunday!");
            case "Monday" -> System.out.println("Today is Monday!");
            case "Tuesday" -> System.out.println("Today is Tuesday!");
            case "Wednesday" -> System.out.println("Today is Wednesday!");
            case "Thursday" -> System.out.println("Today is Thursday!");
            case "Friday" -> System.out.println("Today is Friday!");
            case "Saturday" -> System.out.println("Today is Saturday!");
            default -> System.out.println("Invalid input!");
        }

        /*switch (day)
        {
            case 1,2,3,4,5 -> System.out.println("Weekday!");
            case 6,7 -> System.out.println("Weekend");
        }*/

    }
}
