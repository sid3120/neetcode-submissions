class Solution {
    public boolean isPalindrome(String s) {
       String value = getAlphaNumericString(s.toLowerCase());
       return isStringPalindrome(value); 
    }

    boolean isStringPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1 ;
        while(left <= right) {
            if(s.charAt(left) != s.charAt(right))
            {
            return false;
            }
            left++;
            right--;
        }
        return true;


    }

    String getAlphaNumericString(String s) {
        String result = ""; 
        for(int i = 0 ; i< s.length(); i++) {
            if((s.charAt(i) >= 'a' && s.charAt(i)  <= 'z') || (s.charAt(i) >= '0' && s.charAt(i)  <= '9')) {
                result = result + s.charAt(i);
            }
        }
        return result;

    }
}
