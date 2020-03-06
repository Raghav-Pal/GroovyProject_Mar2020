package demo1

def dayNum = 3
def day = ""

switch(dayNum) {
	
	case {1>0} : 
	day = "Sunday"
	break
	
	case 2 :
	day = "Monday"
	break
	
	default:
	day = "Invalid Input"
	
}
println day
