class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String , List<String>> resultMap = new HashMap<>();
        for(String s : strs) {
            String freqString = returnFreqString(s);
            List<String> freqList = resultMap.containsKey(freqString) ? resultMap.get(freqString): new ArrayList<>();
            freqList.add(s);
            resultMap.put(freqString, freqList);
        }
        List<List<String>> resultList = new ArrayList<>();
        for(List<String> v : resultMap.values()) {
            resultList.add(v);
        }
        return resultList;
    }

    String returnFreqString(String query) {
        String s = query.toLowerCase();
        int[] alphaNo = new int[26];
        for(char c : s.toCharArray()) {
            int index = (int) c - (int) 'a';
            alphaNo[index]++;
        }
        String result = "";
        for(int i =0 ; i < 26 ; i++) {
            if(alphaNo[i] > 0) {
            char c = (char)(i + (int) 'a');
            result = result + c + alphaNo[i];
            }
        }
        return result;
    }
}
