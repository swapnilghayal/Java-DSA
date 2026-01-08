class MainClassEncapsule{
	
	public static void main(String args[])
	{
	//Encapsule e=new Encapsule();
		/* e.setId(10);
	
		System.out.println(e.getId());
		*/

		//method calling by using constructor but constructor need to pass all varible this gives error 

		/* Encapsule e=new Encapsule(1,"swap",);
		System.out.println(e);
		*/

		Encapsule e=new Encapsule();
		e.setName("swap");
	
		System.out.println(e);
	}
}