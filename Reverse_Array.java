package Array_Prog;

import java.util.Arrays;

public class Reverse_Array 
{
	
	static	int k=0;
	public static void main(String[] args) 
	{
		
		 
        		int rollno[]= {15,87,65,44,32}; //case 1 i=4,k=0    rollno_reverse[4] =15;
        		                                 //case 2 i=3,k=1     rollno_reverse[3]=87;
				int rollno_reverse[]=new int[5];//[4] //case3 i=2,k=2  rollno_reverse[2]=65;
				for(int i=4;i>=0;i--)
				{		
					rollno_reverse[i]=rollno[k];	
					k++;
				}
				System.out.println(Arrays.toString(rollno));
				System.out.println(Arrays.toString(rollno_reverse));


	}

}
