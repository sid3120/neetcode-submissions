class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> values = new HashSet<>();
        for(int n : nums) {
            values.add(n);
        }
        int max = 0;
        for(int n : nums) {
            if(!values.contains(n-1)) {
                int k = n + 1;
                int length = 1 ;
                while(values.contains(k)) {
                    k++;
                    length++;
                }
                max = Math.max(max,length);
            }

            
        }

        return max;
    } 
}
