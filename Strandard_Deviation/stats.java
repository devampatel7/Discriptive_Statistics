package Strandard_Deviation;

public class stats {
	private int[] stat;

	public stats() {
		stat = new int[1000];
		for (int i = 0; i < 1000; i++) {
			stat[i] = ((int) (Math.random() * 6) + 1) + ((int) (Math.random() * 6) + 1)
					+ ((int) (Math.random() * 6) + 1);
		}
	}

	public double calcAvg() {
		double avg;
		double sum = 0;
		for (int i = 0; i < stat.length; i++) {
			sum += stat[i];
		}
		avg = (sum / stat.length);
		return avg;
	}
	
	public int getMin() {
		int min = stat[0];
		for(int i= 1; i<stat.length;i++) {
			if(stat[i]<min) 
				min = stat[i];
		}
		return min;
	}
	
	public int getMax() {
		int max = stat[0];
		for(int i = 1; i<stat.length; i++) {
			if(stat[i]>max)
				max = stat[i];
		}
		return max;
	}
	public double calcStd() {
		double deviation;
		int sum_n=0;
		for(int i =0; i<stat.length; i++) {
			sum_n += (int)(Math.pow(stat[i]-this.calcAvg(), 2));
		}
		deviation = Math.sqrt((sum_n/(stat.length-1)));
		return deviation;
	}
	public void displayHistogram() {
		int[] arr = new int[19];// due to the 0 position
		for(int i =0; i<stat.length;i++) {
			arr[stat[i]] = arr[stat[i]] +1;
		}
		int star; 
		for(int l = 3; l<arr.length; l++) {
			if(arr[l]==0)
				star =0;
			else {
				star = (arr[l]/5)+1;
			}
			System.out.print(l+"| \t" + arr[l]+"| \t");
			for(int i =0; i<star; i++)
				System.out.print("*");
			System.out.println();
		}
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
	}
	

}
