import java.util.Scanner;

public class vote {
    public static void checkEligibility(int age){
    if(age<18)
    {
        throw new IllegalArgumentException("you are not elligible to vote");
    }
    else
    System.out.println("Elligible to vote");
}


public static void main(String[] args)
{
    int age;
    Scanner t1 = new Scanner(System.in);
    try{
    System.out.println("Enter your AGE");
    age = t1.nextInt();
    checkEligibility(age);
}
catch(IllegalArgumentException e)
{
    System.out.println("Error");
}
}
}