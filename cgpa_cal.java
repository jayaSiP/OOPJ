import java.util.Scanner;

class abc{
    int roll;
    float cgpa;
    String name;
    void display(){
        System.out.println(name);
        System.out.println(roll);
        System.out.println(cgpa);
    }
}
public class cgpa_cal{
    public static void main(String[] args) {
        abc a1=new abc();
        abc a2=new abc();
        abc a3=new abc();
        Scanner s1 =new Scanner(System.in);
        Scanner s2 =new Scanner(System.in);
        System.out.println("Enter the roll:");
        a1.roll=s1.nextInt();
        System.out.println("Enter the name:");
        a1.name=s2.nextLine();
        System.out.println("Enter the cgpa:");
        a1.cgpa=s1.nextFloat();
        System.out.println("Enter the roll:");
        a2.roll=s1.nextInt();
        System.out.println("Enter the name:");
        a2.name=s2.nextLine();
        System.out.println("Enter the cgpa:");
        a2.cgpa=s1.nextFloat();
        System.out.println("Enter the roll:");
        a3.roll=s1.nextInt();
        System.out.println("Enter the name:");
        a3.name=s2.nextLine();
        System.out.println("Enter the cgpa:");
        a3.cgpa=s1.nextFloat();
        System.out.println("The name is:"+a1.name);
        System.out.println("The roll is:"+a1.roll);
        System.out.println("The cgpa is:"+a1.cgpa);
        System.out.println("The name is:"+a2.name);
        System.out.println("The roll is:"+a2.roll);
        System.out.println("The cgpa is:"+a2.cgpa);
        System.out.println("The name is:"+a3.name);
        System.out.println("The roll is:"+a3.roll);
        System.out.println("The cgpa is:"+a3.cgpa);
        if((a1.cgpa>a3.cgpa) && (a2.cgpa>a3.cgpa)){
            System.out.println("The cgpa of " +a3.name+" is lesser.");
        }
        else if((a1.cgpa>a2.cgpa) && (a3.cgpa>a2.cgpa)){
            System.out.println("The cgpa of " +a2.name+" is lesser.");
        }
        else{
            System.out.println("The cgpa of " +a1.name+" is lesser.");
        }

    }
}