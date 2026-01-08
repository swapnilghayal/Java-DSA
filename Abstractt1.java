class Abstractt1 extends Abstractt
{
	public int a=10;
	public void display()
	{
	System.out.println("display method called "+"a="+a);
	}

	default 
	public static void main(String args[])
	{
	Abstractt1 a=new Abstractt1();
		a.display();
	}
}