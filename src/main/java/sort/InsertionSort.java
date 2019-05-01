package sort;

public class InsertionSort {
	public static void main(String[] args) {
		int[] arr = {5,3,6,8,1,7,9,4,2};
		sort(arr);
		print(arr);
	}
	static void sort(int[] arr){
		for (int j = 1; j < arr.length; j++) {
			for (int i = j; i > 0; i--) {
				if(arr[i]<arr[i-1]){
					swap(arr,i,i-1);
				}
			}
		}
	}

	static void swap(int[] arr, int j, int i) {
		int temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;
	}

	static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
