package MathClass_in_Java;

public class Mathematic 
{
    static void method1()
    {
    	int a=60;
    	int b=90;
    	int sum=a+b;
    	System.out.println(Math.absExact(sum));
    	System.out.println(Math.addExact(b,sum));
    }
	public static void main(String[] args) 
	{
		
		System.out.println(Math.addExact(200,90));//int, int
		System.out.println(Math.addExact(33333, 78900000));//long,long
		System.out.println(Math.atan2(4844, 44498));//double double
		System.out.println(Math.max(56, 87));//float float
		System.out.println(Math.decrementExact(3000));
		System.out.println(Math.sqrt(4000));
		System.out.println(Math.max(344, 900));
		
		
		method1();
		

	}

}
