package demo

class Car {
	
	protected String name
	String color
	int model
	
	def getCarDetails() {
		println "You are driving $model, $color colored $name"
	}
	
	def startEngine() {
		println "Starting engine for $name"
	}
	
}
