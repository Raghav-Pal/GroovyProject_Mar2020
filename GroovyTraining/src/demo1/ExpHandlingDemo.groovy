package demo1

try {
	
	def list1 = [1,2,3]
	list1[5] = 10
	

//	Integer.parseInt("abc")
//	String str = null
//	println str.length()
	
//	char c = "ABc"


}catch(Exception exp) {
	println "I am here"
	println exp.getMessage()
	println exp.getCause()
}