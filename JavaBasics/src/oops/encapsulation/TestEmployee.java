package oops.encapsulation;

public class TestEmployee {

	public static void main(String[] args) {

		Employee e1 = new Employee();
		Employee e2 = new Employee();
			
		
		e1.setName("Krishna");
		e1.setEmpCode(23708);
		
		e2.setName("Prasad");
		e2.setEmpCode(23709);
		
		System.out.println(e1.getEmpCode());
		System.out.println(e1.getName());
		
		System.out.println(e2.getEmpCode());
		System.out.println(e2.getName());
	}
}

