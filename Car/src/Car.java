
public class Car {
	private boolean engine;
	private int cylinders;
	private String name;
	private int wheels;


	public Car(int cylinders, String name) {
		this.cylinders = cylinders;
		this.name = name;
	}

	public String startEngine() {
		String message;
		message =name +"engine is starting";
		return message;
	}

	public String accelerate() {
		String message;
		message =name +"is accelerating";
		return message;
	}

	public String brake() {
		String message;
		message =name +"is braking";
		return message;
	}

	public int getCylinders() {
		return cylinders;
	}

	public String getName() {
		return name;
	}
}
