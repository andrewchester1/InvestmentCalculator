package investmentCalculator;

public class Driver
	{
	   public static void main(String[] args)
	   {
	       Investment a = new Investment();
	       a.addContribution();
	       System.out.println(a.getTotalContributions());
	       a.getCurrentValue();
	}
	}

