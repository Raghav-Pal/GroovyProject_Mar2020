package demo

class Student {
	
	String studentName
	int sub1marks
	int sub2marks
	
	def printTotal() {
		
		println "$studentName has total marks = ${sub1marks + sub2marks}"
	}

	static void main(args) {
		
		Student student1 = new Student()
		
		student1.studentName = "Sarah"
		student1.sub1marks = 70
		student1.sub2marks = 80
		
		student1.printTotal()
		
	}
}
