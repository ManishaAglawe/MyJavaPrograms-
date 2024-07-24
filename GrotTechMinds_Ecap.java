package Encapsulation_with_Getter_Setter;

class Google_auth //auther:ekta
{
	private int age=18;//this for default
	
	public int getAge()// to get the new age
	{
		return age;
	}
	public void setAge(int age)//  set the new age
	{
	 this.age=age;
	}
	private String un="contact@grotechminds.com";
    public String getUn()
    {
		return un;
	}
	public void setUn(String un)
	{
		this.un = un;
	}
  
}
public class GrotTechMinds_Ecap //auther: surya
{
public static void main(String[] args) 
{
		Google_auth g1=new Google_auth();
		g1.setAge(67);
		System.out.println(g1.getAge());
		g1.setUn("aglawe.manisha@gmail.com");
		System.out.println(g1.getUn());

}

}
