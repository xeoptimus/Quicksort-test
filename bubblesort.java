
public class bubblesort {
	
	public static void main(String[] args){
		int k;
		int[] arr={5,6,5,7,9,2,3,4};
		sortnow(arr);
		for(k=0;k<arr.length;k++){
			System.out.print(arr[k]+" ");
		}
	}
	
	public static void sortnow(int[] arr){
		int i,j,temp;
		for(i=0;i<arr.length;i++){
			for(j=0;j<arr.length-i-1;j++){
				if(arr[j]>arr[j+1]){
					temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
		    }
	    }
	}
}
