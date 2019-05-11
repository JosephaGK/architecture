package sort;

/**
 * 计数排序
 * 适用于数据量大但是每个值的取值范围比较小
 * @author Joseph
 */
public class CountSort {
	public static void main(String[] args) {
		int[] arr = {5,3,6,8,5,3,6,8,7,9,4,8,7,9,4,8,7,9,4,2};
		int[] result = sort(arr);
		print(result);
	}
	static int[] sort(int[] arr){
		int[] result = new int[arr.length];
		int[] count = new int[10];

		for (int i = 0; i < arr.length; i++) {
			count[arr[i]]++;
		}
		print(count);

		//此方法排序不稳定
//		for (int i = 0,j=0; i < count.length; i++) {
//			while (count[i]-->0){
//				result[j++] = i;
//			}
//		}
		//此方法排序稳定
		for (int i = 1; i < count.length; i++) {
			count[i] = count[i]+count[i-1];
		}
		for (int i = arr.length-1; i >= 0; i--) {
			result[--count[arr[i]]] = arr[i];
		}
		return result;
	}

	static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
