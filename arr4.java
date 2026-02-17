import java.util.*;
public class arr4{
 
	public static void main(String args[])
	{

	int n=5489785,length=0;
		int temp=n;
	while(temp!=0)	
	{
	temp/=10;
	length++;
	}
	
	int a[]=new int[length];
	for(int i=0; i<a.length; i++)
	{
		
		a[i]=n%10;
		n/=10;
	}
	Arrays.sort(a);
	for(int i=0; i<a.length; i++)
	{
	n*=10;
	n+=a[i];
	}
	
	System.out.println(n);
	}
}