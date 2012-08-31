import lejos.robotics.navigation.DifferentialPilot;


public class PolyTracer {
	
	DifferentialPilot PolyDancer; 

	public PolyTracer(DifferentialPilot arg) {
	// TODO Auto-generated constructor stub
	PolyDancer = arg;
	}

	public void TraceTriangle(){
		PolyDancer.setAcceleration(50);
		//PolyDancer.setRotateSpeed(50);
		for(int i = 1; i<4; i++){
		PolyDancer.travel(60);
		PolyDancer.rotate(122);
		}
	}
	
	public void TracePentagon(){
		PolyDancer.setAcceleration(50);
		for(int i=1; i<6; i++){
		PolyDancer.travel(60);
		PolyDancer.rotate(-70);
	}
	}
	
	public void TraceSemiCircle(){
		PolyDancer.setAcceleration(50);
		//PolyDancer.travel(90);
		PolyDancer.arc(86, 190);
	}
	
	public void TraceQuarterCircle(){
		PolyDancer.setAcceleration(50);
		//PolyDancer.travel(90);
		PolyDancer.travelArc(-28, 45);
	
	}
}
