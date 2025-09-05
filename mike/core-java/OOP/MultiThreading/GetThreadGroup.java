 class GetTheradGroup {
	public static void main(String[] args) {
		
		Thread 		th1 = Thread.currentThread();
		ThreadGroup tg1 = th1.getThreadGroup();
		
		System.out.println(th1.getName());	//thread name
		System.out.println(tg1.getName());	//thread group name
		System.out.println();
		
	//=========================================================
		Thread th2 = new Thread();
		Thread th3 = new Thread();
		
		System.out.println(th2.getThreadGroup().getName()); //th2 thread's group name
		System.out.println(th3.getThreadGroup().getName()); //th3 thread's group name
		System.out.println();
		
	//=========================================================
		
		ThreadGroup groupA = new ThreadGroup("GroupA");
		Thread th4 = new Thread(groupA, "Child1");
		Thread th5 = new Thread(groupA, "Child2");
		
		System.out.println(
			th4.getName() + "  " + th4.getThreadGroup().getName()
		);

		System.out.println(
			th5.getName() + "  " + th5.getThreadGroup().getName()
		);
		System.out.println();
		
	//=========================================================

		Thread th6 = new Thread(groupA, "Worker");
		System.out.println(th6.getName());
		System.out.println(th6.currentThread().getName()); //CurrentRunning Thread
		System.out.println(th6.currentThread().getThreadGroup().getName());
		System.out.println(th6.getThreadGroup().getName());
		
		//=========================================================
		
/**/		
	}}