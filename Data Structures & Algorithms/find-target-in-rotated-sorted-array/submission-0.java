class Solution {
    public int search(int[] nums, int target) {
        
        int l =0 , r = nums.length - 1;
        while(l < r) {
            int m = (r+l) / 2;
            if(nums[m] > nums[r]) {
                l = m + 1;
            } else {
                r = m;
            }
        }

        int pivot = l;
        int result =binarySearch(pivot , nums.length - 1 , target , nums);
        if(result != -1) {
            return result;
        }

        return binarySearch(0 , pivot - 1 , target , nums);

    }

    int binarySearch(int l , int r , int target , int nums[]) {
        while(l <= r) {
            int m = l+(r-l)/2;
            if(nums[m] == target) return m;
            if(nums[m] > target) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return -1;
    }
}
