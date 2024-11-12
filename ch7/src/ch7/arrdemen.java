package ch7;

public class arrdemen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[][]gugudan=new int [10][10];
        for(int i=2; i<10; i++) {
        	for(int j=1;j<10;j++) {
        		gugudan[i][j]=i*j;
        		System.out.printf("%2d ",gugudan[i][j]);
        	}
        	System.out.println(" ");
        }
	}

}
