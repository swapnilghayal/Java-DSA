public class Encapsule{
	
	private int id;
	private String name;
	private String city;
	
	public  Encapsule setId(int id){this.id=id;return this;}
	public Encapsule setName(String name){this.name=name; return this;}
	public Encapsule setCity(String city){this.city=city;return this;}

	public int getId(){return id;}
	public String getName(){return name;}
	public String getCity(){return city;}

	Encapsule(int id,String name,String city)
	{
	this.id=id;
	this.name=name;
	this.city=city;
	}
	
	Encapsule(){}

	//you only create constructor it give hexadecimal data to convert this you use toString() method

	public String toString()
	{
		return "Enacpsule[id="+id+",name="+ name+" , city="+city+"]";
	}


	//to avoid this we use method chaining means called multiple method in 1 stmt in setter method replace void-class name(Encapsule) and add return 

}