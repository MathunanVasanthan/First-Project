
public class Mitsubishi extends Car {

	public Mitsubishi(int cylinders, String name) {
		super(cylinders, name);
	}
	
	public String startEngine() {
		String message;
		message =getName() +"engine is starting";
		return message;
	}

	public String accelerate() {
		String message;
		message =getName() +"is accelerating";
		return message;
	}

	public String brake() {
		String message;
		message =getName() +"is braking";
		return message;
	}

}
