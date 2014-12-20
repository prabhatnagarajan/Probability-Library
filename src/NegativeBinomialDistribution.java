public class NegativeBinomialDistribution 
{
	private double p;
	private int r;
	public NegativeBinomialDistribution(int r, double p)
	{
		this.r=r;
		this.p=p;
	}
	public double expectedValue()
	{
		return ((double)r)/p;
	}
	public double variance()
	{
		return r*(1.0-p)/(Math.pow(p,2.0));
	}
	public double probability(int i)
	{
		return ((double)Probability.nCr(i-1,r-1))*Math.pow(p,(double)r)*Math.pow(1.0-p,i-r);
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
