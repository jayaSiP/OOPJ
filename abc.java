import java.util.*;
class abc {
int i,j,sub;

void subtract()
{
sub=60-34;
}

void subtract(int m,int n)
{
i=m;
j=n;
sub=i-j;
}

void subtract(int p)
{
i=p;
sub=52-p;
}

void display()
{
//System.out.println(i);
//System.out.println(j);
System.out.println(sub);

}
}

class subtract_overload
{
public static void main(String args[])
{
int k,l;
abc a1=new abc();
abc a2=new abc();
abc a3=new abc();
Scanner s1=new Scanner(System.in);
System.out.println("enter 2 nos:");
k=s1.nextInt();
l=s1.nextInt();
a1.subtract();
a2.subtract(k,l);
a3.subtract(30);
a3.display();
a1.display();
a2.display();
}
}