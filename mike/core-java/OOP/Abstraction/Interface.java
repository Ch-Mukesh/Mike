// abstract class Vehicle {
// 	abstract void start();
// 	abstract void move();
// 	abstract void stop();
// }

// abstract class Software {
// 	abstract void design();
// 	abstract void develop();
// 	abstract void test();
// 	abstract void run();
// }

// class Tata extends Vehicle, Software {	//Not allowed

// }

interface Vehicle {
	abstract void start();
	abstract void move();
	abstract void stop();
}

interface Software {
	abstract void design();
	abstract void develop();
	abstract void test();
	abstract void deliver();
}

class Tata implements Vehicle, Software {	

	public void start()		{ }
	public void move()		{ }
	public void stop()		{ }
						
	public void design()	{ }
	public void develop()	{ }
	public void test()		{ }
	public void deliver()	{ }
}

class TataOffice {
	public static void main(String[] args) {
		
			//Vehicle customer is using Tata object as Vehicle type object
			Vehicle vehicle = new Tata();
			vehicle.start();
			vehicle.move();
			vehicle.stop();

			//Software customer is using Tata object as Software type object
			Software software = new Tata();
			software.design();
			software.develop();
			software.test();
			software.deliver();

	}
}


