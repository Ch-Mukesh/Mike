
public class ThreadId {
	public static void main(String[] args) {
		
		Thread th1 = new Thread();
		Thread th2 = new Thread();
		
		System.out.println(th1.getName() + " " + th1.getId() + " " + th1.threadId());
		System.out.println(th2.getName() + " " + th2.getId() + " " + th2.threadId());
		
		Thread th3 = new Thread("Child");
		Thread th4 = new Thread("Child");
		
		System.out.println(th3.getName() + " " + th3.getId() + " " + th3.threadId());
		System.out.println(th4.getName() + " " + th4.getId() + " " + th4.threadId());
	/**/	
	}
}

