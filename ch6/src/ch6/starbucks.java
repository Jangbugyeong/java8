package ch6;

public class starbucks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //int[]coffee=new int[7];
       int[]coffee= {12,33,44,55,66,77,88};
       int sum=coffee[0]+coffee[1]+coffee[2]+coffee[3]+coffee[4]+coffee[5]+coffee[6];
       sum=0;
       for(int i=0; i<coffee.length;i++) {
    	   sum=sum+coffee[i];
       }
       System.out.println("총 커피 판매잔="+sum);
       System.out.println("총 커피 판매액="+sum*2000);
	}

}
