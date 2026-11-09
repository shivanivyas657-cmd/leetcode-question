class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int runningSum = 0;
        for(int i=0; i<n; i++){
            runningSum = runningSum + nums[i];
            nums[i] = runningSum;
        }
        return nums;
        
    }
}