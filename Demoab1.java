class Demoab1 implements Demo1,Demo
{
	public void m3()
	{
	Demo.m3();
	Demo1.m3();
	}

	public void m1()
	{
	Demo.m1();
	}
	
		public static void main(String args[])
	{
	Demoab1 d=new Demoab1();
	d.m1();
	
	d.m3();
	}
}