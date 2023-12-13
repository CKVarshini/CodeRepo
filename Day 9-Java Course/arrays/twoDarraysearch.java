package arrays;

import java.util.Scanner;

public class twoDarraysearch {
  public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
   int rows=sc.nextInt();
   int cols=sc.nextInt();
   
   int[][] numbers=new int[rows][cols];

   //input
   //rows
   for(int i=0;i<rows;i++){
    //columns
    for(int j=0;j<cols;j++){
    numbers[i][j]=sc.nextInt();
    }
  }
  int x=sc.nextInt();
  //output
  for(int i=0;i<rows;i++){
    for(int j=0;j<cols;j++){
      if(numbers[i][j] == x)
    System.out.print("x found at location:  ( " + i + " , " + j + " ) ");
   }
   System.out.println();
}
}
}

