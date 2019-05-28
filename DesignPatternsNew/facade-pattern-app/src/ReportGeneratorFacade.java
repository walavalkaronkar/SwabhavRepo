
public class ReportGeneratorFacade {

	public static void generateReport(ReportType type, String location) {
		if (type == null ) 
		{
			System.out.println("type is null");
		}
		else
		{
			Report report = new Report();
			report.setHeader(new ReportHeader());
			report.setFooter(new ReportFooter());
			report.setData(new ReportData());
			ReportWriter writer = new ReportWriter();
			switch (type) 
			{
				case HTML:
					writer.writeHtmlReport(report, location);
					break;
				case PDF:
					writer.writePdfReport(report, location);
					break;
			}
		}
	}
}
