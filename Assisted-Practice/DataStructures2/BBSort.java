package DataStructures2;

public class BBSort {

	public static void main(String[] args) {

		
		int[] arr = { 96,558,24,1,5,367,987,5143,10058,101058 };
		
		bubbleSort(arr);
		
		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i]+" \t");
		}
	}

	public static void bubbleSort(int[] arr) {
		int len = arr.length;
		int temp = 0;
		for (int i = 0; i < len; i++) {
			
			for (int j = 1; j < (len); j++) {
				
				if (arr[j - 1] > arr[j]) {
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
					
					for(int x:arr) {
						System.out.print(x+" ");}System.out.println();
				}
				
			}
			
		}

	}

}
