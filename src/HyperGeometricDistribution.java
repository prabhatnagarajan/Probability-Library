public class HyperGeometricDistribution 
{
	private int mwhite;
	private int Nballs;
	private int nchosen;
	public HyperGeometricDistribution(int m,int n, int N)
	{
		mwhite=m;
		nchosen=n;
		Nballs=N;
	}
	public double expectedValue()
	{
		return ((double)(nchosen*mwhite))/((double)Nballs);
	}
	public double variance()
	{
		return ((double)(Nballs-nchosen))*(expectedValue())*(1.0-((double)mwhite)/((double)Nballs))/((double)(Nballs-1));
	}
	public double probability(int i)
	{
		return (((double)Probability.nCr(mwhite,i))*((double)Probability.nCr(Nballs-mwhite,nchosen-i)))/((double)Probability.nCr(Nballs,nchosen));
	}
	public double probability(int a, int b,boolean inclusivea, boolean inclusiveb)
	{
		double totalp=0;
		for(int i=a;i<=b;i++)
		{
			if(i==a && !inclusivea)
				continue;
			if(i==b && !inclusiveb)
				continue;
			totalp+=probability(i);
		}
		return totalp;
	}
}
