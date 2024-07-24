package Array_Prog;

public class Average_4_Numbers
{
   static int sum=0;
   static double average=0;
	public static void main(String[] args)
	{
		int no[]=new int[4];
		no[0]=77;
		no[1]=22;
		no[2]=9;
		no[3]=24;
		for(int i=0;i<no.length;i++)
		{
			sum=sum+no[i];
			
		}
		System.out.println("The Addition of Four numbers of array is " +sum);
		average=sum/no.length;
		System.out.println("The Average of Four numbers is " +average);
		
		

	}

}
