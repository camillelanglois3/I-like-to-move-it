package Exercice1;

public interface MovableObject {

	public boolean canAccelerate();
	
	public void accelerate();
	
	public double getTimeToMove(double distance);
	
	public void brake();
}
