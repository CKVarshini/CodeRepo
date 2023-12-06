package patterns;

public class afifth {
  public static void main(String args[])
  {
    int n=4;
    int i,j;
    //upper-half
    for(i=1;i<=n;i++){
      //spaces
      for(j=1;j<=n-i;j++){
        System.out.print(" ");
      }
    //stars
      for(j=1;j<=2*i-1;j++){
        System.out.print("*");
      }System.out.println();
    }
      
    //lower-half
      for(i=n;i>=1;i--){
        //spaces
        for(j=1;j<=n-i;j++){
          System.out.print(" ");
        }
        //stars
        for(j=1;j<=2*i-1;j++){
          System.out.print("*");
        }System.out.println();
      }
    }
  }

