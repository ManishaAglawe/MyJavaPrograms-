package Array_Prog;

import java.util.Arrays;

public class Copy_one_array_into_another_array
{

	public static void main(String[] args)
	{
		int rollno[]=new int[5];
		rollno[0]=10;
		rollno[1]=13;
		rollno[2]=22;
		rollno[3]=98;
	 int rollno_copied[]=new int[rollno.length];//5
	 for(int i=0;i<rollno.length;i++)
	 {
		 rollno_copied[i]=rollno[i];
		 
	 }
	 System.out.println(Arrays.toString(rollno));
	 System.out.println(Arrays.toString(rollno_copied));
	}

}
