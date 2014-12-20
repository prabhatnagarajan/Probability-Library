import java.util.*;
public class Main
{
	public static void main (String args[])
	{
		Scanner input=new Scanner(System.in);
		Probability p=new Probability();
		System.out.println(Probability.nCr(25, 5));
		BinomialDistribution bd=new BinomialDistribution (10,0.4);
		System.out.println(bd.probability(4));
		
	}
}
