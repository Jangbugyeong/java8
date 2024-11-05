package ch6;

import java.util.Scanner;

public class index {

	public static void main(String[] args) {
		int num[]= new int[10];
		Scanner scan=new Scanner(System.in);
		int i=0;
		while(i<num.length) {
			System.out.println("num["+i+"]=");
			 num[i]= scan.nextInt();
			 i++;
		}
		
		
		//int num[]= new int[3];
		//int num[]= {2,3,4,5,6,7};
		/*
		 * num[0]=10; num[1]=4; num[2]=7;
		 */
		System.out.println("----------------");
		for(int j=0;j<num.length; j++) {
			if(j%2==0)
				continue;
			else
			System.out.println("num["+j+"]="+num[j]);
		}

	}
}