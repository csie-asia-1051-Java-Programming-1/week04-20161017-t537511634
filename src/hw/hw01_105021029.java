package hw;

import java.util.Scanner;

public class hw01_105021029 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int v1= 0,v2= 0,n= scn.nextInt();
		int []m = new int [n];
		for(int i =0;i<n;i++){
		if(i<2){
			m[0]=1;
			m[1]=1;
		}else if(i>=2){
			 
				m[i]=m[i-2]+m[i-1];
			}
		System.out.print(m[i]+"\t");
		}
		
		// TODO Auto-generated method stub

	}

}
