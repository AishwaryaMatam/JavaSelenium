package basicselenium;

public class Averageofarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numbers = {100,100,100,100};
		int out = 0;
		for(int i = 0; i<numbers.length;i++)
		{
			int add = numbers[i];
			out = add+ out;
			System.out.println(out);	
		}
	int avg = (out/numbers.length);
	System.out.println(avg);
	}

}
