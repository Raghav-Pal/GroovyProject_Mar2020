package demo

abstract class Cars {
	
	String name
	String color
	int model
	
	def startEngine() {
		println "Starting engine for $name"
	}
	def stopEngine() {
		println "Stopping engine for $name"
	}
	abstract def topSpeed()
}
