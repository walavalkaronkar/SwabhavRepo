package isp.violation.worker;

public class Test {

	public static void main(String[] args) {
		attheWorkStation(new Robot());
		attheWorkStation(new Manager());
		
		attheCateria(new Robot());
		attheCateria(new Manager());
		

	}
	
	public static void attheCateria(Iwroker worker)
	{
		System.out.println("at the cateria");
		worker.startEat();
		worker.stopEat();
	}
	
	public static void attheWorkStation(Iwroker worker)
	{
		System.out.println("at the WorkStation");
		worker.startWork();
		worker.stopWork();
	}

}
