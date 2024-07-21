import java.util.HashMap;

class Solution {
    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        
        // Rob houses from the first to the second-to-last house
        int ans1 = robHelper(nums, 0, nums.length - 2);
        // Rob houses from the second to the last house
        int ans2 = robHelper(nums, 1, nums.length - 1);
        
        return Math.max(ans1, ans2);
    }
    
    private int robHelper(int[] nums, int start, int end) {
        int n = end - start + 1;
        if (n == 1) return nums[start];
        
        int[] dp = new int[n];
        dp[0] = nums[start];
        dp[1] = Math.max(nums[start], nums[start + 1]);
        
        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(nums[start + i] + dp[i - 2], dp[i - 1]);
        }
        
        return dp[n - 1];
    }
}
