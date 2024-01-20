public class secondlargestelement{
  public static int[] getSecondOrderElements(int n, int[] a) {
      int[] result = new int[2];

      int largest = a[0];
      int secondLargest = -1;

      for (int i = 0; i < n; i++) {
          if (a[i] > largest) {
              secondLargest = largest;
              largest = a[i];
          } else if (a[i] < largest && a[i] > secondLargest) {
              secondLargest = a[i];
          }
      }

      result[0] = secondLargest;

      int smallest = a[0];
      int secondSmallest = Integer.MAX_VALUE;//int secondSmallest = Integer.MAX_VALUE;: Initializes the variable secondSmallest with the maximum possible integer value. This ensures that any element in the array will be smaller than this initial value.

      for (int i = 1; i < n; i++) {
          if (a[i] < smallest) {
              secondSmallest = smallest;
              smallest = a[i];
          } else if (a[i] != smallest && a[i] < secondSmallest) {
              secondSmallest = a[i];
          }
      }

      result[1] = secondSmallest;

      return result;
  }
}
