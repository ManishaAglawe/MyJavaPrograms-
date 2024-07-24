package Throw_Throws_Thread_Package;

public class Throw_Throws_Keyword_Thread_Sleep_Use 
{

	public static void main(String[] args) throws NullPointerException, InterruptedException
	{
		
        System.out.println("Wait for few sec");
        Thread.sleep(5000); // used to wait for 5 sec
        System.out.println("Throw an Exception");
		throw new NullPointerException("Sorry the cell is Empty");
        
	}

}
