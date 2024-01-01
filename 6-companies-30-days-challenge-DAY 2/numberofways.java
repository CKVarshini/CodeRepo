/*
 You are given two positive integers startPos and endPos. Initially, you are standing at position startPos on an infinite number line. With one step, you can move either one position to the left, or one position to the right.

Given a positive integer k, return the number of different ways to reach the position endPos starting from startPos, such that you perform exactly k steps. Since the answer may be very large, return it modulo 109 + 7.

Two ways are considered different if the order of the steps made is not exactly the same.

Note that the number line includes negative integers
 */

 class Solution {
    private static final int MOD = 1000000007;

    public int numberOfWays(int start, int end, int k) {
        int[][] dp = new int[2 * (start + k)][k + 1];
        for (int[] a : dp) Arrays.fill(a, -1);
        int maxDistance = Math.abs(start - k);
        return ways(start + maxDistance, end + maxDistance, k, dp);
    }

    int ways(int s, int e, int k, int[][] dp) {
        if (k == 0) {
            return s == e ? 1 : 0;
        }

        if (dp[s][k] != -1) return dp[s][k];

        int left = ways(s - 1, e, k - 1, dp);
        int right = ways(s + 1, e, k - 1, dp);

        return dp[s][k] = (left + right) % MOD;
    }
}
