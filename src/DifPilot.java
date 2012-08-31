import lejos.nxt.Button;
import lejos.nxt.Motor;
import lejos.robotics.navigation.DifferentialPilot;

public class DifPilot {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DifferentialPilot Pilot = new DifferentialPilot(5.6, 11.44, Motor.A, Motor.B);
		
		Button.waitForAnyPress();
		Pilot.setAcceleration(50);
		Pilot.setTravelSpeed(27.5);
		
		Pilot.travel(90);
		Pilot.rotate(360);
		
		
		
	}

}
