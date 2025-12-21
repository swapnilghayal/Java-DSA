class Son implements IndianMother,ForeignMother
{

	public void food()
	{
	IndianMother.super.food();
	ForeignMother.super.food();
	
	}

	public static void main(String args[])
	{
	Son s=new Son();
	s.food();
	}
}