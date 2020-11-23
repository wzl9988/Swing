import java.util.Random;

public class test {
	public static void main(String[] args) {
		int[][] a={250,330},
			{6,50},
			{90,102},
			{55,66}};
		Random r=new Random();
		while (true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(a[r.nextInt(4)][0]+a[r.nextInt(4)][1]);
		}
	}
}