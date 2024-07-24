package Variables;

public class UpdatingGlobal_StaticNonstaic_variable
{
      static int a=20;
      static void method1()
      {
    	  a=40;
    	  System.out.println(a);
      }
      int b=30;
      void method2()
      {
    	  b=60;
    	  System.out.println(b);
    	  
      }

	public static void main(String[] args) 
	{
		System.out.println("Static Global veriable calling");
		method1();
		System.out.println("-----------------------------------");
		System.out.println("Non Static Global variable calling");
		UpdatingGlobal_StaticNonstaic_variable U1=new UpdatingGlobal_StaticNonstaic_variable();
		U1.method2();
	}
		

}
