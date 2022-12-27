public class Test {

	public static void main(String[] args) {
		
		//BYe
		Employee emp = new Employee(111, "Ahmed");
		
		Employee emp3 = new Employee();
		emp3.setId(78).setName("Mark");
		System.out.println("Chaining "+emp3.getId()+" "+emp3.getName());
		
		EmployeeService empService = new EmployeeService();
		
		empService.save(emp);
		
		Employee emp2 = empService.getEmployee();
		
		//emp2.getId().getName();
		
		
		int id      =  emp2.getId();
		String name = emp2.getName().toUpperCase();
		
		System.out.println("get the Data: "+id+" name: "+name);

		
	}
}
/*
 * Java Beans
 * getter and setter Methods
 * 
 */
class Employee{
	
	int id;
	String name;
	
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public Employee()
	{
		
	}

	public int getId() {
		return id;
	}

	public Employee setId(int id) {
		this.id = id;
		return this;
	}

	public String getName() {
		return name;
	}

	public Employee setName(String name) {
		this.name = name;
		return this;
	}
	
	
	
}
class EmployeeService{
	
	public void save(Employee emp) 
	{
		System.out.println("save the id and name id: "+emp.getId()+" name: "+emp.getName());
	}
	
	public Employee getEmployee()
	{
		Employee employee = new Employee(112, "John T");
		return employee;
	}
}
