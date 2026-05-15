class Solution {
    public int[] decrypt(int[] code, int k) {
       int n = code.length;
       int[]arr = new int[n];
       for(int i=0;i<n;i++){
        int sum =0;
       if(k==0){
            return arr;
       }
       else if (k>0){
          
            for(int j=1;j<=k;j++){
                int ind = (i+j)%n;
                sum+=code[ind];
            }
            arr[i] = sum;
          
       }  
       else if (k<0){
          
          
            for(int j=1;j<=Math.abs(k);j++){
                int ind = (i-j+n)%n;
                sum+=code[ind];
            }
            arr[i]= sum;
          
       }  
       }  

       return arr;
    }
}