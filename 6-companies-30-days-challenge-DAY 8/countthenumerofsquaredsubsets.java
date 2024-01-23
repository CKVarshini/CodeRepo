class Solution {
  public int countSquarefreeSubsets(int[] nums) {
      final int MOD = 1_000_000_007;
      int n = nums.length;
      int result = 0;

      for (int mask = 1; mask < (1 << n); mask++) {
          long product = 1;
          boolean isSquareFree = true;

          for (int i = 0; i < n; i++) {
              if ((mask & (1 << i)) != 0) {
                  product *= nums[i];

                  // Check if product has a square factor
                  for (int j = 2; j * j <= nums[i]; j++) {
                      if (nums[i] % (j * j) == 0 && (product % (j * j)) == 0) {
                          isSquareFree = false;
                          break;
                      }
                  }
              }
          }

          if (isSquareFree) {
              result = (result + 1) % MOD;
          }
      }

      return result;
  }
}

