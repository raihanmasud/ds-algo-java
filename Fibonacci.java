import java.util.HashMap;


public class Fibonacci {

	public static int fib(int n){
		
		if (n==0) return 0;
		if (n==1) return 1;
		
		else 
			return fib(n-1) + fib (n-2); // O(2^n)
		
	}
	
	
public static int memoizedFib(int n){
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(0,0);
		map.put(1,1);
		
		
		if(map.containsKey(n))
			return map.get(n);
		
		else {
			int fib = fib(n-1) + fib (n-2);
			map.put(n, fib); //building table
			return fib; 
		}
	}
	
	public static int fastFib(int n){
		
		//HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		//if(map.containsKey(n))
		//return (int) (map.get(n));
		
		//else{
			//map.put(n, fibMemoize(n));
			//return
		
		int fib[] = new int[n+1];
		
		 fib[0] = 0;
		 fib[1] = 1;
		
		for (int i=2; i<=n; i++)
			fib[i] = fib[i-1]+fib[i-2];
		
		return fib[n];
		
		}
		
	
	
	public static void main(String args[]){
		
		System.out.print(memoizedFib(10));
	}
	
	
}
