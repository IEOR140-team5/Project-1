import lejos.nxt.Button;
import lejos.nxt.Motor;



public class SquareDance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Roughly 2070 degrees to travel 36"
		System.out.println("Booting ROBOT...");
		GenericRobot Robo = new GenericRobot();
		Motor.A.setAcceleration(3000);
		Motor.A.setSpeed(300);
		Motor.B.setAcceleration(3000);
		Motor.B.setSpeed(300);
		
		Button.waitForAnyPress();
		
		for (int i=1; i<8; i++ ){
		Robo.goThreeFeet();
		Robo.rotateLeftCorner();
		}
		
		Robo.goThreeFeet();
		
		//s\Start Again
		Button.waitForAnyPress();
		Robo.TurnAround();
		
		for (int i=1; i<8; i++ ) {
		Robo.goThreeFeet();
		Robo.rotateRightCorner();
		}
		
		
		Robo.goThreeFeet();
		
		
	}

}
