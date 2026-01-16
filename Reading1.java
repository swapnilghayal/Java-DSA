class Reading1 implements Runnable
{
	public void bookReading()
	{
		for(int i=1; i<=10; i++)
		{
		System.out.println("Book Reading Processing");
		}
	}

	public void run()
	{
	bookReading();

	}
}