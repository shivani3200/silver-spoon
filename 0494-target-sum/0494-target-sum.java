
class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        // Using a map with (index, current sum) as key
        HashMap<String, Integer> map = new HashMap<>();
        return helper(nums, target, nums.length - 1, 0, map);
    }

    public int helper(int[] nums, int target, int n, int currentSum, HashMap<String, Integer> map) {
        // Base condition
        if (n < 0) {
            return currentSum == target ? 1 : 0;
        }

        // Create a unique key for the current state
        String key = n + "," + currentSum;

        // Check the memoization map
        if (map.containsKey(key)) {
            return map.get(key);
        }

        // Recursive calls: consider both addition and subtraction
        int add = helper(nums, target, n - 1, currentSum + nums[n], map);
        int subtract = helper(nums, target, n - 1, currentSum - nums[n], map);

        // Save the result in the map
        map.put(key, add + subtract);

        // Return the total count
        return add + subtract;
    }
}
