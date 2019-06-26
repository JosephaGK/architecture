package sort;

/**
 * 希尔排序
 */
public class ShellSort {
	public static void main(String[] args) {
		int[] arr = { 9, 6, 11, 3, 5, 12, 8, 7, 10, 15, 14, 4, 1, 13, 2 };
		sort(arr);
		print(arr);
	}

	static void sort(int[] arr) {
		//使用knuth序列进行间隔
		int h = 1;
		while (h<=arr.length/3){
			h = h*3+1;
		}
		for (int gap = h;gap>0;gap = (gap-1)/3){
			for (int j = gap; j < arr.length; j++) {
				for (int i = j; i > gap-1; i-=gap) {
					if(arr[i]<arr[i-gap]){
						swap(arr,i,i-gap);
					}
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
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
