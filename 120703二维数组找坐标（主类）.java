
public class test {
	public static void main(String[] args) {
		int [][] array2d = {
				{1,2,3,4,5,6},
				{7,8,9,10,0,12},
				{8,8,9,10,11,12},
				{7,8,3,10,11,12},
				{88,66,92,102,151,999}
				};
	
		a a=new a();
	
		a.zore(array2d,151);
		/*ио*/
		a.zore_up(array2d,151);
		/*об*/
		a.zore_dnow(array2d,151);
		/*вС*/
		a.zore_left(array2d,151);
		/*ср*/
		a.zore_rigth(array2d,151);
	}

}
