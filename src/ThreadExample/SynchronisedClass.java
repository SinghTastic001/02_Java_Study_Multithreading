package ThreadExample;

class Resource{
	
	void printDetails() {
		synchronized (this) {

			for(int i=0; i<5; i++) {
				System.out.println(i);
			};
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

class Thr1 extends Thread{
	
	Resource resource;
	Thr1(Resource resource){
		this.resource = resource;
	}
	
	public void run() {
		resource.printDetails();
	}
	
	
}

class Thr2 extends Thread{
	
	Resource resource;
	
	Thr2(Resource resource){
		this.resource = resource;
	}
	
	public void run() {
		
		resource.printDetails();
	}
}

class Thr3 extends Thread{
	
	Resource resource;
	Thr3(Resource resource){
		
		this.resource = resource;
	}
	
	public void run() {
		this.resource = resource;
	}
}


public class SynchronisedClass {

	public static void main(String[] args) {
		
		Resource rs = new Resource();
		Thr1 t1 = new Thr1(rs);
		t1.start();
		
		Thr2 t2 = new Thr2(rs);
		t2.start();
		
		Thr3 t3 = new  Thr3(rs);
		t3.start();
	}
}
