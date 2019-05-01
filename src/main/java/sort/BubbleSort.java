package sort;

/**
 * 冒泡排序 时间复杂度为n的平方
 * 优化后的时间复杂度为n
 */
public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = {5,3,6,8,1,7,9,4,2};
		sort(arr);
		print(arr);
	}
	static void sort(int[] arr){
		for (int length = arr.length; length > 0; length--) {
			for (int i = 0; i < length-1; i++) {
				if(arr[i]>arr[i+1]){
					swap(arr,i,i+1);
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
