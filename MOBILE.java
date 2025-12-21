public class MOBILE extends RAM
{
	void startMobile()
	{
	System.out.println("mobile start Successfully");

	}
	
	protected void assembleRAM()
	{
	System.out.println("RAM assembled Successfully");
	}

	MOBILE()
	{
	assembleRAM();
	startRAM();
	startMobile();

	}

	public static void main(String args[])	
	{
	new MOBILE();

	}

}