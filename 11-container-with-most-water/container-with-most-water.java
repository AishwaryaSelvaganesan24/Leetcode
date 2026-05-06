class Solution {
    public int maxArea(int[] height) {
        int i =0;
        int j = height.length - 1;
        
        int maxarea = 0;
        while(i<j){
            int w = j - i;
            int h = Math.min(height[i],height[j]);

            int dist = w * h ;
            maxarea = Math.max(maxarea,dist);
            
            if(height[i]<height[j])i++;
            else j--;
        }
        return maxarea;
    }
}