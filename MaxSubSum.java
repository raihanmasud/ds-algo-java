import static java.lang.System.out;

//Max subsequence sum
//Dynamic Programming

public class MaxSubSum {

	
	private static int getMaxSum(int arr[]){
		
		
		int sumEndingHere =0, maxSeenSoFar = 0, seqStartIndex = 0, seqEndIndex = 0;
		
		for(int i = 0; i< arr.length; i++ ){
			
			sumEndingHere += arr[i];
			
			
		if(sumEndingHere<0){
			sumEndingHere = 0;
			seqStartIndex =  i+1;
			seqEndIndex = i;//as it will be increased by one inside the next if
		}
		
		if(sumEndingHere>=maxSeenSoFar){
			maxSeenSoFar = sumEndingHere;
			seqEndIndex++;
		}
		
		}
		
		out.print(seqStartIndex+" "+seqEndIndex+" ");
		
		return maxSeenSoFar;
	}
	
	
	public static void main(String args[]){
		int arr[] = {1,2,-5,3,4,6};
		out.print(getMaxSum(arr));
		
	}
}
