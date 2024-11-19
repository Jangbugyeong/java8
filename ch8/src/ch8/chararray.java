package ch8;

public class chararray {

	public static void main(String[] args) {
		String name= "jangbugyeong";
		System.out.println("name:"+name);
        //char[]namearr= {'a','b'};
		char[]namearr2= {'a','b','c'};
		char[]namearr=name.toCharArray();
        for(int i=0;i<namearr.length;i++) {
        	System.out.println(namearr[i]);
        }
	}

}
