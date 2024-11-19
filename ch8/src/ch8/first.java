package ch8;
public class first {
	public static void main(String[] args) {
		String[]name= {"tom","kim","jun","lee","bug","abc"};
        int[]kor= {50,30,90,55,77,66};
        int[]math= {33,44,55,66,77,88};
        int[]avg=new int[6];
        int i=0;
        int[] sum=new int[6];
        int sum2=0;
        
        for(i=0;i<name.length;i++) {
        	sum[i]=math[i]+kor[i];
        	avg[i]=(math[i]+kor[i])/2;
	}
        System.out.println("no   name  kor  math  total  avg");
        System.out.println("=================================");
        for(i=0;i<name.length;i++) {
        System.out.printf("%-3d  %3s %3d   %3d    %3d    %d\n",
        			(i+1),name[i],kor[i],math[i],sum[i],avg[i]);
        }
        int mathsum=0,korsum=0,totalsum=0,avgsum=0;;
        for(i=0;i<6;i++) {
        	sum2=0;
        	mathsum+=math[i];
        	korsum+=kor[i];
        	totalsum+=sum[i];
        	avgsum+=avg[i];
        }
        System.out.println("=================================");
        System.out.print("전체총점: ");
        System.out.printf(" %3d   %3d   %4d   %3d  ",
        		korsum,mathsum,totalsum,avgsum/6);
	}
	}

