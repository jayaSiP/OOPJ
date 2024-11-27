import java.util.Scanner;
public class som

{  	public static void main(String[] args) {
         int a,b,c;
	    Scanner s1= new Scanner(System.in);
		System.out.println("Enter the first number:");
		a= s1.nextInt();
		System.out.println("Enter the second number:");
		b = s1.nextInt();
		c= a+b;
		System.out.println("the sum is="+ c);
	}
}
