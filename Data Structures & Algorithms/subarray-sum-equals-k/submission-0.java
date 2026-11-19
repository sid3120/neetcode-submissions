class Solution {
    public int subarraySum(int[] nums, int k) {
        int result = 0;
        int currSum = 0;
        Map<Integer, Integer> prefixSums = new HashMap<>();
        prefixSums.put(0, 1);
         for(int i = 0 ; i < nums.length; i++) {
            currSum+=nums[i];
            result += prefixSums.getOrDefault(currSum - k , 0);
            prefixSums.put(currSum , prefixSums.getOrDefault(currSum, 0) + 1);
         }
         return result;


    }
}