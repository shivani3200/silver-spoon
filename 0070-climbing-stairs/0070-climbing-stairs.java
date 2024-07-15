class Solution {
    public int climbStairs(int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = helper(n, map);
        return ans;

    }

    public int helper(int n, HashMap<Integer, Integer> map) {
        // base cndn
        if (n == 1 )
            return 1;

        if (n == 2)
            return 2;

        // check map
        if(map.containsKey(n))
            return map.get(n);

        // child solutions //recursion

        int ans = helper(n - 2,map) + helper(n - 1,map);

        map.put(n, ans);
 
        return ans;
    }
}