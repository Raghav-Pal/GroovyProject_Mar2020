package demo

def name = "Groovy"

println name
println "Subject name is "+name

println "Subject name is $name"
println 'Subject name is $name'

//groovy is case sensitive
def x = 10
def X = 20
println x
println X

//groovy is dynamically typed
def name1 = "Groovy"
name1 = 10
println name1


// Multiple assignment
def (a,b,c) = [30,40,50]
println a
println b
println c

println ("This is a groovy class")







