package DataStructures2;

public class InsertionSearch {

    public static  void main(String[] args){
         
    	int[] arr = {1,5,4,55,44,66,556};
    	//int[] arr = {4,3,2,10,12,1,5,6};
    	
        insertionSort(arr);
        
        //printing array
        for(int i=0;i<arr.length;i++){

            System.out.print(arr[i]+" \t");

        }
     }
    public static void insertionSort(int[] arr){

	    int len = arr.length;
	    
	    for(int j=1;j<len;j++){
	    	
	    	int key = arr[j];
	    	int i=j-1;
	    	
	    while ((i>-1) && (arr[i]>key)){
	
	        arr[i+1]=arr[i];
	        i--;
	       
	    }
	    arr[i+1]=key;
	         }
    
    
    }
}