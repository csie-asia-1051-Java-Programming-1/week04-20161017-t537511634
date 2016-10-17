package hw;

import java.util.Scanner;

public class hw02_1050210XX {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n =scn.nextInt(),m =scn.nextInt();
		float v1= n,v2 =1;
		for(int i = 1;i <m;i++){
			v1 *= (--n);
		}
		for(int i = 2;i <=m;i++){
			v2 *= i;
		}
		System.out.println(v1/v2);
		// TODO Auto-generated method stub

	}

}
