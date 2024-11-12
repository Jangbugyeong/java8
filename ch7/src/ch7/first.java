package ch7;
public class first {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[]arrd=new double[5];
		arrd[0]=1.23;
		arrd[1]=2.34;
		String[]grade= {"java","haha","math"};
		char c[]={'n','m'};
        int[] arr= {1,2,3,4,5,6,7};
        int i;
        arr[2]=5;
        for(i=0;i<arr.length;i++) {
        	System.out.println(arr[i]);
        }
        System.out.println(arr[2]);
	for(i=arr.length-1;i>=0;i--) {
    	System.out.println(arr[i]);
    }
    arr[2]=5;
    System.out.println(arr[2]);
}
}

