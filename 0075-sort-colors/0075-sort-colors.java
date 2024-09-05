class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        int k = 0;
        for(int i = 0; i< n; i++){
            if(nums[i] ==0){
                ans[k++] = nums[i];
            }
        }
        for(int i = 0; i< n; i++){
            if(nums[i] ==1){
                ans[k++] = nums[i];
            }
        }
        for(int i = 0; i< n; i++){
            if(nums[i] ==2){
                ans[k++] = nums[i];
            }
        }

for(int i = 0; i< n; i++){
            nums[i] = ans[i];
        }
        
    }
}