import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Result {

  /*
   * Complete the 'sockMerchant' function below.
   *
   * The function is expected to return an INTEGER.
   * The function accepts following parameters:
   *  1. INTEGER n
   *  2. INTEGER_ARRAY ar
   */

  public static int sockMerchant(int n, List<Integer> ar) {
  Map<Integer, Integer> sockCount = new HashMap<>();
      
      // Count occurrences of each sock color
      for (int sock : ar) {
          if (sockCount.containsKey(sock)) {
              sockCount.put(sock, sockCount.get(sock) + 1);
          } else {
              sockCount.put(sock, 1);
          }
      }
      
      int pairs = 0;
      // Calculate pairs for each color
      for (int count : sockCount.values()) {
          pairs += count / 2;
      }
      
      return pairs;

  }
}
/* 
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {

    /*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */
/* 
    public static int sockMerchant(int n, List<Integer> ar) {
        Set<Integer> unmatchedSocks = new HashSet<>();
        int pairs = 0;
        
        // Iterate through each sock in the list
        for (int sock : ar) {
            // If the sock is already in the set, we found a pair
            if (unmatchedSocks.contains(sock)) {
                pairs++;
                unmatchedSocks.remove(sock); // Remove the matched sock
            } else {
                // If the sock is not in the set, add it as unmatched
                unmatchedSocks.add(sock);
            }
        }
        
        return pairs;
    }

    public static void main(String[] args) {
        // Example usage
        List<Integer> socks = List.of(10, 20, 20, 10, 10, 30, 50, 10, 20);
        int n = socks.size();
        int result = sockMerchant(n, socks);
        System.out.println(result);  // Output should be 3
    }
}
*/