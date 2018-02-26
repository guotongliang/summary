package tong.com;

public class DoubleArray {
	public static void main(String[] args) {
		int[] one = { 1, 2, 3 };
		int[] two = { 4, 5 };
		// 1.定义二维数组(两个数组中的元素个数不同)
		// a
		int[][] arr = new int[2][];
		arr[0] = one;
		arr[1] = two;

		// b
		int[][] arr2 = new int[2][];
		arr2[0] = new int[2];
		arr2[0][0] = 1;
		arr2[0][1] = 2;

		arr2[1] = new int[3];
		arr2[1][0] = 11;
		arr2[1][1] = 22;
		arr2[1][2] = 33;

		// 2.定义二位数组(两个数组中的元素个数相同)
		int[][] arr1 = new int[2][3];
		arr1[0][0] = 20;
		arr1[0][1] = 30;
		arr1[0][2] = 40;

		arr1[1][0] = 2;
		arr1[1][1] = 3;
		arr1[1][2] = 4;

		// 静态赋值方式
		int[][] scores = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 12, 51 } };
		int[][] scores1 = new int[][] { { 1, 2 }, { 3, 5, 7 } };

		// 二维数组的取值
		// 外循环的是二维数组的值
		for (int i = 0; i < arr.length; i++) {
			// 内循环的是一维数组的值
			for (int j = 0; j < arr[i].length; j++) {//这里需要注意的是哪个数组的长度
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
