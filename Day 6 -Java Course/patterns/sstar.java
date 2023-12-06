package patterns;

public class sstar {
  public static void main(String args[])
  {
    int n=4;int m=5;
    int i,j;
    for(i=1;i<=n;i++){      //outer loop
      for(j=1;j<=m;j++) 
      {  //inner loop
      if(i==1|| j==1|| j==m || i==n)
       {
        System.out.print("*");
       } else{
        System.out.print(" ");
       }      
      
      }
      System.out.println();
    }
  }
  
}
