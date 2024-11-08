// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int currentValue = Integer.parseInt(args[0]);
		double rate = Double.parseDouble(args[1]);
		double n = Double.parseDouble(args[2]);

		double ratePercent = rate/100;
		double oneRatePercent = ratePercent + 1;

		double brackets = Math.pow(oneRatePercent,n);

		double futureValue = currentValue * brackets;

		System.out.println("After " + (int)n + " years, a $" + currentValue + " saved at " + rate + "%" + " will yield $" + (int)futureValue);





	}
}
