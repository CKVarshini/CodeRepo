package patterns;

public class asecond {
  public static void main(String args[]){
   int n=5;
   int i,j;
   
   for(i=1;i<=n;i++)
   {
       
   for(j=1;j<=n-i;j++){       //spaces
    System.out.print(" ");
    }
    for(j=1;j<=5;j++)
    {
      System.out.print("*");
    }System.out.println();
   }
  }
  }  

