class Student{

	//encapsulation
	private int id;
	private String name;
	
	public Student setId(int id){this.id=id; return this;};
	public Student setName(String name){this.name=name; return this;};

	public int getId(){return id;}
	public String getName(){return name;}

	
	public static void main(String args[])
	{
	Student s=new Student();
	s.setName("swap");
	s.setId(1);


	System.out.println(s.getId());
		System.out.println(s.getName());

	}
	
}
