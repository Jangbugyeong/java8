package ch7;

public class ARRAY6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[]even= {2,4,6,8,10};
        int[]prime={2,3,5,7,11,13};
        int evensum=sum(even);
        int primesum=sum(prime);
        System.out.println(evensum);
        System.out.println(primesum);
	
	}
	public static int sum(int[]arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		return sum;
	}
}
