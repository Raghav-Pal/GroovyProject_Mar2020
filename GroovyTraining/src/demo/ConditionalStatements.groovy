package demo

//def num1 = 11
//
//// check num is equal to 10
//if(num1 == 10) {
//	println "Number equals to 10"
//}else {
//	println "Number is not equal to 10"
//}

//
//def num1 = 0
//
//if(num1 > 0) {
//	
//	println "Number is +ve"
//	
//}else if(num1 < 0){
//	
//	println "Number is -ve"
//	
//}else {
//	println "Number is Zero"
//}
//

//
//def age = -10
//
//if(age >= 18) {
//	println "Eligible to vote"
//}
//else if(age > 0 && age < 18){
//	println "Not Eligible"
//}
//else {
//	println "Invalid input"
//}

//def dayNum = 10
//def day = ""
//
//switch(dayNum) {
//	
//	case 1:
//		day = "Sunday"
//		break
//		
//	case 2:
//		day = "Monday"
//		break
//		
//	case 3:
//		day = "Tuesday"
//		break
//		
//	case 4:
//		day = "Wednesday"
//		break
//		
//	case 5:
//		day = "Thursday"
//		break
//		
//	case 6:
//		day = "Friday"
//		break
//		
//	case 7:
//		day = "Saturday"
//		break
//		
//	default:
//		println "Enter valid input (1-7)"
//}
//
//println "Day is $day"

def num1
def result = ""

if(num1 != null) {
switch(num1) {
	case {num1>0}:
		result = "Positive"
		break
	case {num1<0}:
		result = "Negative"
		break
	case {num1==0}:
		result = "Zero"
		break
	default:
		result = "Invalid Input"
}
println result
}else {
	println "Please enter a valid input"
}















