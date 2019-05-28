
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReportGeneratorFacade reportGeneratorFacade = new ReportGeneratorFacade();
        
        reportGeneratorFacade.generateReport(ReportType.HTML, null);
         
        reportGeneratorFacade.generateReport(ReportType.PDF, null);
	}

}
