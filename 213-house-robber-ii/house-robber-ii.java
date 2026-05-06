class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1)return nums[0];

        int case1 = robhelp(nums,0,n-2);
        int case2 = robhelp(nums,1,n-1);

        return Math.max(case1,case2);
        
    }
    public int robhelp(int[]nums,int start,int end){
        if(start==end)return nums[start];

        int size = end - start+1;

        int[]dp = new int[size];
        dp[0]=nums[start];
        dp[1]=Math.max(nums[start],nums[start+1]);
        for(int i=2;i<size;i++){
            int robcurrent = nums[start+i]+dp[i-2];
            int skipcurrent = dp[i-1];

            dp[i]=Math.max(robcurrent,skipcurrent);
        }
        return dp[size-1];
    }
}