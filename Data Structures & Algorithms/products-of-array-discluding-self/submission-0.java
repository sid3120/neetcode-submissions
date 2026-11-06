class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] prefixMul = new int[nums.length + 1];
        int[] suffixMul = new int[nums.length + 1];
        prefixMul[0] =1 ;
        suffixMul[nums.length] = 1;

        for ( int i=0 , j = nums.length -1 ; i < nums.length && j>=0; i++, j--) {
            prefixMul[i+1] = prefixMul[i] * nums[i];
            suffixMul[j] = suffixMul[j+1] * nums[j];
        }
        int result[] = new int [nums.length];
        for(int i=0 ;i < nums.length; i++) {
            result[i] = prefixMul[i] * suffixMul[i+1];
        }

        return result;


    }
}  
