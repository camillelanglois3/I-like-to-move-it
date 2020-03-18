package Exercice1;

public class ConstantSpeedMovable implements MovableObject {

	//speed is in km/h
	private double speed;
	
	//the constant speed of these objects will be 30km/h
	public ConstantSpeedMovable() {
		speed = 30;
	}
	
	@Override
	//a constant movable can't accelerate
	public boolean canAccelerate() {
		return false;
	}

	@Override
	//a constant object can't accelerate of brake, so these methods do nothing
	public void accelerate() {
	}
	
	public void brake() {
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
