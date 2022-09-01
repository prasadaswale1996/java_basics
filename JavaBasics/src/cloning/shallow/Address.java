package cloning.shallow;

public class Address implements Cloneable {

	String city;
	String country;
	int pin;
	
	public Address()	//no arg
	{
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", country=" + country + ", pin=" + pin + "]";
	}


	public Address(String city, String country, int pin)
	{	this.city=city;
		this.country=country;
		this.pin=pin;
	}
	
	
	
}
