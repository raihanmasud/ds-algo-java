import java.util.Arrays;


public class RotateArray {

	
	int[] rotate(int arr[], int pos){
		
		int count = 0;
		int candidate = arr[0], next = 0, temp=0;
		arr[0] = -1;
		
		while(count<arr.length){
			
			next = (next+pos)%arr.length;
			temp = arr[next];
			arr[next]=candidate ;
			candidate = temp;
			
			
			if(temp==-1){
				next++;
				candidate = arr[next];
				arr[next] = -1;
			}
			count++;
		}
		
		arr[next] = candidate;
		
		return arr;
	}
	
	private static int minInRotateArray(int arr[]){
		int start = 0;
		int end = arr.length -1;
		int mid =0;
		if(end==0) return arr[end];
		
		while(Math.abs(start-end)!=1){
			mid = (start+end)/2;
			
			if(arr[start]<arr[mid])
				start = mid;
			else
				end = mid;
		}
		
		return Math.min(arr[start],arr[end]);
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12};
		
		RotateArray ra = new RotateArray();
		int rarr[] = ra.rotate(arr, 3);
		
		//for(int a: rarr)
			//System.out.print(a+" ");
				
		int a[] = {4,5,6,1,2,3};
		
		System.out.print(minInRotateArray(a));
	}

	
	
}
