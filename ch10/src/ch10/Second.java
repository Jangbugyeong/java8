package ch10;

public class Second {

	public static void main(String[] args) {
		int[] numbers= {65,74,23,75,68,96,88,98,54};
		int secondtop=getSecondTopldx(numbers);
		System.out.println("두번째로 큰 수: "+secondtop);

	}
     private static int getSecondTopldx(int[] nums) {
    	 int top=nums[0];
    	 int topindex=0;
    	 for(int i=1; i<nums.length;i++) {
    		 
    		 if(top<nums[i])
    			 top=nums[i];
    		 topindex=i;
    	 }
    	 int secondtop=0;
    	 
    	 for(int i=1;i<nums.length;i++) {
    		 if(i==topindex)
    			 continue;
    		 if(secondtop<nums[i]) {
    			 secondtop=nums[i];
    		 }
    	 }
    	 return secondtop;
     }
}
