// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		// generate 3 random inputs [0;lim)

		int lim = Integer.MAX_VALUE;
		int a = (int)(Math.random()*lim);
		int b = (int)(Math.random()*lim);
		int c = (int)(Math.random()*lim);

			System.out.println(a + " " + b + " " + c);

		int minAandB = Math.min(a, b);
		int minBandC = Math.min(b, c);
		int minABC = Math.min(minAandB, minBandC);

		int maxAandB = Math.max(a, b);
		int maxBandC = Math.max(b, c);
		int maxABC = Math.max(maxAandB, maxBandC);
		
		int middle = ( a + b + c) - (minABC + maxABC);

		System.out.println(minABC + " " + middle + " " + maxABC);
		
	}
}
