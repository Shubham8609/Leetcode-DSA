class Solution {
    public int jump(int[] nums) {
        if(nums.length == 1) return 0;
        int jumps = 0; int maxVis = 0; //farthest reached so far
        int left = 0; int right = 0;
        while(right < nums.length-1){
            for(int i=left; i<=right; i++){
                maxVis = Math.max(maxVis, i+nums[i]);
            }
            left = right+1;
            right = maxVis;
            jumps++;
        }
       
        return jumps;
    }
}