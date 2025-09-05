
public class Daemon {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("main start");

		Thread th = Thread.currentThread();
		System.out.println("main daemon thread is: "+ th.isDaemon());

		boolean daemon = th.isDaemon();
		if(daemon) 
			System.out.println("main thread is a daemon thread");
		else
			System.out.println("main thread is a non-daemon thread");
			
		System.out.println("main thread is a "+ (th.isDaemon()? "daemon" : "non-daemon") + " thread");
	//=========================================================	
		MyThread20 mt = new MyThread20();
		System.out.println("\nThread-0 is a daemon thread: "+ mt.isDaemon());

		mt.setDaemon(true);
		System.out.println("is Thread-0 daemon thread: "+ mt.isDaemon());

		mt.start();
		
	//	mt.setDaemon(true);  //RE: ITSE

	//=========================================================	
		MyThread21 mt1 = new MyThread21();
		mt1.setName("MyThread21");
	//	mt1.setDaemon(true);
		mt1.start();
		
	//	Thread.sleep(200);  //for pausing main thread for allowing daemon threads to completed
/**/			
		System.out.println("main end");
	}
}

class MyThread20 extends Thread {
	@Override
	public void run() {
		System.out.println("run start");
		for(int i=1; i<=20; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\nrun end");
	}
}

class MyThread21 extends Thread {
	@Override
	public void run() {
		System.out.println(
			this.getName() + " is started as " + 
				(this.isDaemon() ? "daemon" : "non-daemon") + " thread") ;
		
		MyThread22 mt2 = new MyThread22();
		mt2.setName("MyThread22");
		mt2.start();
	}
}

class MyThread22 extends Thread {
	@Override
	public void run() {
		System.out.println(
			this.getName() + " is started as " + 
				(this.isDaemon() ? "daemon" : "non-daemon") + " thread") ;
	}
}


//Daemon is supporting thread which performs in background
//Non Daemon is for foreground 
//Jvm always waits for non Daemon Threads execution completion after it terminates