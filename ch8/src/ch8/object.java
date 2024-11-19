package ch8;

public class object {

	public static void main(String[] args) {
		job samsung=new job();
        System.out.println(samsung.pay+":"+samsung.distance);
        job lg=new job();
        System.out.println(lg.pay+":"+lg.distance);
	}
	}

    class job{
    	int pay;
    	int distance;
    	public job() {
    		pay=300;
    		distance=30;
    	}
    	
    }

