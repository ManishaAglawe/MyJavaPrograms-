package Variables;

public class Global_Static_Nonstatic_Calling
{
     static double d=44;// Global variable which is declare inside class but outside method/scope is start of class till the end of class
	 static void method1()
	 {
		 System.out.println(d);
	 }
	 int a=10;
	 void mehtod2()
	 {
		System.out.println(a);
	 }


	public static void main(String[] args)
	{
		 
		 System.out.println("Static Global veriable calling");
		 method1();
		 System.out.println("-----------------------------------------");
		 System.out.println("Non Static Global variable calling");
		 Global_Static_Nonstatic_Calling G1=new Global_Static_Nonstatic_Calling();
		 G1.mehtod2();
		 
		 
	}

}
