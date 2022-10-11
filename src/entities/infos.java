package entities;

public class infos {
	
	public String name;
	public double grossSalary, tax, liqsalary;
	
	public String name() {
		return name;
	}
	
	public double liqsalary () {
		return grossSalary - tax;
	}
	
	public void increasseSalary(double percentage) {
		grossSalary += grossSalary * percentage / 100.0;
	}
	
	public String toString() {
		return name + ", $ " + String.format("%.2f", liqsalary());
		}
	
	

}
