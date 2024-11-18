package ThreadExample;

class TT1 extends Thread{
	
	public void run() {
		for(int i=1; i<5; i++) {
			System.out.println("thread 1 "+i);
			
		}
	}
}

class TT2 extends Thread{
	
	public void run() {
		for(int i=1; i<5; i++) {
			System.out.println("thread 2 "+i);
		}
	}
}

public class JoinExample {

	public static void main(String[] args) throws InterruptedException {
		
		TT1 t = new TT1();
		TT2 t2 = new TT2();
		t.join();
		
		t.start();
		t2.start();
		
		
	}
}
