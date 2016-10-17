package ex;

/*
 * Topic: 寫一個程式讓使多個正整數(包含0)直到使用者輸入-1 時停止，同時要顯示這些數字 總合 及 平均。
 * Date: 2016/10/17
 * Author: 105021029 汪元浩
 */
import java.util.Scanner;

public class ex01_105021029 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int sum = 0, v1 = scn.nextInt(), c = 0;
		while (v1 >= 0) {
			sum += v1;
			c++;
			v1 = scn.nextInt();
		}
		System.out.println(sum + "\n" + (float) sum / (float) c);

	}

}
