import java.util.* ;
import java.io.*; 


public class leftrotatearraybyone{
    static int[] rotateArray(int[] arr, int n) {
        if (n <= 1) {
            return arr; // Nothing to rotate for an array with 0 or 1 element
        }

        int temp = arr[0];
        for (int i = 1; i < n; i++) {
            arr[i - 1] = arr[i];
        }

        arr[n - 1] = temp;
        return arr;
    }
} 