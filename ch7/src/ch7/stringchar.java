package ch7;

public class stringchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "Program is fun! right ";
		char[] charr=str.toCharArray();
		int count=0;
		
		for(int i=0;i<charr.length;i++) {
			if(charr[i]=='R'||charr[i]=='r') {
				count++;
			}
		}
		System.out.println(str);
		System.out.println("r의 개수="+count);

	}

}
