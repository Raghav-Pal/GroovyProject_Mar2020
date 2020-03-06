package demo

////Arithmetic Operators
//println 1  + 2 == 3		// true
//println  4  - 3 == 1	// true
//println  3  * 5 == 15	// true	
//println  3  / 2 == 1.5	// true
//println 10  % 3 == 1	// true
//println  2 ** 3 == 8	// true
//
//println (9.intdiv(5) ==1) // true
//
//println (2.2.plus(1.1))		//	3.3
//
//println (3.3.minus(1.1))	//	2.2
//println "=========================="
//
////Unary Operators
//println (+3 == 3)
//println (-4 == 0 - 4)
//println (-(-1) == 1)
//
//// ++ pre and post increament
//// -- pre and post decreament
//
//def a = 2
//def b = a++ * 3
//println a	// 2 or 3
//println b	// 6 or 9
//
//
//def c = 3
//def d = c-- * 2
//println c	//	2
//println d	//	6
//
//
//def e = 1
//def f = ++e + 3
//println e	// 	2
//println f	//	5
//
//def g = 4
//def h = --g + 1
//println g	//	3
//println h	//	4
//
//int i = 10
//println i++		//	10
//println (++i)	//	12
//println (--i)	//	11
//println i--		//	11
//println i		//  10

//
//// Assignment Arithmetic Operators
//
//def a = 4
//a += 3		//	a = a+ 3
//println a	// 7
//
//def b = 5
//b -= 3		// 	b = b - 3
//println b	// 	2
//
//def c = 5
//c *= 3
//println c	//15
//
//def d = 10
//d /= 2
//println d	//5
//
//def e = 10
//e %= 3
//println e	//1
//
//def f = 3
//f **= 2
//println f	//9

//
//
//
//// Relational Operators
//println 1 + 2 == 3	//	true
//println 3 != 4		//	true
//
//println (-2 < 3)	//	true
//println 2 <= 2		// 	true
//println 3 <= 4		//	true
//
//println 5 > 1		//	true
//println 5 >= -2		//	true
//
//// Logical Operators
//println !false		//	true
//println true && true	//	true
//println true || false	//	true
//
//println !(2>3)	//	
//println (1==1) && (2 >1)	// true
//println (5>=10) || (2==1)	// false
//
////Precedence
//println ((!false && false) == false)
//
//println true || true && false
//
////Short Circuiting
//println (true || false)
//println (false && true)


//
//
//boolean checkIfCalled() {
//	called = true
//}
//
//called = false
//true && checkIfCalled()
//println called 

// Bitwise Operators
//
//int a = 20
//int b = 25
//println (a & b)	// 
//
//println Integer.toBinaryString(20)	// 10100	
//println Integer.toBinaryString(25)	// 11001
//									// 10000
//println Integer.parseInt("10000", 2)

//Conditional Operators
//println ((!true)    == false)	//	true
//
//println (!'foo')
//println (!'')
//
//println ((!'foo')   == false)	//	true
//println ((!'')      == true)	//	true


// Ternary Operator

if(10>20) {
	println "10 is greater"
}else {
	println "10 is smaller"
}

//condition ? "If cond is true" : "If cond is false"

def result = (10>4) ? "10 is greater" : "10 is smaller"
println result









