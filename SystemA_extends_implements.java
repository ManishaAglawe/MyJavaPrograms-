package Abstract_Concrete;
interface SystemC
{
	void add();
}
class SystemB 
{
	void sub()
	{
		System.out.println("2");
	}
}


public class SystemA_extends_implements extends SystemB implements SystemC
{
	public void add() 
	{
		System.out.println("1");
		
	}

	public static void main(String[] args)
	{
		SystemA_extends_implements s1=new SystemA_extends_implements();
		s1.add();
		s1.sub();

	}

	
	

}
