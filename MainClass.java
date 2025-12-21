public class MainClass{

	public static void main(String args[]){
		
	Demo1 d=new Demo1();
	d.m1(10);
	Demo1 d1=new Demo2();
	d1.m1(20);

	Demo2 d2=(Demo2) d1;
	d2.m1(30);
}
}