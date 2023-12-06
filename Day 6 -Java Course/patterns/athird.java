package patterns;

public class athird {
  public static void main(String args[]){
    int n=5;
    int i,j;
    for(i=1;i<=n;i++){
      for(j=1;j<n-i;j++){      //space
        System.out.print(" ");
      }
    for(j=1;j<=i;j++){
      System.out.print(i+" ");    //nubers-print row no,row no times
    }System.out.println();
    }
  }
  
}
