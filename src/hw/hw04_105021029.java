package hw;

import java.util.Scanner;

public class hw04_105021029 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int c = scn.nextInt();
		switch (c) {

		case 1:
			System.out.println("請輸入 n:");
			int n = scn.nextInt(), m = 2, a = n - (n / 2), j = a;
			for (int i = 1; i <= a; i++) {
				for (int f = 1; f <= j; f++) {
					System.out.print("@");
				}
				j--;
				System.out.println();
			}
			for (int i = 2; i <= a; i++) {
				for (int f = 1; f <= m; f++) {
					System.out.print("@");
				}
				m++;
				System.out.println();
			}
			break;
		case 2:
			System.out.println("請輸入 n:");
			n = scn.nextInt();
			m = 1;
			a = n - (n / 2);
			j = a - 1;
			for (int i = 1; i <= a; i++) {
				for (int f = 1; f <= m; f++) {
					System.out.print("%");
				}
				m++;
				System.out.println();
			}
			for (int i = 1; i <= a - 1; i++) {
				for (int f = 1; f <= j; f++) {
					System.out.print("%");
				}
				j--;
				System.out.println();
			}
			break;
		case 3:
			System.out.println("請輸入 n:");
			n = scn.nextInt();
			m = 1;
			a = n - (n / 2);
			j = n;
			int a2 = n - (n / 2),a3 = n - (n / 2);
			for (int i = 1; i <= a; i++) {
				for(int i1=1;i1<a2;i1++) {
					System.out.print(" ");
				}
				for (int f = 1; f <= m; f++) {
					
					System.out.print("#");					
				}
				a2--;
				m += 2;
				System.out.println();
			}
			for (int i = 1; i <= a; i++) {
				for(int i1=1;i1<i+1;i1++) {
					System.out.print(" ");
				}
				for (int f = 1; f <= n-2; f++) {		
					System.out.print("#");
					
				}
				n -= 2;
				System.out.println();
			}
			break;
		case 4:
			System.out.println("結束程式");
			break;

		}
		// TODO Auto-generated method stub

	}

}
