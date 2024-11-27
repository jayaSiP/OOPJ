import java.util.Scanner;
public class b {
    
    
    public static void checkEligibility(int age) {
        if (age < 18) {
            
            throw new IllegalArgumentException("You must be 18 years or older to vote.");
        } else {
            System.out.println("You are eligible to vote.");
        }
    }
    
    public static void main(String[] args) {
        int age;
        Scanner s1 =new Scanner(System.in); 
        
        try {
            System.out.println("Enter your age");
           age= s1.nextInt();
            checkEligibility(age);
        } catch (IllegalArgumentException e) {
           
            System.out.println("Error: " + e.getMessage());
        }
    }
}
