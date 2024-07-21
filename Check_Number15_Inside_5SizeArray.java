package Array_Prog;

class Check_Number15_Inside_5SizeArray 
{
	static int no_to_check=15;

	public static void main(String[] args) 
	{
		int rollno[]= {12,24,56,78};
		//or
		int rollno1[]=new int[5];
		rollno1[0]=79;
		rollno1[1]=15;// if we write it here 45 or diff value so the output will be nothing bcz 15 is not present in given array
		rollno1[2]=78;
		rollno1[3]=9;
		rollno1[4]=5;
		for(int i=0;i<rollno1.length;i++)
		{
			if(no_to_check==rollno1[i])
			{
				System.out.println("15 Is Present in the given Array ");
			}
		}
		
	}

}
