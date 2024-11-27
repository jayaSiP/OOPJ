import java.util.Scanner;

public class bye 
{
   public static void main(String[] args) 
   {
       Scanner s = new Scanner(System.in) ;
       
       String str = s.nextLine() ;
       int n = str.length() ; 
       

       char [] arr = new char[n] ;

       for( int i = 0 ; i  <n ; i++ )
       {
          arr[i] = str.charAt(i ) ;
       }

       
       String result ="";
       int k = 0 ; 

       for( int i = 0 ; i < n; i= k + i )
       {
           k = i ;
          int num = 0 ;

          while ( arr[k] != ' ' && k < n ) 
          {
             k++ ;
             
          }

          for( int j = i ; j < k ; j++ )
          {
             num += arr[j] - arr[k-j] ;
          }

          result += String.valueOf(num) ;
          
       }

       System.out.println(result);


   }    
}