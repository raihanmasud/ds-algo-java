import java.util.ArrayList;
import static java.lang.System.out;

public class Queue {

	private int first=0,last=0;
	private ArrayList<Object> queue; 
	public Queue(){
		queue = new ArrayList<Object>();
	}
	
	public void enQueue(Object item){
		queue.add(item);
		last++;
	}
	
	public Object deQueue(){
		return queue.remove(first++);
	}
	
	public void printQueue(){
	
	for(Object node:queue)	
		out.print(((Node)node).value+" ");
	}
	
	public boolean isEmpty(){
		
		if(first==last){
			return true;
		}
		return false;
	}
	
}
