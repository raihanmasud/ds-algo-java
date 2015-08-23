import java.util.ArrayList;

public class Stack {
	private int top=0;
	private ArrayList<Object> stack ;
	
	public Stack(){
		stack = new ArrayList<Object>();	
	}
	
	public void push(Object item){
		stack.add(item);
		top++;
	}
	
	public Object pop(){
		
		return  stack.remove(--top);
	}
	
	public Object peek(){
	
		return stack.get(top-1);
	}
	
	public boolean isEmpty(){
	
		if(top==0) return true;
		return false;
	}
	
}
