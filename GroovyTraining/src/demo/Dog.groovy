package demo

class Dog extends Animal{
	
	String dogName
	
	
	def plays() {
		println "$dogName likes to play"
	}
	
	def eats(String food) {
		println "$dogName likes to eat $food"
	}
}
