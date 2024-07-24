package Method_Overriding;
class Method_Parent
{
	void login()
	{
		System.out.println("Login from mobile number");
	}
}
public class Method_Overriding_Concept extends Method_Parent
{
	void login()
	{
		//super keyword can use to achieve the method overriding concept 
		super.login();//it is super keyword,it will write in any line 
		System.out.println("Login from email id");
		super.login();// you can write here also
	}

	public static void main(String[] args)
	{
		Method_Overriding_Concept m1=new Method_Overriding_Concept();
		m1.login();
    }

}
