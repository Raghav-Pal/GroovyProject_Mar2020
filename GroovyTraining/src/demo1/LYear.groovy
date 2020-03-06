package demo1

y = 2020

if (y % 400 == 0) {
	println "Yes"
}else if(y % 100 != 0)
{
	if(y % 4 == 0) {
		println "Yes"
	}else {
		println "No 1"
	}
}
else {
println "No"
}