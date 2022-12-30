package overriding_java;

class Bank {
	public int GetRateOfInterest() {
		return 10;
	}
}

class SBI extends Bank {
	public int GetRateOfInterest() {
		return 20;
	}
}
class ICICI extends Bank {
	public int GetRateOfInterest() {
		return 9;

	}
}
class Axis extends Bank{
	public int GetRateOfInterest () {
		return 10;  
	}
}
class Canara extends Bank {
	public int GetRateOfInterest () {
		return 11;

	}
}
class PNB extends Bank {
	public int GetRateOfInterest () {
		return 12;
	}
}
class Hdfc extends Bank {
	public int GetRateOfInterest () {
		return 15;
	}
}
public class Test111 {
	public static void main(String[] args) {
		SBI x =new SBI();

		Hdfc b=new Hdfc();

		PNB c=new PNB();

		Canara d=new Canara();

		Axis e =new Axis();

		ICICI f =new ICICI();

		System.out.println("SBI Rate Of Interest:"+x.GetRateOfInterest());

		System.out.println("Hdfc Rate Of Interest:"+b.GetRateOfInterest());  

		System.out.println("PNB Rate Of Interest:"+c.GetRateOfInterest());

		System.out.println("Canara Rate Of Interest:"+d.GetRateOfInterest()); 

		System.out.println("Axis Rate Of Interest:"+e.GetRateOfInterest());

		System.out.println("ICICI Rate Of Interest:"+f.GetRateOfInterest());
	}
}




