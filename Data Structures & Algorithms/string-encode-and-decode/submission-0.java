class Solution {

    public String encode(List<String> strs) {
        String result = "";
        for(String s : strs) {
            String stringLength = String.valueOf(s.length());
            String lengthSize = String.valueOf(stringLength.length());
            result += lengthSize+s.length()+s;
        }
        return result;
    }

    public List<String> decode(String s) {
        List<String> resultList = new ArrayList<>();
        for(int i = 0 ; i < s.length();) {
            int lengthSize = s.charAt(i) - '0';
            i++;
            String stringLength = s.substring(i,i+lengthSize);
            i = i + lengthSize;
            Integer stringSize = Integer.valueOf(stringLength);
            resultList.add(s.substring(i, i+stringSize));
            i = i+stringSize;
        }

        return resultList; 
    }
}
