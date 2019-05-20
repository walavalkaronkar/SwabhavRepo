package isp.violation.worker;

public class Robot implements Iwroker{

	@Override
	public void startWork() {
		System.out.println("started work");
		
	}

	@Override
	public void stopWork() {
		System.out.println("stopped work");
		
	}

	@Override
	public void startEat() {
		throw new RuntimeException();		
	}

	@Override
	public void stopEat() {
		throw new RuntimeException();
		
	}

}
