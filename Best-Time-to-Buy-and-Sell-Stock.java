class Solution {
    public int maxProfit(int[] arr) {
        int n= arr.length;
        int minSoFar = arr[0];
        int maxProfit = 0;
        for(int i = 0; i < n; i++){
            minSoFar = Math.min(minSoFar,arr[i]);
            maxProfit = Math.max(maxProfit, arr[i] - minSoFar);
        }
        return maxProfit;
    }
}