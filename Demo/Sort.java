package tong.com;

import java.util.Arrays;
import java.util.Scanner;

public class Sort {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] scores = { 45, 51, 84, 15, 25, 6 };
		int[] newScores = new int[scores.length + 1];

		System.out.println("==============����֮ǰ===========");
		// ����Щ�޹�������ݽ��������г���
		Arrays.sort(scores);
		for (int i = 0; i < scores.length; i++) {
			System.out.print(scores[i] + " ");
		}
		// 1.��ԭ������scores�е�ֵ���Ƶ�������newScores��
		for (int i = 0; i < scores.length; i++) {
			newScores[i] = scores[i];
		}
		// 2.����һ��Ҫ���������
		System.out.print("\n������Ҫ��������ݣ�");
		int num = scan.nextInt();
		scan.close();
		// 3.�ҵ�Ҫ�����λ��
		int index = newScores.length - 1;
		for (int i = 0; i < newScores.length; i++) {
			if (num < newScores[i]) {
				index = i;
				break;
			}
		}
		// 4.��������ӵ�����ռ����ԭ�ȵ����ݵ�λ�ã�����Ҫ��֮ǰ�����ݺ���
		for (int i = newScores.length - 1; i > index; i--) {
			newScores[i] = newScores[i - 1];
		}
		// 5.����������ݷ���index��λ����
		newScores[index] = num;
		System.out.println("==========����֮���ֵ=============");
		for (int i = 0; i < newScores.length; i++) {
			System.out.print(newScores[i] + " ");
		}
	}
}
