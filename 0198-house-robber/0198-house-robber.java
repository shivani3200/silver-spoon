class Solution {
    public int rob(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        int money =  helper(nums,n-1, map);
        return money;
    }

    public int helper(int[] arr, int n, HashMap<Integer,Integer> map){
        //base cndn
        if(n<0) return 0;
        if(n==0) return arr[0];

        //check map
        if(map.containsKey(n)) return map.get(n);

        //recursion
        int money = Math.max(arr[n] + helper(arr,n-2,map), helper(arr,n-1,map));
        //save
        map.put(n,money);

        return money;

    }
}