import java.util.Scanner;
class Fahrenheit
{
	public static void main(String arg[])	
	{
	    double a,c;
             	    Scanner sc=new Scanner(System.in);	   	 
	    System.out.println("Enter  Fahrenheit temperature");
                   a=sc.nextDouble(); 
	    System.out.println("Celsius temperature is = "+celsius(a));	
                   a=sc.nextDouble();
        System.out.Println("Kelvin temperature is = "+kelvin(a));	  	  	     
	} 
	static double celsius(double f)
	{	
	return  (f-32)*5/9;
	}
    static double kelvin(double k)
    {
        return (f-32)*9/5;
    }
}