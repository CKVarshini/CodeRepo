import java.util.* ;
import java.io.*; 

public class largestelementinanarray  {

    static int largestElement(int[] arr, int n) {
        int largest = arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>largest)
            largest=arr[i];
        }
        return largest;
    }
}