package StaticNonstatic_Methods;

public class NonStaticMethodCalling_WithandWithoutParameter 
{
    void add()
    {
    	System.out.println("without parameter non static method calling");
    }
    void sub(int a,int b)//variable declaration in method and initialization in main method
    {
    	int sub=a-b;
    	System.out.println(sub);
    }
	public static void main(String[] args) 
	{
		NonStaticMethodCalling_WithandWithoutParameter n1=new NonStaticMethodCalling_WithandWithoutParameter();
		n1.add();
		n1.sub(30,10);
	}

}
