
public class mergesort {
	
	public static void main(String[] args){
		int k;
		int[] arr={5,6,5,7,9,2,3,4};
		mergesor(arr,arr.length);
		for(k=0;k<arr.length;k++){
			System.out.print(arr[k]+" ");
		}
	}
	
	public static void mergesor(int[] arr,int n){ 
		if(n>1){       //n=1 means the minimum element unable to divide 
			int mid=n/2;  //divide point
			int[] B=new int[mid];
			int[] C=new int[mid];
			int i=0;
			while(i<mid){
				B[i]=arr[i];
				C[i]=arr[mid+i];
				i++;      
			}//copy operation
			mergesor(B,B.length);  //sort part 1 recursively
			mergesor(C,C.length);  //sort part 2 recursively
			merge(B,C,arr);        //merge part 1 & part 2
		}
	}
	
	public static void merge(int[] B,int[] C,int[] arr){
		//CARD
		int Blen=B.length;
		int Clen=C.length;
		int i=0,j=0,k=0;
		while(i<Blen&&j<Clen){
			if(B[i]<C[j]){
				arr[k]=B[i];
				i++;
			}else{
				arr[k]=C[j];
				j++;
			}
			k++;
		}
		if(i==Blen){
			while(j<Clen){
				arr[k]=C[j];
				k++;
				j++;
			}
		}else{
			while(i<Blen){
				arr[k]=B[i];
				k++;
				i++;
			}
		}
	}
}
