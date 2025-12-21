public class Laptop extends RAM
{

	protected void startLaptop()
	{
	System.out.println("Laptop Successfully started");
	}

	protected void assembleRAM()
	{
	System.out.println("RAM assemled successfully");
	}

	Laptop()
	{
	assembleRAM();
	startLaptop();
	startRAM();
	
	}

	public static void main(String args[])	
{

	new Laptop();	
}
}