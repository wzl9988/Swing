public class a {
	void zore(int[][] array2d,int rm){
		for(int i=0;i<array2d.length;i++){
			for(int j=0;j<array2d[i].length;j++){
				if(array2d[i][j]==rm){
					System.out.println("x:"+(i+1)+"y:"+(j+1));
				}
			}
		}
	}
	void zore_up(int[][] array2d,int rm){
		for(int i=0;i<array2d.length;i++){
			for(int j=0;j<array2d[i].length;j++){
				if(array2d[i][j]==rm){
					System.out.println("x:"+(i+1)+"y:"+(j));
				}
			}
		}
	}
	void zore_dnow(int[][] array2d,int rm){
		for(int i=0;i<array2d.length;i++){
			for(int j=0;j<array2d[i].length;j++){
				if(array2d[i][j]==rm){
					System.out.println("x:"+(i+1)+"y:"+(j+2));
				}
			}
		}
	}
	void zore_left(int[][] array2d,int rm){
		for(int i=0;i<array2d.length;i++){
			for(int j=0;j<array2d[i].length;j++){
				if(array2d[i][j]==rm){
					System.out.println("x:"+(i)+"y:"+(j+1));
				}
			}
		}
	}
	void zore_rigth(int[][] array2d,int rm){
		for(int i=0;i<array2d.length;i++){
			for(int j=0;j<array2d[i].length;j++){
				if(array2d[i][j]==rm){
					System.out.println("x:"+(i+2)+"y:"+(j+1));
				}
			}
		}
	}
}