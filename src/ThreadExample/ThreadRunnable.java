package ThreadExample;

class Threads1 implements Runnable{

	@Override
	public void run() {
		
		for(int i=1; i<4; i++) {
			System.out.println("thread1 "+i);
		}	
	}	
}

class Threads2 implements Runnable{

	@Override
	public void run() {
		for(int i=1; i<4; i++) {
			System.out.println("thread2 "+i);
		}	
	}
}

class Threads3 implements Runnable{
	
	@Override
	public void run() {
		for(int i=1; i<4; i++) {
			System.out.println("thread3 "+i);
		}
	}
}


public class ThreadRunnable {

	public static void main(String[] args) {
		
		
		Threads1 t1 = new Threads1();
		Thread t = new Thread(t1);
		t.start();
		
		
		
		Threads2 t2 = new Threads2();
		Thread tr = new Thread(t2);
		tr.start();
		
		Threads3 t3 = new Threads3();
		Thread tr1 = new Thread(t3);
		tr1.start();
		
		
	}
}
