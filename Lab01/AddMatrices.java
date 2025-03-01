import java.util.Scanner;
public class AddMatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value of Rows: ");
		int row = sc.nextInt();
		System.out.print("Enter value of Columns: ");
		int col = sc.nextInt();
		
		double[][] matA = new double[row][col];
		double[][] matB = new double[row][col];
		double[][] matX = new double[row][col];
		//Input for matA
		System.out.println("Enter the value of matA");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				matA[i][j] = sc.nextDouble();
			}
		}
		//Input for matB
		System.out.print("Enter the value of matA");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				matB[i][j] = sc.nextDouble();
			}
		}
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				matX[i][j]=matA[i][j] + matB[i][j];
			}
		}
		
		System.out.println("The matrix by add matA and matB is: ");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(matX[i][j]);
			}
			System.out.print("\n");
		}
	}

}
