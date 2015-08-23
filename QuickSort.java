class QuickSort{



static void quickSort(int start, int end, int[] A){

if(start<end){

	int p = partition(start, end, A);

	quickSort(start, p-1, A);
	quickSort(p+1,end, A);

}


}


static int partition(int start, int end, int[] A){

//int p = (start+end)/2;
int pivot = A[end-1];

//pick random pivot, not the last or first because for sorted array
//it will take more time


int i=start-1;

for(int j=start; j<end-1; j++){

if(A[j]<=pivot){

i+=1;

//exchange any data
int temp = A[j];
A[i] = temp;
A[j] = A[i];
}

}
//exchange with pivot
int temp1 = A[end-1];
A[i+1] = temp1;
A[end-1] = A[i+1];



return i+1;
}



public static void main(String args[]){

int data[] = {4,2,1,3,6}; //new int[50];

quickSort(1,5,data);

for(int i=0; i<5;i++)
	System.out.print(data[i]+" ");

}



}

