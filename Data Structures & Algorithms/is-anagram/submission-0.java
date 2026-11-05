class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length() != t.length()) {
            return false;
        } 

        if(s.length() == 0) return true;
        int[] charSize = new int[26];
        for(int i =0; i < s.length() ; i++) {
            int sIndex = (int) s.charAt(i) - (int) 'a';
            int tIndex = (int) t.charAt(i) - (int) 'a';
            charSize[sIndex]++;
            charSize[tIndex]--;
        }
        
        for(int v : charSize) {
            if(v != 0) return false;
        }
        return true;

    }
}
