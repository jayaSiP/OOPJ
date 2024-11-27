import java.util.Scanner;

public class namerev {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your 1st  name: ");
        String firstName = sc.nextLine();
        System.out.println("\nEnter your last name: ");
        String lastName = sc.nextLine();
        System.out.println("My full name is : " + lastName + " " + firstName);
    }
}