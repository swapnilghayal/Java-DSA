public class Swap
{


	public static void swap(int a,int b)
	{
	int temp=a;
	a=b;
	b=temp;
	
	}

	public static int multiply(int a,int b)
	{
	int product=a*b;
	return product;
	}

	public static int factorial(int n)
	{
	int f=1;
		for(int i=1; i<=n; i++)
		{
		f*=i;
		}
		return f;
	}
	
	public static int binomialCoefficient(int n,int r)
	{
	int fact_n=factorial(n);
	int fact_r=factorial(r);

	int fact_nmr=factorial(n-r);
	int bino=fact_n/(fact_r*fact_nmr);
	return bino;

	}

	public static boolean CheckPrime(int n)
	{
	
		if(n==2)
		{
		return true;
		}
	
		for(int i=2; i<=Math.sqrt(n); i++)
		{
			if(n % i==0)
			{
			return false;
			}
		}
		return true;
	 
	}

	public static void primesInRange(int n)
	{
		for(int i=2; i<=n; i++)
		{
			if(CheckPrime(i)){
			System.out.println(i+" ");			
			}
		}
		System.out.println();
	}

	public static void binaryToDecimal(int n)
	{
		int mynum=n;
	
		int pow=0;
		int dec=0;
		while(n>0)
		{
		
		int lastDigit=n%10;
		dec +=(lastDigit*(int)Math.pow(2,pow));
		pow++;
		n/=10;

		}
		System.out.println(dec+" ");
}
		public static void decimalToBin(int n)
		
		{
		int pow=0;
		int binnum=0;
		while(n>0)
		{
		int rem=n%2;
		binnum +=rem*Math.pow(10,pow);
		pow++;
		n/=2;

		}
		System.out.println(binnum);
		}
		
	public static int AVG(int a, int b,int c)
	{
	int avg=(a+b+c)/3;
	return avg;
	}
	
	public static boolean isEven(int n)
	{
	
	
	if(n==0)
	return true;
	if(n%2==0)
	{
	return true;
	}
	return false;
	}

	public static boolean palindrome(int n)
	{
		int number=n;
		int rev=0;

	while(number !=0)
	{
	int ld=number % 10;
	rev =rev*10+ld;
	number/=10;
	}

	if(n==rev)
	{
	return true;
	}
	return false;
	
	}

	public static int computeSum(int n)
	{
	int sum=0;
	while(n!=0)
	{
	int ld=n%10;
	sum +=ld;
	n/=10;
	
	}

	return sum;
	}

	public static void main(String args[])
	{
	System.out.println(computeSum(143));
	
	}

}