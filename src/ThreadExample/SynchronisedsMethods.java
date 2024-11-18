package ThreadExample;

class Resource1{
	
  synchronized	void printDetails() {
		
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

class Thrs1 extends Thread{
	
	Resource1 resource;
	Thrs1(Resource1 resource){
		this.resource = resource;
	}
	
	public void run() {
		resource.printDetails();
	}
	
	
}

class Thrs2 extends Thread{
	
	Resource1 resource;
	
	Thrs2(Resource1 resource){
		this.resource = resource;
	}
	
	public void run() {
		
		resource.printDetails();
	}
}

class Thrs3 extends Thread{
	
	Resource1 resource;
	Thrs3(Resource1 resource){
		
		this.resource = resource;
	}
	
	public void run() {
		this.resource = resource;
	}
}


public class SynchronisedsMethods {

	public static void main(String[] args) {
		
		Resource1 rs = new Resource1();
		Thrs1 t1 = new Thrs1(rs);
		t1.start();
		
		Thrs2 t2 = new Thrs2(rs);
		t2.start();
		
		Thrs3 t3 = new Thrs3(rs);
		t3.start();
		
	}
}
