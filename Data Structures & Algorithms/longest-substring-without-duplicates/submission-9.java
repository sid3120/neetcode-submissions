class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0 || s.length() == 1) return s.length();
        int max = 0 ;

        int l =0;
        Map<Character, Integer> charSet = new HashMap<>();
        charSet.put(s.charAt(l), l);
        for(int r = 1 ; r < s.length(); r++) {
            if(charSet.containsKey(s.charAt(r))) {
                
                l = Math.max(charSet.get(s.charAt(r)) + 1, l);
            }
            max = Math.max(max , r - l + 1);
            charSet.put(s.charAt(r), r);
        }
        return max ;
    }
}
