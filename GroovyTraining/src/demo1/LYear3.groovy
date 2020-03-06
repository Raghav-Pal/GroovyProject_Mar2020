package demo1

class LYear3 {

	static void main(args) {

		int year=2020;

		if(year!=0)
		{
			if(year%400==0)
				System.out.println(year+" is a leap year");
			else  if(year%100!=0)
			{
				if(year%4==0)
					System.out.println(year+" is a leap year");
				else
					System.out.println(year+" is not a leap year");
			}
			else
				System.out.println(year+" is not a leap year");
		}
		else
			System.out.println("Year zero does not exist ");
	}


}
