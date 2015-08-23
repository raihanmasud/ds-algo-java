
public class LinearTimeSorting {

	
	
	static void countingSort(int a[],int k){
	
		int c[] = new int[k+1];
		for(int i=0;i<=k;++i)
			c[i]=0;
		
		for(int i=0;i<a.length;++i)
			c[a[i]]++;
		int l=0;
		for(int i=0;i<=k;++i)
			if(c[i]>0){
				a[l++]=i;
				c[i]--;
				i--;
			}
				
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] ={1,2,1,4,3,2,1,0,4,3};
		countingSort(a,4);
		for(int n:a)
			System.out.print(n+" ");
	}

}
