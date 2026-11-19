class Solution {
    public int maxSubArray(int[] nums) {
      int currMax = nums[0];
      int globalMax = nums[0];
      for(int i = 1 ; i < nums.length ; i++){
        int n = nums[i];
        currMax = Math.max(n, n + currMax);
        globalMax = Math.max(globalMax, currMax);
      }

      return globalMax;  
    }
}
