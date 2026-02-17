public class  maxSubA{
	

	public static void Maxnegative(int a[])
	{
		int maxx=Integer.MIN_VALUE;
		int cursum=0;
	
		for(int i=0; i<a.length; i++)
		{
			cursum +=a[i];

			if(cursum<0){
			cursum=0;	

			}
			maxx=Math.max(maxx,cursum);
		}
		System.out.println("Max =" +maxx);
	}

	public static void main(String args[])
	{
		int a[]={1,-2,3,4,-6};
		Maxnegative(a);
	}


}