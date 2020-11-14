package Strandard_Deviation;

public class stats_tester {

	public static void main(String[] args) {

		stats s = new stats();
		System.out.println("min: " + s.getMin());
		System.out.println("max: " + s.getMax());
		System.out.println("standard deviation: " + s.calcStd());
		s.displayHistogram();
	}

}
