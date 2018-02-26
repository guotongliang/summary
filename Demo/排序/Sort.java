package tong.com;

import java.util.Arrays;
import java.util.Scanner;

public class Sort {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] scores = { 45, 51, 84, 15, 25, 6 };
		int[] newScores = new int[scores.length + 1];

		System.out.println("==============插入之前===========");
		// 将这些无规则的数据进行排序并列出来
		Arrays.sort(scores);
		for (int i = 0; i < scores.length; i++) {
			System.out.print(scores[i] + " ");
		}
		// 1.将原来数组scores中的值复制到新数组newScores中
		for (int i = 0; i < scores.length; i++) {
			newScores[i] = scores[i];
		}
		// 2.输入一个要插入的数据
		System.out.print("\n请输入要插入的数据：");
		int num = scan.nextInt();
		scan.close();
		// 3.找到要插入的位置
		int index = newScores.length - 1;
		for (int i = 0; i < newScores.length; i++) {
			if (num < newScores[i]) {
				index = i;
				break;
			}
		}
		// 4.由于新添加的数据占据了原先的数据的位置，所以要将之前的数据后移
		for (int i = newScores.length - 1; i > index; i--) {
			newScores[i] = newScores[i - 1];
		}
		// 5.将输入的数据放在index的位置上
		newScores[index] = num;
		System.out.println("==========插入之后的值=============");
		for (int i = 0; i < newScores.length; i++) {
			System.out.print(newScores[i] + " ");
		}
	}
}
