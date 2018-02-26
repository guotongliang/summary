package tong.com;

public class SelectSort {
	public static void main(String[] args) {
		int[] arr = { 10, 4, 20, 25, 16 };
		int min;
		int temp;
		// 外层循环是从i的位置开始进行比较
		for (int i = 0; i < arr.length - 1; i++) {
			// 比较的次数
			min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[min] > arr[j]) {
					min = j;
				}
			}
			// 判断最小值的下标是否是初始值。
			if (min != i) {
				// 进行互换位置
				temp = arr[min];
				arr[min] = arr[i];
				arr[i] = temp;
			}
		}

		// 显示排序后的结果
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
