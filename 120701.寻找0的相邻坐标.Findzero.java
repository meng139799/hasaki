package pac;

public class Findzero {
	void R_zero(int array2d[][]){
		for (int row = 0; row < array2d.length; row++) {
			for (int colmun = 0; colmun < array2d.length; colmun++) {
				if (array2d[row][colmun]==0) {
					System.out.println("R_zero("+row+","+colmun+")");
					break;	
				}
			}
		}
	}
	
	void R_left(int array2d[][]){
		for (int row = 0; row < array2d.length; row++) {
			for (int colmun = 0; colmun < array2d.length; colmun++) {
				if (array2d[row][colmun]==0) {
					System.out.println("R_left("+row+","+(colmun-1)+")");
					break;
				}
			}
		}
	}
	
	void R_right(int array2d[][]){
		for (int row = 0; row < array2d.length; row++) {
			for (int colmun = 0; colmun < array2d.length; colmun++) {
				if (array2d[row][colmun]==0) {
					System.out.println("R_right("+row+","+(colmun+1)+")");
					break;
				}
			}
		}
	}
	
	void R_up(int array2d[][]){
		for (int row = 0; row < array2d.length; row++) {
			for (int colmun = 0; colmun < array2d.length; colmun++) {
				if (array2d[row][colmun]==0) {
					System.out.println("R_up("+(row-1)+","+colmun+")");
					break;
				}
			}
		}
	}
	void R_down(int array2d[][]){
		for (int row = 0; row < array2d.length; row++) {
			for (int colmun = 0; colmun < array2d.length; colmun++) {
				if (array2d[row][colmun]==0) {
					System.out.println("R_down("+(row+1)+","+colmun+")");
					break;
				}
			}
		}
	}
	
}
