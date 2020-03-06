package demo

try {
	
String str = "groovy"
Integer.parseInt(str)

}
catch(Exception exp) {
	println "I am inside exception block"
	println exp.getMessage()
	println exp.getCause()
}
finally {
	println "I am inside finally block"
}

println "some other set of code"