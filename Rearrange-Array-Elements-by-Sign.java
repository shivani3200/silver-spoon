class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int arr[] = new int[n];
        int k = 0;
        int l = 1;
// my first medium level question jisko hm bina hint k banaye
        for(int i = 0; i<n; i++){
            if(nums[i]<0 && l<n){
                arr[l]= nums[i];
                l= l+2;
            }
            else if(nums[i]>=0 && k<n){
               arr[k]= nums[i];
               k=k+2;
            }}
        return arr;
    }
}