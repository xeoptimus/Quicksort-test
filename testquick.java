package test;

public class testquick {
	public static void main(String[] args){
		Quicksort test=new Quicksort();
		int[] arr={5,7,9,7,7,3,6};
		int i;
		test.sortk(arr);
		for(i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}
