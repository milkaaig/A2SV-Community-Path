class Solution { 
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st = new Stack<>();
        int j=0; 
        for(int i=0;i<pushed.length;i++){
            st.push(pushed[i]);   
            if(st.peek() == popped[j]){  
                while(j<popped.length && st.size() > 0 && st.peek() == popped[j]){ 
                    st.pop();
                    j++;
                } 
            }
        }
        return j==popped.length; 
    }
}
