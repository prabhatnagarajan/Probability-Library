public class GeometricDistribution 
{
	private double p;
	public GeometricDistribution(double p)
	{
		this.p=p;
	}
	public double expectedValue()
	{
		return 1.0/p;
	}
	public double variance()
	{
		return (1.0-p)/(Math.pow(p,2.0));
	}
	public double probability(int x)
	{
		return p*Math.pow(1.0-p,(double)x);
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
