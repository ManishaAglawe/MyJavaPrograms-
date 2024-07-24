package Variables;

public class DefaultValue_Different_DataType_GlobalVariable
{
	static byte b;
	static short s;
	static int i;
	static long l;
	static float f;
	static double d;
	static char c;
	static boolean a;
	static String v;
	static void datatype()
	{
		System.out.println("value of byte is "+b);
		System.out.println("value of short is "+s);
		System.out.println("value of int is "+i);
		System.out.println("value of long is "+l);
		System.out.println("value of float is "+f);
		System.out.println("value of double is "+d);
		System.out.println("value of char is "+c);
		System.out.println("value of boolean is "+a);
		System.out.println("value of String is "+v);
	}
	

	public static void main(String[] args) 
	{
		datatype();
		
	}

}
