package ThreadExample;

class Thread1 extends Thread {


    // Overriding the run() method
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread1 " + i);
        }

        // Extra System.out.println to indicate the end of thread1
        System.out.println("Thread 1 finished.");
    }
};


class Thread2 extends Thread{
	
	public void run() {
		
		for(int i=0; i<5; i++) {
			System.out.println("thread2 "+i);
		};
		
		System.out.println("thread 2 finished");
	}
}

class Thread3 extends Thread{
	
	public void run() {
		
		for(int i=1; i<3; i++) {
			System.out.println("thread3 "+i);
		}
		System.out.println("thread 3 finished");
	}
}



public class ThreadProgram {

	public static void main(String[] args) {
		
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		Thread3 t3 = new Thread3();
		
		t1.start();
		t2.start();
		t3.start();
		
	}
}
