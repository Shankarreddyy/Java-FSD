package Sequence;
public class Sequence {
    	    static int Seq(int a1[], int n)
    	    {
    	        int list[] = new int[n];
    	        int max_value = 0;
    	 
    	        // Initializing list array  values for all indexes 
    	        for (int i = 0; i < n; i++)
    	        {
    	            list[i] = 1;
    	        }
    	        for (int i = 1; i < n; i++) {
    	        	for (int j = 0; j < i; j++) {
    	        		
    	                if (a1[i] > a1[j] && list[i] < list[j] + 1) {
    	                    list[i] = list[j] + 1;
    	                    
    	                }
    	        	}
    	        }
    	        //  maximum of all list values 
    	        for (int i = 0; i < n; i++) {
    	            if (max_value < list[i]) {
    	                max_value= list[i];
    	            }
    	        }
    	 
    	        return max_value;
    	    }
    	    public static void main(String args[])
    	    {
    	        int a[] = { 55,33,88,2,6,45,46};
    	        int n = a.length;
    	        System.out.println("Longest Increasing Subsequence: " + Seq(a, n) );
    	    }
    	}
    