import java.util.*;
public class javaBasics{

	public static void printName(){
	System.out.println("Swapnil");
	System.out.println("Swapnil");
	System.out.println("Swapnil");


	}

	public static int calculateSum(int ...sum1)
	{
		System.out.println("Enter a Number"); 
		int sum=sum1[0]+sum1[1];
	return sum;

	}

	
	

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();	
		int sum=calculateSum(a,b);
		
		System.out.println(sum);
		
	
	}

}