import lejos.nxt.Button;
import lejos.nxt.Motor;
import lejos.robotics.navigation.DifferentialPilot;


public class SquareTracer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericRobot Robo = new GenericRobot(new DifferentialPilot(5.6, 11.44, Motor.A, Motor.B));
		Button.waitForAnyPress();
		Robo.TraceSquare();
	}

}
