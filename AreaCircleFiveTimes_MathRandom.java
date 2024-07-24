package MathClass_in_Java;

public class AreaCircleFiveTimes_MathRandom 
{
    static double valuepi=Math.PI;
	public static void main(String[] args) 
	{
		for(int i=0;i<5;i++)
		{
			double a=Math.random();
			double s=valuepi*a*a;
			System.out.println("The Area of Circle is "+s);
		}
		
		

	}

}
