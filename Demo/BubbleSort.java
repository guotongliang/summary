package tong.com;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = { 10, 4, 20, 51, 19 };
		int temp;
		// �Ƚϵ�����,������ĳ���
		for (int i = 0; i < arr.length - 1; i++) {
			// ÿ�ֱȽϵĴ���
			for (int j = arr.length - 1; j > i; j--) {
				// �����һ�����ݸ�ǰһ��λ�õ����ݽ��бȽϣ�ֱ���Ƚϵ�i��λ��
				if (arr[j] < arr[j - 1]) {
					/*
					 * =======		"<"������
					 * =======      ">"��������
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
