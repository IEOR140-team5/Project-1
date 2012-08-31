import lejos.nxt.Button;
import lejos.nxt.Motor;
import lejos.robotics.navigation.DifferentialPilot;


public class GenericRobot {
	
	DifferentialPilot UltraBot;
	
	public GenericRobot(DifferentialPilot arg){
		UltraBot = arg;
	}
	
	public GenericRobot(){
		
	}
	
	//For Milestone 1
	void rotateRightCorner(){
		Motor.A.rotate(179, true); //left motor
		Motor.B.rotate(-178); //right motor
		System.out.println(" Count A "+Motor.A.getTachoCount());
		System.out.println(" Count B "+Motor.B.getTachoCount());
		Motor.A.resetTachoCount();
		Motor.B.resetTachoCount();

	}
	
	//For Milestone 1
	void rotateLeftCorner(){
		Motor.A.rotate(-179, true); //left motor
		Motor.B.rotate(178); //right motor
		System.out.println(" Count A "+Motor.A.getTachoCount());
		System.out.println(" Count B "+Motor.B.getTachoCount());
		Motor.A.resetTachoCount();
		Motor.B.resetTachoCount();
	}
	
	//For Milestone 1
	void goThreeFeet(){
		Motor.A.rotate(2010, true); //Should travel 2030 but it overshoots by 1
		Motor.B.rotate(2009);
		System.out.println(" Count A "+Motor.A.getTachoCount());
		System.out.println(" Count B "+Motor.B.getTachoCount());
		Motor.A.resetTachoCount();
		Motor.B.resetTachoCount();
	}
	
	//For Milestone 1
	void TurnAround(){
		Motor.A.rotate(360, true); //left motor
		Motor.B.rotate(-359); //right motor
		System.out.println(" Count A "+Motor.A.getTachoCount());
		System.out.println(" Count B "+Motor.B.getTachoCount());
		Motor.A.resetTachoCount();
		Motor.B.resetTachoCount();
	}
	
	//For Milestone 2
	public void TraceSquare(){
		UltraBot.setAcceleration(50);
		Button.waitForAnyPress();
		
		for (int i=1; i<8; i++ ){
		UltraBot.travel(90);
		UltraBot.rotate(94);
		}
		
		UltraBot.travel(90);
		
		//s\Start Again
		Button.waitForAnyPress();
		UltraBot.rotate(182);
		
		for (int i=1; i<8; i++ ){
			UltraBot.travel(90);
			UltraBot.rotate(-88);
			}
			
		UltraBot.travel(90);
		
	}
	
	//For Milestone 3
	public void TraceTriangle(){
		UltraBot.setAcceleration(50);
		Button.waitForAnyPress();
		for(int i = 1; i<4; i++){
		UltraBot.travel(60);
		UltraBot.rotate(122);
		}
	}
	
	//For Milestone 3
	public void TracePentagon(){
		UltraBot.setAcceleration(50);
		Button.waitForAnyPress();
		for(int i=1; i<6; i++){
		UltraBot.travel(60);
		UltraBot.rotate(-70);
		}
	}
	
	//For Milestone 3
	public void TraceSemiCircle(){
		UltraBot.setAcceleration(50);
		Button.waitForAnyPress();
		UltraBot.arc(86, 190);
	}
	
	//For Milestone 3
	public void TraceQuarterCircle(){
		UltraBot.setAcceleration(50);
		Button.waitForAnyPress();
		UltraBot.travelArc(-28, 45);
	
	}
}
