package DataStructures;
import java.util.Scanner;

public class ArrayRotation {
	
	static void rotate(int num[] ,int pos) {
		int l = num.length;
		
		int[] resArr = new int[l];
		
		for (int i=0; i<l; i++) {
			if (i+pos <= l-1)
				resArr[i+pos] = num[i];
			if (i+pos > l-1)
				resArr[i-(l-pos)] = num[i];
		}
		
		for (int r: resArr)
			System.out.print(r + " ");
		
	}
		
	public static void main(String[] args) {
		int arr[]= {10,11,12,13,14,15};

		System.out.println("Array Elements before array rotation: ");
		for (int i: arr)
			System.out.print(i + " ");
		System.out.println();
		System.out.println("Enter num by which array should be right shifted: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Array after rotation: ");
		rotate(arr, n); 
	}
}