package cloning.shallow;

public class Employee implements Cloneable {
	int id;
	String name;
	Address address;
	
	public Employee()
	{
		// no arg
	}
	
	public Employee (int id, String name, Address address)
	{	this.id= id;
		this.name= name;
		this.address= address;
	}
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Address addr = new Address("Pune","IND",411048);
		
		Employee e1= new Employee(23708, "Rutuja", addr);
		System.out.println("origin e1="+e1);
		
		Employee e2 = (Employee) e1.clone();
		System.out.println("origin e2"+e2);
		
		System.out.println("changing addr of e1 object");
		
		e1.address.city= "Mumbai";
		e1.address.pin= 400066;
		
		System.out.println("changed e1"+e1);
		System.out.println("changed e2"+e2);
	}
}
