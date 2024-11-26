package ch9;

public class object1 {

	public static void main(String[] args) {
		Car kia5=new Car("1234","kia","kia10",10000);
		kia5.run(30);
		String result=kia5.toString();
		System.out.println(result);
		//kia5.setcolor("red");
		//kia5.setmile(20000);
		 result=kia5.toString();
		
		

	}
}
class Car {
	private String no;
	@Override
	public String toString() {
		return "Car [no=" + no + ", company=" + company + ", color=" + color + ", mile=" + mile + "]";
	}


	private String company;
	private String color;
	private int mile;
	
	public Car() {no="0000";company="korea";color="white";}
	public Car(String no) {this.no=no;}
	public Car(String no,String company) 
	{this.no=no;this.company=company;this.color="black";}
	public Car(String no,String company,String color)
	{this.no=no;this.company=company;this.color=color;}
	public Car(String no,String company,String color,int mile) 
	{this(no,company,color);this.mile=mile;}


public void run(int speed) {
	System.out.println(speed+"km/h로 달림");
	
}
}
