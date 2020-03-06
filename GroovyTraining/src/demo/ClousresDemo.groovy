package demo

//// a simple closure
//def myClosure1 = {
//	
//	println "Hello World"
//}
//
//myClosure1.call()
//
//// closure can refer variables
//
//def str = "Hello"
//
//
//def myClosure2 = { 
//	
//	name, name2 ->
//	
//	println "$str $name $name2"
//	
//}
//
//myClosure2.call("Groovy", "Java")
//
//
//// can pass closure in a method
//
//def myClosure3 = { name ->
//	println "Hello $name"
//}
//
//
//
//def myMethod(clos) {
//	clos.call("Groovy")
//}
//
//myMethod(myClosure3)
//
//
//// closures can have return type
//
//def myClosure5 = {
//	a,b,c ->
//	return (a+b+c)
//}
//
//def output = myClosure5(10,20,30)
//println output

// we can use closures with functions

def myList1 = ["Apples", "Oranges", "Grapes"]

println myList1.each { it }


def myMap = [
		'name' : 'groovy',
		'place' : 'Bangalore'
	]

println	myMap.each { key, value -> 
	println key
	println value	
}

def myList2 = [1,2,3,4,5]

println myList2.find { item ->
	item == 6
}

println myList2.findAll { item -> item >3 }

println myList2.any { item ->	item > 3 }

println myList2.every { item -> item > 3 }

println myList2.collect { item -> item*2 }









