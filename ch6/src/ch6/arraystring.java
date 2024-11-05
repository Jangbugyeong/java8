package ch6;

public class arraystring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3};
       String[] game= {"starcraft","maple","valorant"};
       System.out.print("게임이름:");
       for(int i=0; i<game.length;i++) {
    	   System.out.print(game[i]+" ");
       }
       System.out.println(" ");
       System.out.print("등   수:");
       for(int i=0; i<arr.length;i++) {
    	   System.out.print("    "+arr[i]+"   ");
       }
	}

}
