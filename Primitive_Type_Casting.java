package Casting_Programs;

public class Primitive_Type_Casting // have two types 1)Narrowing 2)Widening
{
public static void main(String[] args) 
		{
		 // int into double
		 double a1=		100;//Widening -implicitly and explicitly
		 System.out.println(a1);//implicit syntax
									
									
		 double a2=(double)9987;//Widening -implicitly and explicitly
		 System.out.println(a2);//Explicit syntax
									
		//double into int						
		 int a3=	(int)		87.8;//this is narrowing -explicitly
		 System.out.println(a3);
								
		 double wt=90.8765;
		 int c=(int) wt;
		 System.out.println(c);
								
								
								
		}

}


