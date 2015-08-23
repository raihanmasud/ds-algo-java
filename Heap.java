
	
public class Heap {

	//priority queue can be built using buildHeap()
	//after extracting max i.e. root, maxHeapify() the array 

	
	//array input as binary tree property
	public Heap(){
		
	}
	
	
	
	public void maxHeapify(int arr[],int i){
		//heapify arr[i], l = leftChildIndex , r = rightChildIndex
		int l = 2*i+1;
		int r = 2*i+2;
		int largest = i;
		//identify the position where the element is max 
		if(l< arr.length )//check if left child is present
			if( arr[l]>arr[i])
				largest = l;
				
		if(r< arr.length)//check if right child is present
			if(arr[r]>arr[largest])
				largest = r;
		
		//child is bigger, exchange arr[largest] with arr[i]
		if(largest!=i)
		{
			int temp = arr[largest];
			arr[largest] = arr[i];
			arr[i] = temp;
			//do maxHeapifiy with other elements
			maxHeapify(arr,largest);
		}
	}
	
	
	public void buildMaxHeap(int arr[]){
		//starting from the leaves level to heapify is enough
		//bottom up heapify
		for(int i=arr.length/2;i>=0;i--)
			maxHeapify(arr,i);
		}
}
