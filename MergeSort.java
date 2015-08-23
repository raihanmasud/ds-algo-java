class MergeSort{


static void mergeSort(int start, int end, int[] A){

if(start<end){

	int mid = (start+end)/2;
	mergeSort(start, mid, A);
	mergeSort(mid+1,end, A);
	merge(start, mid, end, A);
}

}


static void merge(int start, int mid, int end, int[] A){

int ln = mid-start+1;
int rn = end-mid;

int left[]  = new int[ln];
int right[] = new int[rn];

for(int i=0;i<ln; i++)
	left[i] = A[i+start-1];

for(int j=0;j<rn; j++)
	right[j] = A[mid+j];


int p=0,q=0;

for(int k=start; k<end; k++){

	if(left[p]<=right[q]){

		A[k] = left[p];
		p++;
	}

	else{

		A[k] = right[p];
		q++;
	}

}

}


public static void main(String args[]){

int data[] = {4,2,1,3,6}; //new int[50];

mergeSort(1,5,data);

for(int i=0; i<5;i++)
	System.out.print(data[i]+" ");

}





}