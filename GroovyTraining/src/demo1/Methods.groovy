package demo1

def checkLeapYear(int year) {
	def result
	
	if(year % 4 == 0) {
		
		if(year % 100 == 0) {
			
			if(year%400==0) {
				
				result "Leap Year"
				
			}else {
				result "Not a Leap Year"
			}
			
		}else {
			result "Not a Leap Year"
		}
	}else {
		result = "Not a Leap Year"
	}
	return result
	
}

println checkLeapYear(2020)