class Solution {
    public int[] twoSum(int[] nums, int target) {

    //    int sum = 0;
       int n = nums.length;
       int ans[] = new int[2];
       HashMap<Integer, Integer> map = new HashMap<>();

       for(int i = 0; i<n; i++){
        if(map.containsKey(target-nums[i])){
            ans[0] =i;
            ans[1]= map.get(target-nums[i]);
            break;
        }
            map.put(nums[i],i);
       }
       return ans;
       } 
}