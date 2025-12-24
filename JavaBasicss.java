public class JavaBasicss{

	public static int LinearSearch(int array[], int key)
	{
	
	
	for(int i=0; i<array.length; i++)
	{
	if(key==array[i])
	{
	return i;
	}
	}
		return -1;

	}

	public static int LargestNo(int array[])
	{
	
	int largest=Integer.MIN_VALUE;
	int smax=Integer.MAX_VALUE;
	for(int i=0; i<array.length; i++)
	{
	if(array[i]>largest)
	{
	largest=array[i];
	}
	}
	return largest;
	}
	

	public static int BinarySearch(int array[],int key){
	int start=0;
	int end =array.length-1;
	while(start <=end)
	{
		int mid=(start+end)/2;
		if(array[mid]==key)
		{
		return mid;
		}
		if(array[mid]>key)
		{
		end=mid-1;
		}
		else{
		start=mid+1;
		}
	}
	
		return -1;

	}
	
	public static int BinaryS(int a[],int  key )
	{
	for(int i=0, j=a.length-1; i<=j;)
	{
	int mid=(i+j)/2;
		if(a[mid]==key)
		return mid;
	
		if(a[mid]>key)
		{
		j=mid-1;
		}else{
		i=mid+1;
		}	
	}
	return -1;
	}

	public static void ReversedArray(int a[]){
	int i=0, j=a.length-1;

	while(i<j)
	{
		a[j]=a[i]+a[j];
		a[i]=a[j]-a[i];
		a[j]=a[j]-a[i];
					
		i++;
		j--;
	}
	}

	public static void PairsTwo(int a[]){
	
	for(int i=0; i<a.length; i++)
	{
		for(int j=i+1; j<a.length; j++)
		{
			System.out.print("("+a[i] +","+a[j]+")");
		
		}
	System.out.println();

		
	}
	}

	//to print subarrys
	public static void SubArrays(int a[])
	{
		int start=0;
		int end=0;
		//int sum=0;
			int largest=0;
			int small=Integer.MAX_VALUE;

		for(int i=0; i<a.length; i++)
		{
		
		for(int j=i; j<a.length; j++)
		{
			int sum=0;
		for(int k=i; k<=j;k++ )
		{
			
			System.out.print(a[k]+" ");
			int ss=a[k];
			
			
				while(ss!=0)
				{
				int ld=ss%10;
				sum=ld+sum;
				ss/=10;
				}
			
			

			}
			if(sum>largest)
			{
			largest=sum;
			}
			if(sum<small)
			{
			small=sum;
			}

	
			//sum=0;
				System.out.print("sum "+sum);

			System.out.println();

		}

}
System.out.print("largest =" +largest +" ");
System.out.print("smallest =" +small +" ");


}

	public static void SumOfArray(int a[])
	{
		int maxsum=Integer.MIN_VALUE;
	
		for(int i=0; i<a.length; i++)
		{
			for(int j=i; j<a.length; j++)
			{
					int cursum=0;	

				for(int k=i; k<=j; k++)
				{
					cursum +=a[k];
				}
				System.out.println(cursum);

				if(maxsum <cursum)
				{
				maxsum=cursum;
				}
			}
		}
		System.out.println("maximum sum=" +maxsum);	
		
	}
			
	public static void prefixSum(int a[])
	{
	
	//int prefix[]=int [a.length-1];	
		int maxsum=0;
		for(int i=0; i<a.length; i++)
		{
			for(int j=i; j<a.length;  j++)
			{
				int cursum=0;
				for(int k=i; k<=j; k++)
				{
					cursum +=a[k];
				
				}
												System.out.print(cursum+"  ");
			if(maxsum<cursum)
			maxsum=cursum;
				System.out.println();	
			}
						
				

		}
		System.out.println("maxsum =" + maxsum);
	}
	
	public static void prefixsum(int a[])
	{
		int maxsum=0;
		int cursum=0;
		int prefix[]=new int[a.length];
		
		prefix[0]=a[0];
		for(int i=1; i<a.length; i++)
		{
			prefix[i]=a[i-1]+a[i];
		}
			
		for(int i=0; i<a.length; i++)
		{
			for(int j=i; j<a.length; j++)
			{
			cursum= i==0 ? prefix[j]:prefix[j]-prefix[i-1];	
			if(maxsum<cursum)
			{
				maxsum=cursum;
			}
			}
		}
		System.out.println("max sum=" +maxsum);
	}
	
	
	public static void main(String args[])
	{
	int key=50;
	int a[]={2,4,6,8,10};
	
		prefixSum(a);
	
	}
	
}