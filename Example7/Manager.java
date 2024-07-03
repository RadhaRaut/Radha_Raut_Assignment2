package Example7;

public class Manager extends Employee {

	 public Manager(String name, String address, double salary) {
	        super(name, address, salary, "Manager");
		
	}

	 @Override
	    public double calculateBonus() {
	        return getSalary() * 0.1;
	    }

	    @Override
	    public String generatePerformanceReport() {
	        return "Manager's performance report";
	    }

	    @Override
	    public void manageProjects() {
	        System.out.println("Managing projects");
	    }
	

}
