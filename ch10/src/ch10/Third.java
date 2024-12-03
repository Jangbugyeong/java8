package ch10;

public class Third {

	public static void main(String[] args) {
		Account a=new Account("123-45",10000);
		Account b=new Account("678-90",10000);
		a.tostr();
		b.tostr();
	}

}
class Account{
	String num;
	int money;
	Account(String num,int money){
		this.num=num;
		this.money=money;
	}
	public void transfer(Account account,int money) {
		account.money=money;
	}
	public void tostr() {
		System.out.println("name:"+this.num+", balance:"+money);
	}
}





class Food{
	String name;
	int price;
	Food(String name, int price){
		this.name=name;
		this.price=price;
	}
	Food(){
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}