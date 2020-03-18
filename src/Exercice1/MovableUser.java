package Exercice1;

public class MovableUser {

	public static void main(String[] args) {
		ConstantSpeedMovable constant = new ConstantSpeedMovable();
		GenericMovable generic1 = new GenericMovable(30);
		GenericMovable generic2 = new GenericMovable(20);
		generic1.accelerate();
		
		System.out.println("The time to do 1km of the first object is " + constant.getTimeToMove(1));
		System.out.println("The time to do 1km of the second object is " + generic1.getTimeToMove(1));
		System.out.println("The time to do 1km of the third object is " + generic2.getTimeToMove(1));
		
		System.out.println("The total time for the first object is " + getTotalTime(constant));
		System.out.println("The total time for the second object is " + getTotalTime(generic1));
		System.out.println("The total time for the third object is " + getTotalTime(generic2));



	}
	
	//this method return the total time to do 1km then brake then do 100m then accelerate then do 1km again 
	public static double getTotalTime(MovableObject movable) {
		double total=0;
		total+= movable.getTimeToMove(1);
		movable.brake();
		total+= movable.getTimeToMove(0.1);
		movable.accelerate();
		total+= movable.getTimeToMove(1);
		return total;
	}

}
