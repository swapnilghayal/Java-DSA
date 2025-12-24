public class BinaryS	
{

	public static  main(String args[])
	{
	int key=30;
	int a[]={10,20,30,40,50,60};
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
}