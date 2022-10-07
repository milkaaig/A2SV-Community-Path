class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack();
        for(String s : tokens) {
            try {
			    // push int that can be parsed from string into stack
                stack.push(Integer.parseInt(s));
            } catch(NumberFormatException e) {
				// if cannot be parsed, it should be these four signs "+", "-", "*", "/"
				// pop top two numbers from stack and calculate result
                int a = stack.pop();
                int b = stack.pop();
                // push calculated result into stack
                stack.push(calculate(b, a, s));
            }
        }
        return stack.peek();
    }
    
	// helper function
    private int calculate(int b, int a, String c) {
        if(c.equals("+")) 
            return b + a; 
        else if(c.equals("-")) 
            return b - a; 
        else if(c.equals("*"))
            return b * a;
        else if(c.equals("/"))
            return b / a;
        return -1;
    }
}
