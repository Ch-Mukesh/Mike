
public class Test29_toString {
	public static void main(String[] args) {
		
		Thread th1 = new Thread();
		System.out.println("th1: "+th1); 
		//th1.toString() -> overridden -> STATE is printed
		System.out.println(th1.toString());// Thread[#14,Thread-0,5,main]

		
		Thread th2 = new Thread("Child-2");
		System.out.println("th2: "+th2);
		
		Thread th3 = Thread.currentThread();
        System.out.println("th3: "+th3);		
		th3.setPriority(7);
		
		Thread th4 = new Thread();
        System.out.println("th4: "+th4);	
	    
	}
}



//o/p:
// th1: Thread[#14,Thread-0,5,main]
// Thread[#14,Thread-0,5,main]
// th2: Thread[#15,Child-2,5,main]
// th3: Thread[#1,main,5,main]
// th4: Thread[#16,Thread-1,7,main]