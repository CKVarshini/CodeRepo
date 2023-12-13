package arrays;

import java.util.Scanner;

public class input {
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();
    int numbers[]=new int[size];
 
    for(int i=0;i<size;i++){
    numbers[i]=sc.nextInt();
  }
    for(int i=0;i<size;i++)
    System.out.println(numbers[i]); //defult null value will be the output in case if int,float=0.0,string=" ",boolen=flase
  }
}
