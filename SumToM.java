import java.util.Hashtable;


public class SumToM {

	
	
	public static void sumToM(int a[],int m){
		Hashtable<Integer,Integer> ht = new Hashtable<Integer,Integer>();
		for(int i:a){
			Integer num = new Integer(i);
			if(!ht.containsKey(num))
				ht.put(num, new Integer(1));
			else
				ht.put(num, ht.get(num)+1);
		}
		
		for(int j:a){
			Integer num1 = new Integer(m-j);
			if(j==m){
				if(ht.get(num1)>1){
				System.out.print(j+" ");
				System.out.println(m-j);
				}
			}
			else
				if(ht.containsKey(num1)){
					{
						System.out.print(j+" ");
						System.out.println(m-j);
						}
				}
					
		}
	}
	
	
	public static void main(String[] args) {
		int arr[] = {1,2,5,6,3,7,2};
		sumToM(arr,4);
	}

}
