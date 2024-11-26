package ch9;

public class lovetest {

	public static void main(String[] args) {
		Love love1=new Love("카리나",2024,"남이섬 종교때문에싸움",1,10);
		Love love2=new Love("asdf",2014,"어릴때친구",3,2);
		System.out.println(love1);
		System.out.println(love2);

	}

}
class Love{
	public Love(String name, int year, String story, int period, int level) {
		this.name=name;
		this.year=year;
		this.story=story;
		this.period=period;
		this.level=level;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getStory() {
		return story;
	}
	public void setStory(String story) {
		this.story = story;
	}
	public int getPeriod() {
		return period;
	}
	public void setPeriod(int period) {
		this.period = period;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	String name;
	int year;
	String story;
	int period;
	int level;
	@Override
	public String toString() {
		return "Love [name=" + name + ", year=" + year + ", story=" + story + ", period=" + period + ", level=" + level
				+ "]";
	}

	
	
}


