package hw;

import java.util.Scanner;

public class hw03_105021029 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int p = 0, n = 0, z = 0;
		int n1 = scn.nextInt();

		while (true) {
			while (n1 != 999) {
				if (n1 > 0) {
					p++;
				} else if (n1 < 0) {
					n++;
				} else if (n1 == 0) {
					z++;
				}
				n1 = scn.nextInt();	
			}
			System.out.println("正數有:"+p + "\t零有:"+z + "\t負數有:"+n);
			System.out.println("是否繼續(Y/n)");
			char a = scn.next().charAt(0);
			if (a == 'N' || a == 'n') {
				System.out.println("程式已結束");
				break;

			}
		}
		// TODO Auto-generated method stub
	}
}
