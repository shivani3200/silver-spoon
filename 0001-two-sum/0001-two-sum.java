class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int ans[] = new int[2];
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i< n; i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                ans[0] = i;
                ans[1] = map.get(complement);
            }
            else{
            map.put(nums[i],i);
            }
        }
    
    return ans;
}}