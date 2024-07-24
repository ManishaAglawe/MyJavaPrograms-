package MathClass_in_Java;

public class MathRandomAreaofCircle 
{
    static double pivalue=Math.PI;
	public static void main(String[] args) 
	{
		double a=Math.random();//every time it will change the value of a because of math.random method
		double s=pivalue*a*a;
		System.out.println("The area of circle using math random method is "+s);
		

	}

}
