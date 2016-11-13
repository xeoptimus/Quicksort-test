
public class insertionsort {

	public static void main(String[] args) {
		int k;
		int[] arr = { 5, 6, 5, 7, 9, 2, 3, 4, 11, 2, 0 };
		insertsor(arr);
		for (k = 0; k < arr.length; k++) {
			System.out.print(arr[k] + " ");
		}
	}

	public static void insertsor(int[] arr) {
		int i, j, temp;
		// presume the first element is in order
		// COMPARE ORDER : current elem back to first elem
		// temp is the inserted element,so arr[j]>temp means current element
		// should move behind
		for (i = 1; i < arr.length; i++) {
			temp = arr[i];
			j = i - 1;

			while (j >= 0 && arr[j] > temp) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = temp;
		}
	}

}
