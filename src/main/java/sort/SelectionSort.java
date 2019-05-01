package sort;

/**
 * 选择排序
 */
public class SelectionSort {
	public static void main(String[] args) {
		int[] arr = {5,3,6,8,1,7,9,4,2};
		//1.遍历一次选出最小值的位置，把最小值与第一个值互换位置
		/*
		int minPos = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i]<arr[minPos]) {
				minPos = i;
			}
		}
		int temp = arr[0];
		arr[0] = arr[minPos];
		arr[minPos] = temp;
		*/

		//2.一次遍历之后把除第一个后边的数当做一个新的新的数组再次重复
		//3.增加外层循环至最终结果
		/*
		for (int j = 0; j < arr.length; j++) {
			int minPos = j;
			for (int i = j+1; i < arr.length; i++) {
				if (arr[i]<arr[minPos]) {
					minPos = i;
				}
			}
			int temp = arr[j];
			arr[j] = arr[minPos];
			arr[minPos] = temp;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		*/

		//4.完成后精细化处理,提取代码，增加每次遍历的检验
		System.out.print("第0次遍历后数组情况：");
		print(arr);
		for (int j = 0; j < arr.length-1; j++) {
			int minPos = j;
			for (int i = j+1; i < arr.length; i++) {
				if (arr[i]<arr[minPos]) {
					minPos = i;
				}
			}
			System.out.print("第" + (j + 1) + "次遍历后数组情况：");
			swap(arr, j, minPos);
			print(arr);
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
