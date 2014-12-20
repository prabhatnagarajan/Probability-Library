public class BinomialDistribution
{
	private int n;
	private double p;
	private double q;
	private double [] probabilities;
	public BinomialDistribution(int n, double p)
	{
		this.n=n;
		this.p=p;
		q=1-p;
		probabilities=new double[n];
	}
	public double expectedValue()
	{
		return ((double)n)*p;
	}
	public double variance()
	{
		return ((double)n)*p*q;
	}
	public double probability(int i)
	{
		if(i>=0&&i<=n)
		{
			if(probabilities[i-1]!=0)
				return probabilities[i];
			else
				probabilities [i-1]=((double)Probability.nCr(n, i))*Math.pow(p, i)*Math.pow(q, n-i);
			return probabilities[i-1];
		}
		else
			return 0;
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
