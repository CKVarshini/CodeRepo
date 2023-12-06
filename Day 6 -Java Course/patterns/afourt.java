package patterns;

import java.net.SocketTimeoutException;

public class afourt {
public static void main(String args[]){
 int n=5;
 int i,j;
 for(i=1;i<=n;i++){
  for(j=1;j<=n-i;j++){
    System.out.print(" ");
  }
  //first half number
  for(j=i;j>=1;j--){
    System.out.print(j);
  }

  //2nd half numbers
  for(j=1;j<=i;j++)
  {
    System.out.print(j);
  }System.out.println();
 } 
}
  
}
