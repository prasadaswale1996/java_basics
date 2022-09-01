package aggregation;

public class Engine {

	String type;
	float capacity;
	
	public Engine() {
	}
	
	public Engine(String type, float capacity) {
		this.type=type;
		this.capacity=capacity;
	}
	
	@Override
	public String toString() {
		return "Engine{"+
				
				"type=" + type  +
				
				",capacity=" + capacity +
				'}';
	}
}
