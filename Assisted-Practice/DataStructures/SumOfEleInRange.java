package DataStructures;

public class SumOfEleInRange {
	public static void main(String args[]) 
    { 
        int arr[] = { 3, 7, 2, 5, 8, 9 }; 
        int n = arr.length;

        SumOfEleInRange.SparseT(arr, n); 
        
        System.out.println(SumOfEleInRange.query(3, 4)); 
        System.out.println(SumOfEleInRange.query(2, 2)); 
        System.out.println(SumOfEleInRange.query(1, 5)); 
    } 
	static int K = 16;
	static int N = 100000;
	
	static long T[][] = new long[N][K + 1];

	static void SparseT(int arr[], int n) {
		
		for (int i = 0; i < n; i++)
			T[i][0] = arr[i];
		for (int j = 1; j <= K; j++)
			for (int i = 0; i <= n - (1 << j); i++)
				T[i][j] = T[i][j - 1] + T[i + (1 << (j - 1))][j - 1];
	}

	static long query(int L, int R) {
		long res = 0;
		for (int j = K; j >= 0; j--) {
			if (L + (1 << j) - 1 <= R) {
				res = res + T[L][j];
				L += 1 << j;
			}
		}
		return res;
	}

}
