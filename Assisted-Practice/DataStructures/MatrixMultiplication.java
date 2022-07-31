package DataStructures;

public class MatrixMultiplication {
	
	public static void main(String[] args) {
		
		int row1=2, Coulmn1=3;
		int row2=3, Column2=2;
		//First Matrix FMatrix: Second Matrix SMatrix
		int [][] FMatrix= {{9,2,4},{8,0,3}};
		int [][] SMatrix= {{9,2},{5,-7},{4,8}};
		
		
		//method to multiply the matrix
		//MM-> matrix multiplication
		int[][]  product= MM(FMatrix,SMatrix,row1,Coulmn1,Column2);
		
		//display the result of multiplication
		displayProduct(product);
	}
	
	private static int [][]MM(int[][] FMatrix, int [][] SMatrix,  int row1,  int Coulmn1,int Column2)
	{
		
		int [][]product = new int[row1][Column2];//  resultant matrix
		
		for(int i=0; i<row1;  i++) {
			
			for(int j=0; j<Column2; j++) {
				
				for(int k=0;k<Coulmn1;  k++) {
					 product[i][j]+=FMatrix[i][k]*SMatrix[k][j];
				}
			}
			
		}
		return product;
	}
	
	private static void displayProduct(int [][]product) {
		
		System.out.println("Product of two matrix is : ");
		for(int[] row: product) {
			
			for(int column:row) {
				System.out.print(column+ " ");
			}
			System.out.println();
		}
		
	}

}
