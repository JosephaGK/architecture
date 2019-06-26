package sort;

/**
 * 归并排序
 */
public class MergeSort {
	public static void main(String[] args) {
		int[] arr = { 1, 4, 7, 8, 3, 6, 9 };
		sort(arr);
	}
	static void sort(int[] arr) {

	}

	static void merge(int[] arr) {
		int mid = arr.length / 2;
		int[] result = new int[arr.length];

		int i = 0;
		int j = mid + 1;
		int k = 0;
		while (i <= mid && j < arr.length) {
			/*if (arr[i] <= arr[j]) {
				result[k++] = arr[i++];
			} else {
				result[k++] = arr[j++];
			}*/
			//代码简写
			result[k++] = arr[i] <= arr[j] ? arr[i++] : arr[j++];
		}
		while (i <= mid) {
			result[k++] = arr[i++];
	}
		while (j < arr.length) {
			result[k++] = arr[j++];
		}
		print(result);
	}

	static void swap(int[] arr, int j, int i) {
		int temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;
	}

	static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
