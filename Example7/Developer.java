package Example7;

public class Developer extends Employee {

	public Developer(String name, String address, long salary, String title) {
		super(name, address, salary, title);
		
		
	}

	@Override
	public double CalculatingBonus() {
		
		return super.CalculatingBonus();
	}

	@Override
	public void GeneratingPerformanceReports() {
		
		super.GeneratingPerformanceReports();
	}

	@Override
	public void ManagingProjects() {
		
		super.ManagingProjects();
	}

	

}
