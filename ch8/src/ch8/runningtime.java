package ch8;

public class runningtime {

	public static void main(String[] args) {
		int even[]=new int[30];
		for(int i=0;i<30;i++) {
				even[i]=i;
		}
		int value=2;
        int evensum=sum(even,value);
        System.out.println("evensum:"+evensum);
        int sumodd=sum(even,1);
        System.out.println("sumodd:"+sumodd);
	}
	public static int sum(int[]arr, int v) {
		int sum=0;
		for(int i=0; i<arr.length;i++) {
			if(i%v==0)
			sum+=arr[i];
		}
		return sum;
	}
}
