package patterns;

public class tstar 
{
  public static void main(String args[])
  {
    int n=4;
    int i,j;
    for(i=1;i<=n;i++)               //row(outer loop)
    {      
      for(j=1;j<=i;j++)             //column(inner loop)
      {  
        System.out.print("*");    //row number=column number
      }     
      System.out.println();
    }
  }
}
