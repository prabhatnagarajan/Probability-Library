
public class PoissonDistribution 
{
		private double lamda;
		public PoissonDistribution(double meanlamda)
		{
			this.lamda=meanlamda;
		}
		public double expectedValue()
		{
			return lamda;
		}
		public double variance()
		{
			return lamda;
		}
		public double probability(int i)
		{
			if(i<0)
			{
				return 0;
			}
			else
				return (Math.pow(Math.E, -lamda)*Math.pow(lamda, i))/((double)Probability.factorial(i));
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
