package demo

File myFile = new File("file2.txt")

myFile.write("This is Line 1")

myFile << "\nThis is Line 2"

//myFile.text = "This is Line 3"	// overwrite

myFile.append("\nThis is Line 3")

println myFile.length()
println myFile.isFile()
println myFile.isDirectory()
println myFile.isHidden()

// copy file contents
def newFile = new File("file3.txt")
newFile << myFile.text

myFile.bytes = []

myFile.delete()

