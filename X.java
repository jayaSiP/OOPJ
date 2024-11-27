import java.util.Scanner;

public class X {
    public static void main ( String[] args){
        int a=10, b=5,c;
        try{
            c= a/b;
            System.out.println(c);
        }
        catch (Exception a)
        { System.out.println("Caught an exception");
        }
        finally
        {
            System.out.println("called by finally block");
        }
        } 
        System.out.println("rest of the code");
    }

