package demo

class Fruits {

	String fruitName
	String fruitColor


	def setFruitName(String name) {
		fruitName = name
	}

	def setFruitColor(String color) {
		fruitColor = color
	}

	def getFruitName() {
		println "Name of the fruit is $fruitName"
	}

	def getFruitColor() {
		println "Color of $fruitName is $fruitColor"
	}

	static void main(args) {
		
		Fruits fruit1 = new Fruits()
		
		Fruits fruit2 = new Fruits()
		
		fruit1.setFruitName("Apple")
		fruit1.setFruitColor("Red")
		fruit1.getFruitName()
		fruit1.getFruitColor()
		
		fruit2.setFruitName("Grapes")
		fruit2.setFruitColor("Green")
		fruit2.getFruitName()
		fruit2.getFruitColor()
	
	}
}
