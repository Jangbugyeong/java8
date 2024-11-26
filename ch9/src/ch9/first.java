package ch9;

import java.util.Scanner;

public class first {

	public static void main(String[] args) {
	     Scanner scan=new Scanner(System.in);
	     Cat whitecat=new Cat();
	     System.out.println(whitecat.name);
	     whitecat.claw(3);
	     Cat blackcat=new Cat("검은 고양이");
	     System.out.println(blackcat.name);
	     blackcat.claw(6);
	     
	     Cat yellowcat=new Cat("노란 고양이","먼치킨");
	     System.out.println(yellowcat.name+yellowcat.breeds);
	     yellowcat.claw(9);
	}

}
class Cat{
	String name;
	String breeds;
	double weight;
	public Cat() {name="하얀 고양이";}
	public Cat(String name) {
		this.name=name;
	}
	public Cat(String name,String breeds) {
		this.name=name;
		this.breeds=breeds;
	}
	public void claw() {
		System.out.println("할퀴기");
	}
    public void claw(int level) {
    	System.out.println(name+"가(이)"+level+"정도 할퀴기");
	}
}
