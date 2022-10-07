class MyQueue {
	Stack<Integer> stack;
	Stack<Integer> temp;
	
    public MyQueue() {
        stack = new Stack<>();
		temp = new Stack<>();
    }
    
    public void push(int x) { 			
		stack.push(x);
    }
    
    public int pop() { 					
		while (!stack.isEmpty())
			temp.push(stack.pop());
		
		int n = temp.pop();
	
		while (!temp.isEmpty())
			stack.push(temp.pop());
        
        return n;
    }
    
    public int peek() { 
        while (!stack.isEmpty())
			temp.push(stack.pop());
		
		int n = temp.peek();
	
		while (!temp.isEmpty())
			stack.push(temp.pop());
        
        return n;
    }
    
    public boolean empty() { 
        return stack.isEmpty();
    }
}
