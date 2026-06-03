class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int n = landStartTime.length;
        int m = waterStartTime.length;
        int ans = Integer.MAX_VALUE;

        int minl = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            minl = Math.min(minl,landStartTime[i]+landDuration[i]);
        }

        int minw = Integer.MAX_VALUE;
        for(int j=0;j<m;j++){
            minw = Math.min(minw,waterStartTime[j]+waterDuration[j]);
        }

        for(int j=0;j<m;j++){
            ans = Math.min(ans,Math.max(waterStartTime[j],minl)+waterDuration[j]);
        }
        for(int i=0;i<n;i++){
            ans = Math.min(ans,Math.max(landStartTime[i],minw)+landDuration[i]);
        }

        return ans;


    }
}