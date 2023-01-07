
class DemoEncap{
	private int ssnValue;
	private int employeeAge;
	private String employeeName;
	public int getSsnValue() {
		return ssnValue;
	}
	public void setSsnValue(int ssnValue) {
		this.ssnValue = ssnValue;
	}
	public int getEmployeeAge() {
		return employeeAge;
	}
	public void setEmployeeAge(int employeeAge) {
		this.employeeAge = employeeAge;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
}

public class code1 {

	public static void main(String[] args) {
		
		DemoEncap obj= new DemoEncap();
		obj.setEmployeeAge(20);
		obj.setEmployeeName("Sourav");
		obj.setSsnValue(12345);
		System.out.println("Employee Name is:"+obj.getEmployeeName());
		System.out.println("Employee SSN code is:"+obj.getSsnValue());
		System.out.println("Employee Age is:"+obj.getEmployeeAge());

	}

}
