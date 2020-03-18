package Exercice1;

public class GenericMovable implements MovableObject {

	private double speed;
	
	public GenericMovable() {
		speed=30;
	}
	
	public GenericMovable(double d) {
		speed=d;
	}
	
	@Override
	public boolean canAccelerate() {
		return true;
	}

	@Override
	public void accelerate() {
		speed+=5;
	}
	
	public void brake() {
		speed-=5;
	}

	@Override
	public double getTimeToMove(double distance) {
		return (distance/speed)*60;
	}
	
	public double getSpeed() {
		return speed;
	}

}
