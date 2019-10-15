package investmentCalculator;

	import java.util.ArrayList;
	import java.util.*;
	public class Investment<contribution>
	{
	   ArrayList<Double> theContributions;
	   public Investment()
	   {
	       this.theContributions = new ArrayList<Double>();
	   }
	   void addContribution()
	   {
	       int X = 0;
	       int count = 0;
	       while(X != 1)
	       {
	       Scanner scanner = new Scanner (System. in);
	       System.out.println("If you are done making contributions type: 00.0001");
	       System.out.println("what would you like to contribut at month "+ count);
	       String c = scanner.nextLine();
	       double C = Double.parseDouble(c);
	       this.theContributions.add(C);
	       if(C == 00.0001)
	       {
	           X = 1;
	       }
	       count = count + 1;
	       }
	   }
	   public void getCurrentValue()
	   {
	       int time = 0;
	       Scanner scanner = new Scanner(System.in);
	       System.out.println("how many years would you like this experiment to last?");
	       time = scanner.nextInt();
	       int months = time * 12;
	       System.out.println("Will be compounded over this many months:" + months);
	       double finalNumber = -0.0001;
	       double addNum = months - theContributions.size();
	       for(int i = 0; i<= addNum; i++)
	       {
	           this.theContributions.add(0.0);
	       }
	       for(int X = 0; X < (theContributions.size()-1); X++)
	       {
	           finalNumber = finalNumber + theContributions.get(X);
	           finalNumber= finalNumber * 1.00666666667 ;
	       }
	       System.out.println("The final amount of your investment is: " + finalNumber);
	   }
	   /*
	   {
	        double InitialInvestment, rate, t, sim,com;
	           Scanner scanner = new Scanner (System. in);
	           System.out.println("Enter the amount:");
	           InitialInvestment=scanner.nextDouble();
	           System. out. println("Enter the Number of months:");
	           t=scanner.nextDouble();
	           System. out. println("Enter the Rate of  interest(.067)");
	           rate = scanner.nextDouble();
	           sim = (InitialInvestment * t * rate)/100;
	           com = InitialInvestment * Math.pow(1.0+rate/100.0,t) - InitialInvestment;
	           double totalCompound = InitialInvestment + com;
	           double totalSimple = InitialInvestment + sim;
	           System.out.println("Simple Interest="+totalSimple);
	           System.out. println("Compound Interest="+totalCompound);
	   }
	   */
	   public double getTotalContributions()
	   {
	       double sum = 0;
	       for(int i = 0; i < theContributions.size(); i++)
	       {
	           sum += theContributions.get(i);
	       }
	       sum = sum - 0.0001;
	       return sum;
	   }
	}

