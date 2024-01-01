/*
Find all valid combinations of k numbers that sum up to n such that the following conditions are true:

Only numbers 1 through 9 are used.
Each number is used at most once.
Return a list of all possible valid combinations. The list must not contain the same combination twice, and the combinations may be returned in any order.

 
*/

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), k, n, 1);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> current, int k, int target, int start) {
        if (k == 0 && target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i <= 9; i++) {
            if (i > target) {
                break; // Pruning to improve efficiency
            }
            current.add(i);
            backtrack(result, current, k - 1, target - i, i + 1);
            current.remove(current.size() - 1);
        }
    }
}
