package isp.violation.worker;

public class Manager implements Iwroker {

	@Override
	public void startWork() {
		System.out.println("started Work");
		
	}

	@Override
	public void stopWork() {
		System.out.println("Stopped Work");
		
	}

	@Override
	public void startEat() {
		System.out.println("Start Eating");
		
	}

	@Override
	public void stopEat() {
		System.out.println("Stop Eating");
		
	}

}
