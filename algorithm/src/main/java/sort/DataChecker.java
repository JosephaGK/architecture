package sort;

import java.util.Arrays;
import java.util.Random;

/**
 * 对数器
 */
public class DataChecker {
	public static void main(String[] args) {
		boolean pass = true;
		for (int i = 0; i < 4; i++) {
			boolean check = check();
			if(!check){
				break;
			}
		}
		System.out.println(pass);
	}
	static int[] generateRandomArray(){
		Random random = new Random();
		int[] arr = new int[10000];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(10000);
		}
		return arr;
	}
	static boolean check(){
		int[] arr = generateRandomArray();
		int[] arr2 = new int[arr.length];
		System.arraycopy(arr,0,arr2,0,arr.length);

		Arrays.sort(arr);
//		SelectionSort.sort(arr2);
//		BubbleSort.sort(arr2);
//		InsertionSort.sort(arr2);
		ShellSort.sort(arr2);


		boolean same = true;
		for (int i = 0; i < arr2.length; i++) {
			if(arr[i]!=arr2[i]){
				same = false;
				break;
			}
		}
		return same;
	}
}
