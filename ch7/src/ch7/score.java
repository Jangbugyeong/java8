package ch7;

public class score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String[]name= {"tom","kim","john"};
        int[]kor= {50,30,90};
        int[]math= {33,44,55};
        int i=0;
        System.out.print("name: ");
        for(i=0;i<name.length;i++)
        System.out.print(name[i]+" ");
        System.out.println("");
        System.out.print("kor: ");
        for(i=0;i<name.length;i++)
        System.out.printf("%3d  ",kor[i]);
        System.out.println("");
        System.out.print("math: ");
        for(i=0;i<name.length;i++)
        System.out.printf("%3d ",math[i]);
        System.out.println("");
        System.out.print("total: ");
        for(i=0;i<3;i++) {
        	int sum=0;
        	sum=math[i]+kor[i];
        	System.out.printf("%3d ",sum);
        }
        
	}

}
