package tong.com;

public class SelectSort {
	public static void main(String[] args) {
		int[] arr = { 10, 4, 20, 25, 16 };
		int min;
		int temp;
		// ���ѭ���Ǵ�i��λ�ÿ�ʼ���бȽ�
		for (int i = 0; i < arr.length - 1; i++) {
			// �ȽϵĴ���
			min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[min] > arr[j]) {
					min = j;
				}
			}
			// �ж���Сֵ���±��Ƿ��ǳ�ʼֵ��
			if (min != i) {
				// ���л���λ��
				temp = arr[min];
				arr[min] = arr[i];
				arr[i] = temp;
			}
		}

		// ��ʾ�����Ľ��
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
