
public class selectsort {
	
	public static void main(String[] args){
		int k;
		int[] arr={5,6,5,7,9,2,3,4};
		sortnow(arr);
		for(k=0;k<arr.length;k++){
			System.out.print(arr[k]+" ");
		}
	}
	
	public static void sortnow(int[] arr){ 
		int i,j,min,temp;
		for(i=0;i<arr.length-1;i++){
			min=i;
			for(j=i+1;j<arr.length;j++){
				if(arr[j]<arr[min]){
					min=j;
				}
			}
			temp=arr[min];  //swap
			arr[min]=arr[i];
			arr[i]=temp;
		}
	}

}
