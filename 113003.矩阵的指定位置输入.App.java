import java.util.Scanner;

public class ap  {
	
	public static void main(String[] args) {
	int row=0,col=0,a=0;
	 Scanner sc=new Scanner(System.in);
	 row=sc.nextInt();
	 col=sc.nextInt();
	 a=sc.nextInt();
	
	 int[][] is={
			 {10,2,3,4,5,6,7,8,91,10},
			 {1,02,3,41,5,6,71,80,9,10},
			 {1,20,3,4,51,1160,07,8,9,10},
			 {1,2,03,4,501,61,7,8,9,10},
			 {1,2,30,4,105,6,1117,8,9,10},
			 {1,2,30,004,5,6,17,8,9,10},
			 {1,20,131,40,5,6,7,18,9,10},
			 {10,2,3,4,05,6,7,8,19,10},
			 {1,211,3,4,50,6,7,8,91,10},
			 {1,2,31,41,5,06,7,8,91,10}
	 };
	 
	 is[row][col]=a;
	 for(int i=0;i<is.length;i++){
		 for(int j=0;j<10;j++){
			 System.out.print(is[i][j]);
		 }
		 System.out.println(" ");
	 }
	}
}