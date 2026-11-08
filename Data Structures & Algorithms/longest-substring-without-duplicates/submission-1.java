class Solution {
    public int lengthOfLongestSubstring(String s) {
         if(s.length() == 0) return 0;
         if(s.length() == 1) return 1;
         int l = 0;
         int r = 1;
         Set<Character> charSet = new HashSet<>();
         charSet.add(s.charAt(l));
         int max = 0 ;
         while(l < r && r < s.length()) {
            
            if(charSet.contains(s.charAt(r))) {
                max = Math.max(max, r - l);
                while(charSet.contains(s.charAt(r)) && l < r){
                    charSet.remove(s.charAt(l));
                    l++;
                }   
            }
            charSet.add(s.charAt(r));
            if(r < s.length()) {
               r++;
            }
         }
         max= Math.max(max , r-l);
         return max;
    }
}
