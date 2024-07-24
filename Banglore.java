package Casting_Programs;
class Delhi
{
	void vehicle()
	{
		System.out.println("Hii i am vehicle");
	}
	void busses()
	{
		System.out.println("Hii i am buss");
	}
}

public class Banglore extends Delhi
{   
	void add()
	{
		
	}

	public static void main(String[] args)
	{
		Delhi d1=new Banglore();
		d1.vehicle();
		d1.busses();
		//d1.add(); //with the help of upcasting we can not utilize the property of child class onl parent class properties are going to be utilise

	}

}
