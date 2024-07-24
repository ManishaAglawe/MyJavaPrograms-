package This_Calling_Statement;
 
public class This_Calling 
{
	This_Calling(int a)
	{
		System.out.println("1");
	}
	 This_Calling(int a,int b)
	{
		 this(80);//it will call the[This_Calling_Statment(int a)]
		 System.out.println("2");

	}
	 This_Calling(double a,int b)
	{
		 this(10,20);// when ever u write this keyword it will call upper constructor means-->[This_Calling_Statment(int a,int b)]
		 System.out.println("3");

	}
	public static void main(String[] args) 
	{
		new This_Calling(3.43,32); // it is another way to call object[This_Calling_Statment t1=new This_Calling_Statment();]
		
		
	}

}
