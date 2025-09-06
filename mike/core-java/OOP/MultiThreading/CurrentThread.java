
/**
 * public static Thread currentThead();
 * ========================================
 * 	- This method is used for retrieving currently running thread objects reference 
 *
 *  - It means, this method returns the thread object reference in which 
 *    the main method or user defined method logic is running
 *  
 *  - We must call this method in the main method or in the run method or in any user 
 *    defined method in which we want to obtain the currently running thread object reference
 *    
 *  - Generally we will use this method to retrieve the thread object reference 
 *    that we did not create or that we do not have access
 *    
 *  - For example, 
 *      - We did not create 'main' thread object, 
 *      - If you want access main Thread  object, 
 *        we must call currentThread() method inside main method
 *        or in any one of the methods calling from main method
 *        
 *   - Another example 
 *   	- If we want to know in which custom thread our user defined method is executing, 
 *        we must call currentThread() method in this user defined method            
 *     
 *   - Once we obtain currently running thread object reference, either main thread or 
 *     user defined thread, we can call thread class methods on this retrieved thread object 
 *     either for reading or for changing its properties
 *     
 *   - We must call above method by using class name Thread
 *   		Thread th = Thread.currentThread();
 *   
 *   - Below statement we must use for retrieving CRTO name
 *   		String name = Thread.currentThread().getName();
 *      
 *   - Below program explains the main thread object reference
 *      reading and changing main thread name and priority values
 *            
 *            
 */
public class CurrentThread {
	public static void main(String[] args) {
		
		Thread th1 = Thread.currentThread();
		
		System.out.println(th1.getName());
		System.out.println(th1.getPriority());
		System.out.println();
		
		th1.setName("xyz-main");
		th1.setPriority(9);
		
		System.out.println(th1.getName());
		System.out.println(th1.getPriority());
		System.out.println();
				
		Abc.m1();
		
		
		/*
		MyThread19 mt1 = new MyThread19();
		mt1.start();
		/*	
//		mt1.run();
		System.out.println();
		
		MyThread19 mt2 = new MyThread19();
//		mt2.start(); //-> run() method is loaded and executed in CT 		
						//-> CTO -> Thread-1
						//-> CRTO -> Thread-1
		
//		mt2.run(); 	//-> run() method is now loaded and executed in main thread	
						//-> CTO 	-> Thread-1
						//-> CRTO 	-> main
		
		MyRunnable19 mr = new MyRunnable19();
		mr.run();		//CRTO -> main
		
		Thread th2 = new Thread(mr);
		th2.run();		//CRTO -> main
		th2.start();	//CRTO -> Thread-0
		
		/**
		 * Q1) What is the diff b/w current thread object and currently running thread object?
		 * 		- The object using which we called the run() or start() is called CTO
		 * 		- The Thread in which our logic is executed             is called CRTO
		 * 
		 * Q2) What is the difference between 
		 * 			1. th.getName()/this.getName()      ---> CTO  reference
		 * 			2. Thread.currentTherad().getName()	---> CRTO reference
		 * 
		 */
	}
}

/**
 * Below code explains obtaining current thread object in user defined method 
 */
class Abc {
	
	static void m1() {
		
		Thread th = Thread.currentThread();
		String name = th.getName();
		
		if(name.contains("main"))
			System.out.println("Hi "+ name);
		
		else if(name.contains("Thread")) 
			System.out.println("Hello "+ name);	
	}
}

class MyThread19 extends Thread {
	@Override
	public void run() {
		Abc.m1();

		System.out.println(this.getName());						//CTO name
		System.out.println(Thread.currentThread().getName());	//CRT object name
	}
}

class MyRunnable19 implements Runnable {
	@Override
	public void run() {
		//System.out.println(this.getName());					//CE: 
		System.out.println(Thread.currentThread().getName());	//CRT object name
		
	}
}

