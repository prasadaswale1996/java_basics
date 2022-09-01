package aggregation;

public class Test {

	public static void main(String[] args) {
		
		Engine e1 = new Engine("v-12",2.0f);
		Engine e2 = new Engine("v-6",1.2f);
		
		String company = "mahindra";
		
		Car car1 = new Car(company, "Sedan", e1); //passed by ref=company //passed by ref= engine
		
		Car car2 = new Car("Tata", "SUV", e2);	//passed by value =company //passed by ref= engine
		
		System.out.println(car1);
		System.out.println(car2);
	}

}
