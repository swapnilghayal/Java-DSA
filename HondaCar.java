import java.util.*;
class HondaCar implements car
{



	int maxspeed=150;
	public void color()
	{
	System.out.println("Available in white, Black,Pink color");
	}
	
	public void type()
	{
	System.out.println("Available in Sedan");
	
	}
	public void cc()
	{
	System.out.println("Available in 1000 & 1500 cc");
	}
	
	public static void main(String args[])
	{

	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your choice");
	int choice=sc.nextInt();
	if(choice==1)
	{
	BMW b=new BMW();
	b.color();
	b.type();
	b.cc();
	}else{
	
	car h=new HondaCar();
	h.color();
	h.type();
	h.cc();
	}

	} 


}