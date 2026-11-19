class Solution {
    public int[] dailyTemperatures(int[] temp) {
        Stack<Integer> tempStack = new Stack<>();
        int[] res = new int[temp.length];
        for(int i = 0 ; i< temp.length; i++) {
            if(!tempStack.isEmpty()){
                if(temp[i] > temp[tempStack.peek()]) {
                    while(!tempStack.isEmpty() && temp[i] > temp[tempStack.peek()]){
                        res[tempStack.peek()] = i - tempStack.peek();
                        tempStack.pop();
                    }
                }
            }
            tempStack.push(i);
        }
        return res;
    }
}
