package ThreadExample;

class T1 extends Thread{
	
	public void run() {
		
		for(int i=0; i<5; i++) {
			System.out.println("thread 1 "+i);
//			Thread.yield();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}

class T2 extends Thread{
	
	public void run() {
		for(int i=1; i<5; i++){
			System.out.println("thread 2 "+i);
		}
	}
}

public class YieldExample {

	public static void main(String[] args) {
		
		T1 t = new T1();
		t.start();
		T2 t2 = new T2();
		t2.start();
	}
}
