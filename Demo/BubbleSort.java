package tong.com;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = { 10, 4, 20, 51, 19 };
		int temp;
		// 比较的轮数,即数组的长度
		for (int i = 0; i < arr.length - 1; i++) {
			// 每轮比较的次数
			for (int j = arr.length - 1; j > i; j--) {
				// 用最后一个数据跟前一个位置的数据进行比较，直到比较到i的位置
				if (arr[j] < arr[j - 1]) {
					/*
					 * =======		"<"代表降序
					 * =======      ">"代表升序
					 * */
					temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
