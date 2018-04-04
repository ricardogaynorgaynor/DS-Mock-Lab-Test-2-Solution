
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack stack = new Stack();
		Queue queue = new Queue();
		printPostFix("5/2+", queue, stack);

	} 
	
	public static int isOperator(char ch) { 
		switch(ch) {
			case '+':
			case '-':
				return 1;
			case '/':
			case '*':
				return 2;
		}
		return 0;
	}
	
	public static String printPostFix(String expression, Queue queue, Stack stack) {
		//String[] expressionSplit = expression.split("(?=[*/+-])|(?<=[*/+-])");
		char[] expressionSplit = expression.toCharArray();
		
		if(isValid(expressionSplit)) {
			
			for(char ie : expressionSplit) {
				if(isOperator(ie) != 0) {
					
					if(stack.isEmpty()) {
						stack.push(ie);
					}else {
						//stack is not empty
						if( isOperator(ie) <= isOperator(stack.getTop()) ) {
							while(!stack.isEmpty() && (isOperator(ie) <= isOperator(stack.getTop())) ) {
								queue.enqueue(stack.pop());
							}
							stack.push(ie);
						}else {
							stack.push(ie);
						}
					}
					
				}else {
					queue.enqueue((char) ie);
				}
			}
			
			while(stack.getTop() != null) {
				queue.enqueue(stack.pop());
				
			}
			
			while(queue.getFront() != null) {
				System.out.print(queue.dequeue() + " ");
			}
			
		}
		return "ff";
	}
	
	public static boolean isValid(char[] expressionSplit) {
		
		
		if(expressionSplit.length < 3) {
			System.out.println("Invalid Expression");
			return false;
		}
		;
		for(int i = 0; i < expressionSplit.length; i++) {
			
			if(i < expressionSplit.length - 1) {
				if(expressionSplit[i] == (expressionSplit[i + 1])){
					System.out.println("Invalid Expression");
					return false;
				}
			}
			
			if(expressionSplit[0] == '+' || expressionSplit[0] == '/' || expressionSplit[i] == '*') {
				System.out.println("Invalid Expression");
				return false;
			}
			
			if(isOperator(expressionSplit[expressionSplit.length - 1]) != 0) {
				System.out.println("Invalid Expression");
				return false;
			}
			
			// validation continues //
			i++;	
		}
		System.out.println("Valid Expression");
		return true;
	}
	
	

}
