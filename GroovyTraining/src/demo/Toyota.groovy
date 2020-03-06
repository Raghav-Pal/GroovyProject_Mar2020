package demo

class Toyota extends Cars{

	int topSpeed
	
	def getTopSpeed() {
		println "TopSpeed is $topSpeed"
	}
	
	
	@Override
	public Object topSpeed() {
		// TODO Auto-generated method stub
		return null;
	}


	static void main(args) {
		
		Toyota car1 = new Toyota()
		
		car1.name = "Toyota"
		car1.color = "Red"
		car1.model = 2020
		car1.topSpeed = 200
		
		car1.startEngine()
		car1.accelerate()
		car1.getTopSpeed()
		car1.stopEngine()
	}
}
