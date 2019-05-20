package isp.solution.worker;

public class Robot implements IWorkable{

	@Override
	public void startWork() {
		System.out.println("started work");
		
	}

	@Override
	public void stopWork() {
		System.out.println("stopped work");
		
	}
}
