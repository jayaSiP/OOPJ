import java.util.Scanner;

public class sums{
    public static void main(String[] args) {
    
        int a,b,c;
        Scanner s1 = new Scanner(System.in);
        System.out.println("enter a value");
        a = s1.nextInt();
        System.out.println("enter b value");
        b = s1.nextInt();
        c = a+b;
        System.out.println("sum is" +c);
    }
}