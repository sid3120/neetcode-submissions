class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> valueFreq = new HashSet<>();
        for (int i : nums) {
            valueFreq.add(i);
        }
       return nums.length != valueFreq.size(); 
    }
}