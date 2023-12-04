package fuctions;
import java.util.Scanner;
public class product 
{
public static int multiplyTwoNumbers(int a,int b)
 {
   return a*b;
 }
public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
  
    System.out.println("Product of two numbers is : "+multiplyTwoNumbers(a, b) );
  }
}


