﻿package ex;
/*
 * Topic: 讓使用者輸入 一個正整數 n 及一個字元符號，然後顯示出下列圖形 (例 n = 4,字元符號= @)
    @@@@
    @@@  
    @@  
    @
 * Date: 2016/10/17
 * Author: 105021029 汪元浩
 */

import java.util.Scanner;

public class ex04_105021029 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("輸入 一個正整數 n");
		int n = scn.nextInt();
		int m =n;
		for(int i = 1;i <=n;i++){
			for(int f = 1;f <=m;f++){
				System.out.print("*");					
			}
			m--;
			
			System.out.println();
		}

		// TODO Auto-generated method stub

	}

}
