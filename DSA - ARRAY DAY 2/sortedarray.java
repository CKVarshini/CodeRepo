public class sortedarray{
  public static int isSorted(int n, int[] a) {
      for (int i = 1; i < n; i++) {
          if (a[i] >= a[i - 1]) {
              // array is still sorted, continue checking
          } else {
              return 0; // array is not sorted, return false
          }
      }
      return 1; // array is sorted
  }
}