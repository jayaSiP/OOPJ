import java.util.Scanner;
public class data { 

    public static void main (String[] args)
    {
        int roll,year;
        String name , branch;
        Scanner s1 = new Scanner(System.in);
        System.out.println("enter name of student");
        name = s1.nextLine();
        System.out.println("enter roll if the student");
        roll = s1.nextInt();
        System.out.println("enter year of addmission");
        year = s1.nextInt();
        Scanner s2 = new Scanner(System.in);
        System.out.println("enter your branch");
        branch = s2.nextLine();

    }
}