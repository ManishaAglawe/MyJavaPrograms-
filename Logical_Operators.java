package Operators;

public class Logical_Operators {

	public static void main(String[] args)
	{
	int s=23;
	int b=34;
	boolean condition1=(b>s);
    boolean condition2=(b==s);
	if(condition1&&condition2)
	{
		System.out.println("excuted without not operator 1st");
	}
	if(condition1||condition2)
	{
        System.out.println("excuted without not operator 2nd");
	}
	if(!(condition1&&condition2))
	{
		System.out.println("excuted with not operator 1st");//condition is false but it will excuted because of not operator
	}
	if(!(condition1||condition2))
	{
		System.out.println("excuted with not operator 2nd");
	}

}
}
