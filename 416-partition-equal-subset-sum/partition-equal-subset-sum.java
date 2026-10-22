class Solution {
    static int[][] dp;

    static boolean solve(int[] nums, int sum, int n) {
        if (sum == 0) return true;
        if (n == 0 || sum < 0) return false;

        if (dp[n][sum] != -1) {
            return dp[n][sum] == 1;
        }

        boolean take = solve(nums, sum - nums[n - 1], n - 1);
        boolean notTake = solve(nums, sum, n - 1);

        dp[n][sum] = (take || notTake) ? 1 : 0;
        return dp[n][sum] == 1;
    }

    public boolean canPartition(int[] nums) {
        int sum = 0;
        int n = nums.length;

        for (int num : nums) {
            sum += num;
        }

        if (sum % 2 != 0) return false;

        int target = sum / 2;
        dp = new int[n + 1][target + 1];

        for (int i = 0; i <= n; i++) {
            java.util.Arrays.fill(dp[i], -1);
        }

        return solve(nums, target, n);
    }
}