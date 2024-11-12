package ch7;

public class ARRAYfunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]point= {10,20,30,40,50};
		int i;
		int read=average(point);
		for(i=0;i<point.length;i++) {
        	System.out.println(point[i]);
        }
		System.out.println(read);
	}
    public static int average(int arr[]) {
    	int sum=0;
    	for(int i=0;i<arr.length;i++) {
    		sum=sum+arr[i];
    	}
    	arr[0]=100;
	return sum/arr.length;
}
}
