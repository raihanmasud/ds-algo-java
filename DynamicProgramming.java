
public class DynamicProgramming {

	//Coin Changes
	public static int coinChangesDPBottoUp(int n, int d[],int k){
		//c = amount of cents
		// C[p] = min {for all x<=p, C(p-x)+1}
		//n = amount of cents
		//d[] is the array of denominations
		//
		int c[] = new int[n+1];
		c[0] = 0;
		
		if(n==0) 
			return 0;
		else{
			for(int j=1;j<=n;++j){
				c[j] = 100000; //very large initially
				for(int i=0;i<k;++i)
					if(j>=d[i])
						if((1+c[j-d[i]])<c[j])
							c[j] = 1+c[j-d[i]]; 
						
				}
			}
	return c[n];
	}
	
	//not dp, general recursion
	public static int recursiveCoinChanges(int n, int d[],int k){
		int m;
		if(n==0) 
			return 0;
		else{
			
			m = 100000;
			for(int i=0;i<k;++i)
				if(n>=d[i])
					m = Math.min(m,recursiveCoinChanges(n-d[i],d,k))+1;
			}
			
	return m;
	}
	
	
	public static int zeroOneKnapSack(int v[],int w[], int C,int n){
		
		//w[0] = 0;
		//v[0] = 0;
		
		
		int mp[][] = new int[n+1][C+1];//max profit array
		int maxVal =0;
		
		//boundary cases
		for(int k=0;k<n;++k)
			mp[k][0] = 0; //all items with capacity 0 is zero.
		
		for(int k=0;k<C;++k)
			mp[0][k] = 0; //for all capacity with zero items is zero.
		
		//fill out the table
		for(int i=1;i<=n;++i){ //items
				
			for(int j=1;j<=C;++j){ //capacity
				if(w[i]>j) //adding current item overflows the capacity
					mp[i][j] = mp[i-1][j];
				else
					mp[i][j] = Math.max(mp[i-1][j], mp[i-1][j-w[i]]+v[i]); //do pass v[0] = 0
			}
		
		}
		
		for(int k=0;k<=C;++k)
			maxVal = Math.max(maxVal, mp[n][k]);
		
		return maxVal;
	}
	
	public static int recursiveCoinChangesDP(int n, int d[],int k){
		int c[] = new int[n];
		for(int i=0;i<n;i++){
			c[i] =100000;	
		}
		return recursiveCoinChangesDPHelper(n, d, k, c);
		}
	public static int recursiveCoinChangesDPHelper(int n, int d[],int k,int c[]){
		int m;
		//do not compute if value already there
		
		if(n==0) 
			return m=0;
		
		if(c[n-1]<100000)
			return c[n-1];
		
		else{
			
			m = 100000;
			for(int i=0;i<k;++i)
				if(n>=d[i])
					m = Math.min(m,recursiveCoinChangesDPHelper(n-d[i],d,k,c))+1;
			}
		c[n-1]=m;	
		return m;
	}
	
	public static int greedyCount(int n){
		
		if(n==0)
			return 0;
		else{
				int x = (n>=50)? 50 :(n>=25)? 25 : (n>=10)? 10 : (n>=5)? 5:1;
					return 1+greedyCount(n-x);
			}
	}
	
	
	static int contineusMaxSum(int num[]){
		int n = num.length;
		int sum[] = new int[n];
		sum[0] = num[0];
		if(sum[0]<0)
			sum[0] = 0;
		int maxSum = 0;
		for(int j=1;j<n;++j){
			sum[j] = (sum[j-1]+num[j]>0) ? sum[j-1]+num[j] : 0;
			maxSum = Math.max(maxSum, sum[j]);
		}
		
		return maxSum;
	} 
	
	
	
	static int rodCutting(int p[]){
		int n = p.length;
		int r[] = new int[n];
		r[0] = 0;
		int m ;
		for(int j=1;j<n;++j){
			m = 0;
			for(int i=1;i<=j;++i){
				m = Math.max(m,r[j-i]+p[i]);
			}
			r[j] = m;
		}
		
		return r[n-1];
	}
	
	static int longestIncreasingSubSequence(int a[]){
		//note solvable in O(n * log n) //see wikipedia
		//DP takes O(n^2)
		int n = a.length;
		int len[] = new int[n];
		len[0] = 1;
		int maxLen =0;
		for(int j=1;j<n;++j){
			maxLen =0;
			for(int i=0;i<j;++i){
				if(a[i]<a[j])
				maxLen = Math.max(maxLen, len[i]);
			}
		len[j] = maxLen+1;
		}
		maxLen =0;
		for(int l:len)
			maxLen = Math.max(maxLen, l);
		
		return maxLen;
	}
	
	static int maxWeightIndependantSet(int a[]){
		int n = a.length;
		int l[] = new int[n];
		l[0] = a[0];
		l[1] = a[1];
		int maxWeight =0;
		for(int j=2;j<n;++j)
		{
			l[j] = Math.max(l[j-2]+a[j], l[j-1]);
		}
		
		
		return l[n-1];
	}
	
	public static void main(String[] args) {
			int d[] = {1,5,10,15,25,50};
			//System.out.print(coinChangesDPBottomUp(7,d,6));
			//System.out.print(greedyCount(17));
			//System.out.print(recursiveCoinChangesDP(5,d,6));
			int p[] = {0,1,5,8,9,10,17};//,17,20,24,30};
			int q[] = p.clone();
		
			int n[] = {-1,0,2,-1,3,0,-1};
			int a[] = {1,-2,3,-1,4,1,2,3,4,-3,1,6,7,8};
			int l[] = {7,8,6,3,2};
			
			int w[] ={0,2,3,4,5};
			int v[] ={0,3,4,5,6};
			//System.out.print(rodCutting(p));
			//System.out.print(contineusMaxSum(n));
			//System.out.print(longestIncreasingSubSequence(a));
			//System.out.print(maxWeightIndependantSet(l));
			System.out.print(zeroOneKnapSack(v,w,5,4));
	}

}
