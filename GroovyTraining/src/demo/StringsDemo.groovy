package demo

//def name = "Groovy"

//println name		// Groovy
//
//println "This is a class of "+name
//
//println "This is a class of ".concat(name)
//
//println "This is a class of $name"
//
//println 'This is a class of $name'



//def str1 = '''This is a groovy class
//		and we are learning Strings'''
//
//println str1

//function with strings
//
//def name = "Groovy"
//
//println name.length()
//
//println name.size()
//
//println name[3]		// 0
//
//println name[-2]	// start from back and count from 1
//
//println name.indexOf('G')	//	0
//
//println name[0..2]	//	Gro
//
//println name[5..3]	//	yvo
//
//println name[0,2,4]	//	Gov
//
//println name[-1]


def name = "Groovy"

println name.substring(2)	//	print from index 2

println name.substring(1, 4)

def str = "This is a groovy class"

println str.split(" ")

println str - (" groovy")		//

println str.replace("class", "session")

println str.toLowerCase()

println str.toUpperCase()

println str.toList()

println "Groovy " * 3

println "Abc".equals("Abc")		//	true

println "Abc".equals("abc")		//	false

println "Abc".equalsIgnoreCase("abc")	// true


def s0 = "a green sky \"Groovy\""
println s0

def name1 = "Groovy"

def s1 = /a green sky 
	$name1/
println s1

def s2 = $/a blue tree 
	$name1/$
println s2





















