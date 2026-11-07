class Solution {
    public int maxArea(int[] heights) {
        int max = 0 ;
        int j = 0 ;
        int k = heights.length - 1;
        while (j < k) {
            max = Math.max(max , (k-j) * Math.min(heights[k], heights[j]));
            if(heights[j] > heights[k])
            {
                k--;
            } else if(heights[k] > heights[j]) {
                j++;
            } else {
                j++;
                k--;
            }

        }
        return max;
    }
}
