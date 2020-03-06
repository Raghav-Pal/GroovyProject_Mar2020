package demo


String filePath = "file1.txt"

File myFile = new File(filePath)

// reading complete contents of the file
println myFile.text

// collect lines into a list
def list = myFile.collect { it }
println list

// store file content in an array
def array = myFile as String[]
println array

// read file into a list of string
def lines = myFile.readLines()
println lines

// read file line by line
myFile.eachLine { line -> println line }

//System.console().readLine()

// read file line by line with line No
myFile.eachLine { line, lineNo ->
	println "$lineNo : $line"
}

//storing specific lines
def lineNoRange = 2..4
def lineList = []

myFile.eachLine { line, lineNo ->
	
	if(lineNoRange.contains(lineNo)) {
		lineList.add(line)
	}
}
println "$lineList"


println myFile.isFile()		//	true
	
println myFile.isDirectory()	//	false












