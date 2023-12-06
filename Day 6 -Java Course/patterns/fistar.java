package patterns;

public class fistar {
  public static void main(String args[])
  {
    int n=4;
    int i,j;
    //outer loop
    for(i=0;i<=n;i++)
    {
      //inner loop fro space
      for(j=0;j<=n-i;j++)
      {
        System.out.print(" ");
      }
    for(j=0;j<=i;j++)
    {
      System.out.print("*");
    }System.out.println();    
    }
  }
}
  