class MainClassRU
{

	public static void main(String args[])
	{
	
	Writing1 w=new Writing1();
	Reading1 r=new Reading1();

	Thread t1=new Thread(w);
	Thread t2=new Thread(r);

	t1.start();
	t2.start();
	}
}