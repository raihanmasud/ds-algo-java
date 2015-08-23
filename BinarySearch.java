
public class BinarySearch {

	
	private int BinarySearch(int start, int end, int arr[], int item){
		
		//could not find item, but searched all array elements		
		if(start>end)return -1;
		
		int mid = (start+end)/2;
		
		if (item==arr[mid])
			 return mid;
		if (item<arr[mid]) 
			 return BinarySearch(start, mid-1, arr, item);
		else  
			 return BinarySearch(mid+1, end, arr, item);
		
		
		
	}
	
	private static int iterativeBS(int list[], int target){
		int first = 0;
		int last = list.length-1;
		
		int mid =0;
			
			while ( first <= last )
		    {
		        mid = (first + last) / 2;
		        if ( list[mid] == target )
		            return mid;
		        if ( list[mid] > target )
		            last = mid - 1;
		        else    first = mid + 1;
		    }
		    return -1;
		}
	
	
	

	public static void main(String args[]){
		int arr[] ={2,2,3};
		BinarySearch bs = new BinarySearch();
		//System.out.println(bs.BinarySearch(0,6,arr, 7));
		System.out.println(iterativeBS(arr, 0));
		
	}
	
}
