public class test {
	public static void main(String[] args) {
		long sum=0;
		for(int i=1;i<=2147483647;i=i+2) {
			sum=sum+i;
			System.out.println(sum);
		}	
	}
}