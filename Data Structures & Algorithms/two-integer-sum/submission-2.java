class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer , List<Integer>> indexTrack = new HashMap<>();
        for (int i =0; i < nums.length ; i++) {
            List<Integer> indexes = indexTrack.containsKey(nums[i])? indexTrack.get(nums[i]) : new ArrayList<>();
            if(indexes.size() < 2) {
                indexes.add(i);
                indexTrack.put(nums[i], indexes);
            }


            int firstValue = nums[i];
            int secondValue = target - firstValue;
            if(indexTrack.containsKey(secondValue)) {
                List<Integer> indexList = indexTrack.get(secondValue);
                if(firstValue == secondValue) {
                    if(indexes.size() == 2) {
                    return indexes.stream().mapToInt(Integer::intValue).toArray();
                    }
                    continue;
                }

                int indexA = indexTrack.get(firstValue).get(0);
                int indexB = indexTrack.get(secondValue).get(0);

                return indexA < indexB ? new int[]{ indexA, indexB} : new int[]{indexB, indexA};

            }

        }

        return new int[0];
    }
}
