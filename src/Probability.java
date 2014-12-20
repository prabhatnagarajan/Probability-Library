public class Probability 
{
	public Probability()
	{
	}
	public static int factorial(int n)
	{
		if (n==0)
		{
			return 1;
		}
		else if(n<0)
		{
			return Integer.MIN_VALUE;
		}
		else
			return factorialAuxiliary(n,1);
	}
	private static int factorialAuxiliary(int n,int currentFact)
	{
		if(n==1)
			return currentFact;
		else
			return factorialAuxiliary(n-1,n*currentFact);
	}
	public static int nPr(int n,int r)
	{
		if(n<r)
			return 0;
		if(n<0||r<0)
			return Integer.MIN_VALUE;
		return nPrAuxiliary(n,n-r,1);
	}
	private static int nPrAuxiliary(int n,int nminusr,int total)
	{
		if(n==nminusr)
			return total;
		else
			return nPrAuxiliary(n-1,nminusr,n*total);
	}
	public static int nCr(int n,int r)
	{
		if (n<r)
			return 0;
		if(n<0||r<0)
			return Integer.MIN_VALUE;
		else
			return nPr(n,r)/factorial(r);
	}


	
}
