package ch8;

import java.util.Scanner;

public class chararr {

	public static void main(String[] args) {
		int i=0;
		Scanner scan=new Scanner(System.in);
		char[]ch=new char[10];
		
		
		while(true) {
			System.out.println("문자입력");
			String str=scan.next();
			ch[i]=str.charAt(0);
			System.out.println(ch[i]+"  ");
			if(ch[i]=='r'||ch[i]=='R') {
				System.out.println("종료되었습니다.");
				break;
			}
			
		}

	}

}
