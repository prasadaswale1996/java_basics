package aggregation;

//Aggregation example 1

public class Car {

String company;
String type;
Engine engine;

public Car() {
}

public Car(String company, String type, Engine engine) {
	this.company=company;
	this.type=type;
	this.engine=engine;
}
	
	@Override 
	public String toString() {
		return "Car{" +
				"company=" + company +
				
				",type=" + type + 
				
				",engine=" + engine +
				'}';
		
				
				
	}
	
}


