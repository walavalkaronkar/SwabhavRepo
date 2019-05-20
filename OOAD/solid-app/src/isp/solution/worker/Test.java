package isp.solution.worker;

public class Test {

	public static void main(String[] args) {
		attheWorkStation(new Robot());
		attheWorkStation(new Manager());
		
		//attheCateria(new Robot());
		attheCateria(new Manager());
		

	}
	
	public static void attheCateria(IEatable worker)
	{
		System.out.println("at the cateria");
		worker.startEat();
		worker.stopEat();
	}
	
	public static void attheWorkStation(IWorkable worker)
	{
		System.out.println("at the WorkStation");
		worker.startWork();
		worker.stopWork();
	}

}
