package Exercice1;

public class GenericMovable implements MovableObject {

	private double speed;
	
	//the default speed is 30
	public GenericMovable() {
		speed=30;
	}
	
	//the user can choose the speed
	public GenericMovable(double d) {
		speed=d;
	}
	
	@Override
	//a generic movable can accelerate
	public boolean canAccelerate() {
		return true;
	}

	@Override
	//the accelerate and brake methods add 5 km/h to the speed
	public void accelerate() {
		speed+=5;
	}
	
	public void brake() {
		speed-=5;
	}

	@Override
	//the method takes a distance in km and returns the time it take to do this distance in minutes
	public double getTimeToMove(double distance) {
		return (distance/speed)*60;
	}
	
	//getter
	public double getSpeed() {
		return speed;
	}

}
