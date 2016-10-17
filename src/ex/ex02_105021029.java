package ex;

/*
 * Topic: 寫一個程式讓使用者輸入兩個正整數 n 與 m，然後顯示n x m 的乘法表，顯示完後問使用者是否繼續(Y/n) ，Y 可以重新輸入 n 則結束程式。
 * Date: 2016/10/17
 * Author: 105021029 汪元浩
 */
import java.util.Scanner;

public class ex02_105021029 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		while(true){
			int n= scn.nextInt(),m= scn.nextInt();
			for(int i = 1;i <=n;i++){
				for(int f = 1;f <=m;f++){
					System.out.print(i+"*"+f+"="+i*f+"\t");
				}
				System.out.println();
			}
				System.out.println("是否繼續(Y/n)");
				char a =scn.next().charAt(0);
				if(a!='Y'&& a!='y'){
					System.out.println("程式已結束");
					break;
					
				}
		}
		// TODO Auto-generated method stub

	}

}
