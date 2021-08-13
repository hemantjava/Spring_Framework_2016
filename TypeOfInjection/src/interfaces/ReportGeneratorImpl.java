package interfaces;

public class ReportGeneratorImpl implements Service {
	private ReportGenerator rg;
 //interface injection
	public void setRg(ReportGenerator rg) {
		this.rg = rg;
	}

	@Override
	public void showServics() {
		rg.generateReport();

	}

}
