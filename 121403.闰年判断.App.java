import java.util.Scanner;
public class test {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int year=s.nextInt();
		if(year>0) {
			if(year%4==0&&year%100!=0||year%400==0) {
				System.out.println("��");
			}else {
				System.out.println("����");
			}
		}else {
			int i=-5%4;
			if(year%4==-1&&year%100!=0||year%400==-1) {
				System.out.println("��");
			}else {
				System.out.println("����");
			}
		}
		
		
	}
}