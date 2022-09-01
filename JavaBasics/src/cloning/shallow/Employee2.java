package cloning.shallow;

public class Employee2 {

	int id;
	String name;
	String city;
	
	public Employee2()
	{
	}
	
	public Employee2(int id, String name, String city)
	{
		this.id=id;
		this.name=name;
		this.city=city;
	}
	
	
	@Override
	public String toString() {
		return "Employee2 [id=" + id + ", name=" + name + ", city=" + city + "]";
	}

	public static void main(String[] args) throws CloneNotSupportedException {

		Employee2 e1= new Employee2(10, "Ram", "Pune");
		System.out.println("e1"+e1);
		
		Employee2 e2= (Employee2) e1.clone();
		System.out.println("e2"+e2);
		
		System.out.println("After changing city");
		
		e1.city="Mumbai";
		System.out.println(e1);
		System.out.println(e2);
	}

}
