import java.util.*;
public class arr5{

	public static void main(String args[])
	{

	int a[]={14,25,36,58,18};
	int b[]=new int[a.length * 2];
	for(int i=0; i<a.length; i++)
	{

		int temp=a[i];
		int sum=0;
	
		while(temp !=0)
		{
			sum+=temp%10;
			temp=temp/10;

		}
		b[i]=a[i];
		b[a.length+i]=sum;
		
	}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));

		
	}
}