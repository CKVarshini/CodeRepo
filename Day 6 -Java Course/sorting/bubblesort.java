/*BUBBLESORT
1)Ascending to descending order
2)Largest element at end
3)(n-1)times loop will run ,"n" is number of elements given
4)TIME COMPLEXITY= O(n^2) */

package sorting;

public class bubblesort {
  public static void printArray(int array[]){
    for(int i=0;i<array.length;i++){
    System.out.print(array[i]+ " ");
  }
  System.out.println();
} 

public static void main(String args[]){
    int array[]={7,8,3,1,2};
    //bubblesort
    for(int i=0;i<array.length-1;i++){   //array.length=n i.e no.of elements in array
      for(int j=0;j<array.length-1-i;j++){
         if(array[j]>array[j+1]){
          int temp=array[j];
          array[j]=array[j+1];
          array[j+1]=temp;
         }
      }
    
    }
  printArray(array);
  }
}









