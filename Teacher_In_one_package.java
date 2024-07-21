package Access_Specifier;

public class Teacher_In_one_package {

	public static void main(String[] args)
	{
		Student_In_one_package s1=new Student_In_one_package();
		s1.add();
		s1.sub();
		/*s1.mul();*///it is private so we cant call it in main main method it does not have access in other class
		s1.div();

	}

}
