
public class ThreadName {
	public static void main(String[] args) {
		
		Thread th1 = new Thread();
		System.out.println(th1.getName());
		
		Thread th2 = new Thread("Child-2");
		System.out.println(th2.getName());
		
		Thread th3 = new Thread();
		System.out.println(th3.getName());
		
		th3.setName("Child-4");
		System.out.println(th3.getName());
		
		Thread th4 = new Thread();
		System.out.println(th4.getName());
//==========================================================
		Thread th5 = new Thread("Worker");
		Thread th6 = new Thread("Worker");
		
		System.out.println(th5.getName());
		System.out.println(th6.getName());
//==========================================================
		Thread th7 = new Thread();
		Thread th8 = new Thread();
		th7.setName("Driver");
		th8.setName("Driver");
		
		System.out.println(th7.getName());
		System.out.println(th8.getName());
	//==========================================================
		
		MyThread18 mt1 = new MyThread18();
		mt1.setName("Runner");

		MyThread18 mt2 = new MyThread18();
		mt2.setName("Runner");
    
	//==========================================================
		
		MyThread18 mt3 = new MyThread18("Runner");
		MyThread18 mt4 = new MyThread18("Runner");
		
		mt3.start();
		mt4.start();
	//==========================================================

	}
}

class MyThread18 extends Thread {
	public MyThread18() {
		super();

	}
	
	public MyThread18(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		for(int i=1; i<=20; i++) {
			System.out.println(getName() + " run: "+ i);
		}
	}
}