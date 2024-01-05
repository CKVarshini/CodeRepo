/*Given an unsorted array Arr of size N of positive integers.
 One number 'A' from set {1, 2,....,N} is missing and one number 'B' occurs twice in array. 
 Find these two numbers.

 Example 1:
 Input:
  N = 2
  Arr[] = {2, 2}
  Output: 2 1
  Explanation: Repeating number is 2 and smallest positive missing number is 1.
*/

class Solve {
    int[] findTwoElement(int arr[], int n) {
        int[] result = new int[2];

        for (int i = 0; i < n; i++) {
            int index = Math.abs(arr[i]) - 1;
            
            if (arr[index] > 0) {
                arr[index] = -arr[index];
            } else {
                result[0] = index + 1; // Repeating element
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                result[1] = i + 1; // Missing element
                break;
            }
        }

        return result;
    }
}
