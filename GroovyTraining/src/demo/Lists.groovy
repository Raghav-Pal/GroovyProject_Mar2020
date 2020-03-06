package demo

def fruits = ["Apples", "Oranges", "Grapes"]

println fruits[1]

println fruits.get(2)

def myList = [1, 2, 3, ['A', 'B', "Groovy"], 4, 5 ]

println myList[2]

println myList[3]

println myList[3][2]
println myList.get(3).get(2)

println myList[0..2]

println myList[5..3]

println myList.contains(3)		//	true
println myList.contains(11)		//	false

println myList.contains("Groovy")		//	false
println myList[3].contains("Groovy")	//	true

println myList.size()		//	6
println myList[3].size()	//	3

myList.add(10)
println myList

myList << 20
println myList

myList.add(2,22)
println myList

myList.remove(2)
println myList

myList = myList + [30, 40]
println myList
//
//def myList2 = [7,8,9]
//myList << myList2
//println myList

myList = myList.plus([50])
println myList

myList = myList - [30,40]
println myList

myList = myList.minus([50])
println myList

myList.pop()	// removes 1st element
println myList

myList.removeLast()		// removes the last element
println myList

println myList.intersect([1, 2, 3])

myList = myList.reverse()
println myList

myList = myList.sort()
println myList

println myList.isEmpty()	// false

myList.clear()

println myList.isEmpty()	//	true


















