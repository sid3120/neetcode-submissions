class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0)
            return false;
        Stack<Character> charStack = new Stack<>();
        Map<Character, Character> brackets = new HashMap<>();
        brackets.put(')', '(');
        brackets.put(']', '[');
        brackets.put('}', '{');
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (brackets.containsKey(c)) {
                if (charStack.isEmpty() || charStack.peek() != brackets.get(c)) {
                    return false;
                } else {
                    charStack.pop();
                }

            } else {
                charStack.push(c);
            }
        }

        return charStack.isEmpty();
    }
}
