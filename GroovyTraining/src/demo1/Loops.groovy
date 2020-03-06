package demo1


for(int num1=1; num1<=10; num1++) {
	println "2 * $num1 = ${2*num1}"
}

1.step(100, 2) {  
	println "$it"
}

int num2 = 1
while(num2 <= 10) {
	println ("2 x $num2 = ${2*num2}")
	num2++
}
