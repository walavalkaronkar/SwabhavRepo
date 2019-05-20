package isp.solution.worker;

public interface IWorker extends IEatable,IWorkable {

	public void startWork();
	public void stopWork();
	public void startEat();
	public void stopEat();
}
