import java.util.Scanner;
public class imag 
{
    public static void main (String[] args)
    {
        abc a1 = new abc(10,20);
        abc a2 = new abc(60,70);
        abc a3 = new abc(0,0);
        abc a3 = a1.sum(a2);
    }
 class abc
 {
    int real,imag ;
 abc(int m , int i )
 { real = m;
   imag = i;

 }

 abc sum(abc a22)
 { 
    abc t = new abc(0,0);
    t.real = real+a22.real;
    t.imag = imag+a22.imag;
    return (t);
 }
}
}