class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(k == 0 || nums.length < k) return new int[]{};
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int i : nums) {
            freqMap.putIfAbsent(i,0);
            int value = freqMap.get(i);
            value++;
            freqMap.put(i, value);
        }
        if(k > freqMap.size()) return new int[]{};

        List<Integer>[] sortedFreq = bucketSortFreq(freqMap, nums.length);
        if(sortedFreq[nums.length].size() > k) {
            return sortedFreq[nums.length].subList(0,k).stream().mapToInt(Integer::intValue).toArray();
        }

        List<Integer> resultList = new ArrayList<>();

       for(int i = nums.length ; i > 0 && k > 0; i--) {
        List<Integer> sortedFreqList = sortedFreq[i].subList(0,Math.min(k, sortedFreq[i].size()));
        resultList.addAll(sortedFreqList);
        k = k - sortedFreqList.size();
       }

       return resultList.stream().mapToInt(Integer::intValue).toArray();
    }

    List<Integer>[] bucketSortFreq(Map<Integer, Integer> freqMap , int n) {
        List<Integer>[] bucketList = (List<Integer>[])new List[n+1];
        for (int i = 1 ; i <= n ; i++) {
            bucketList[i] = new ArrayList<>();
        }
        for(Integer k : freqMap.keySet()) {
            bucketList[freqMap.get(k)].add(k);
        }
        return bucketList;
    }
}
