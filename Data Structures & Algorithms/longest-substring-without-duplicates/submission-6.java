class Solution {
    public int lengthOfLongestSubstring(String s) {
         if(s.length() == 0) return 0;
         if(s.length() == 1) return 1;
         int l = 0;
         int r = 1;
         Map<Character, Integer> charSet = new HashMap<>();
         charSet.put(s.charAt(l) , l);
         int max = 0 ;
         while(l < r && r < s.length()) {
            
            if(charSet.containsKey(s.charAt(r))) {
                int index  = charSet.get(s.charAt(r)) + 1;
                if(index > l) {
                    l = index;
                }
                // while(charSet.contains(s.charAt(r)) && l < r){
                //     charSet.remove(s.charAt(l));
                //     l++;
                // }   
            }

            charSet.put(s.charAt(r) , r);
            max = Math.max(max, r - l + 1);

            

            if(r < s.length()) {
               r++;
            }
         }
        //  max= Math.max(max , r-l);
         return max;
    }
}
