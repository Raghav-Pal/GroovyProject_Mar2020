package demo



def hello(def name) {
	
	println "Hello World.. $name"
	
}
hello(123)


def sum(int num1=10, int num2=20) {
	
	println "The sum is ${num1 + num2}"
}

sum(3,4)		// 	7
sum(2,3)		//	5
sum(10,20)		//	30
sum()			//	30
sum(4)			//	24

// W A P to create method for multiplication of 2 number
// Call with diff set of inputs
//	Provide default parameter values


def multiply(int num1=10, int num2=20) {
	
	def result = num1 * num2
	return result
}

def response = multiply()	
println response
	
multiply(2,3)
multiply(4,5)
multiply(100)


// W A P to create a method to check if a year is a leap year


def checkLeapYear(int y) {
	
	if(y % 400 == 0) {
		println "Leap Year"
		
	}else if(y % 100 !=0 && y % 4 == 0){
		println "Leap Year"
	}
	else {
		println "Not a Leap Year"
	}
}

checkLeapYear(2020)
checkLeapYear(2001)
checkLeapYear(1999)
checkLeapYear(2000)

/*********/



















