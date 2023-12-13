package arrays;

import java.util.Scanner;

public class twoDarrays {
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
  //output
  for(int i=0;i<rows;i++){
    for(int j=0;j<cols;j++){
    System.out.print(numbers[i][j] + " ");
   }
   System.out.println();
}
}
}
