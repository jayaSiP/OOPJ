 import java.util.Scanner;
public class bio{
public static void main(String[] args){
String a;
int b;
Long c;
try (Scanner S1 = new Scanner(System.in)) {
    a=S1.nextLine();
    b=S1.nextInt();
    c=S1.nextLong();
}
System.out.println("name="+a);
System.out.println("age="+b);
System.out.println("salary="+c);
}
}