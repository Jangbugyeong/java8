package ch10;

public class First {

	public static void main(String[] args) {
		int[][]arr= {
				{1,2,3,4,5},{6,7,8,9,0},{10,20,30,40,50}
		};
		System.out.println(arr[1][3]);
         double[]a= {3.45,2.82,3.85,3.94};
         
         
         
         
         String s="programming is fun! right?";
         int[] result=count(s);
         System.out.println("자음 "+result[0]+"개, 모음"+result[1]+"개");
	}
     public static int[]count(String s) {
    	 int[] arr=new int[2];
    	 char[]ch=s.toCharArray();
    	 for(int i=0;i<ch.length;i++) {
    		 switch(ch[i]) {
    		 case 'a':
    		 case 'e':
    		 case 'i':
    		 case 'o':
    		 case 'u':
    		 case 'A':
    		 case 'E':
    		 case 'I':
    		 case 'O':
    		 case 'U':
    			 arr[1]+=1;
    			 break;
    			 default:
    				 arr[0]+=1;
    				 
    			 
    		 }
    		 System.out.print(ch[i]+" ");
    		 if(ch[i]=='A'|| ch[i]=='a'|| ch[i]=='E'||ch[i]=='e'||ch[i]==
    				 'O'||ch[i]=='o'||ch[i]=='i'||ch[i]=='I'||
    						 ch[i]=='U'||ch[i]=='u') {
    			 arr[1]=arr[1]+1;
    		 }else {
    			 arr[0]=arr[0]+1;
    		 }
    	 }
    	 return arr;
     }
}
