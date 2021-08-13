package bean;
public class PDFReportGenerator implements ReportGenerator{
	@Override
	public void generateReport() {
		System.out.println("PDF report generator...");
		System.out.println("configure in parent xml");
	}

}
