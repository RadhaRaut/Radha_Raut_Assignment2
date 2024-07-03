package Example7;
/*
 * Write a Java program that creates a class hierarchy for employees of a company. The base class should be Employee, 
 * with subclasses Manager, Developer, and Programmer. Each subclass should have properties such as name, address, salary, and 
 * job title. Implement methods for calculating bonuses, generating performance reports, and managing projects.
 */

public class Employee {
	//name, address, salary, and job title
	
			private String name;
			private String address;
			private double salary;
			private String title;
			
			public Employee(String name, String address, double salary, String title) {
				super();
				this.name = name;
				this.address = address;
				this.salary = salary;
				this.title = title;
			}
			
	//methods for calculating bonuses, generating performance reports, and managing projects.
			
			   public double calculateBonus() {
			        return salary * 0.10;  // 10% bonus
			    }

			    public String generatePerformanceReport() {
			        return "Performance report for " + name;
			    }

			    public void manageProject() {
			        System.out.println(name + " is managing a project.");
			    }

			

}
