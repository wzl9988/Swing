import java.util.Random;
import java.util.Scanner;


public class test {
	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		int i=0;
		String[] x=new String[26];
		Random random=new Random();
		
		while (i<26) {
			x[i]=random.nextInt(100)+","+random.nextInt(100);
			i++;
		}

		System.out.println("输入小写字母出随机坐标");

		while (true) {
			String a=s.next();
			char b=a.charAt(0);
			if(Integer.valueOf(b)<123||Integer.valueOf(b)>97){
				System.out.println(x[Integer.valueOf(b)-97]);
				continue;
			}
			break;
		}
	}
}
