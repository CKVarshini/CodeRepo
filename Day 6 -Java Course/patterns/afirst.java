package patterns;

public class afirst 
{
  public static void main(String args[])
  {
     int n=4;
     //frist half-upper half
     for(int i=1;i<=n;i++)   //outer loop
     {
      for(int j=1;j<=i;j++)
      {
      
        System.out.print("*");
      }
      int spaces=2*(n-i);
      for(int j=1;j<=spaces;j++)
      {
        System.out.print(" ");
      }
          //2nd part
          
          for(int j=1;j<=i;j++){
            System.out.print("*");
          }System.out.println();
     }
     //lower half-second half
     for(int i=n;i>=1;i--)   //outer loop
     {
      for(int j=1;j<=i;j++)
      {
      
        System.out.print("*");
      }
      int spaces=2*(n-i);
      for(int j=1;j<=spaces;j++)
      {
        System.out.print(" ");
      }
          //2nd part
          for(int j=1;j<=i;j++){
            System.out.print("*");
          }System.out.println();
        }
 
      } 
    } 
  

    

    