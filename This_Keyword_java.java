package Keywords_in_java;

public class This_Keyword_java
{
    int age;
	String name;
	double salary;
	void student_details(int age,String name,double salary)
	{
		this.age=age;//local to global 
		this.salary=salary;
		this.name=name;
	}
public static void main(String[] args) 
{
	This_Keyword_java t1=new This_Keyword_java();
	t1.student_details(25, "Ram",87654);
	System.out.println(t1.salary);i
	System.out.println(t1.name);
	System.out.println(t1.age);

	}

}
