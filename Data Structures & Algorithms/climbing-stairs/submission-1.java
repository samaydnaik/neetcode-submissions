class Solution {
    int[] cache;
    public int climbStairs(int n) {
        cache = new int[n];
       for(int i = 0;i<n;i++){
        cache[i] = -1;
       }
       return dfs(n,0);
    }

    private int dfs(int dest, int steps){
        if(steps >= dest) return steps == dest ? 1: 0;
        if(cache[steps]!=-1) return cache[steps];
        return cache[steps] = dfs(dest, steps+1) + dfs(dest, steps+2);
    }
}
