package DataStructures2;
import java.util.Scanner;
public class BinarySerach {
    
    public static void main(String[] args) {
        int arr[] = {50,2,36,11,1,44,25,365};
        Scanner sc=new Scanner(System.in);
        
        int key;
        System.out.println("Enter element to search:");
        key=sc.nextInt();
        
        int arrLength=arr.length;
        
        try {
            binarySearch1(arr,0,key,arrLength);
        } catch (ArrayIndexOutOfBoundsException e) {
            // TODO: handle exception
            System.out.println("Error: "+e);
        }
        
    }
    public static void binarySearch1(int[] arr, int lb, int key, int ub) {
        
        int midValue= (lb+ub)/2;
        
        while(lb<=ub) {
            
            if(arr[midValue]<key)
            {
                lb= midValue+1;
            }
            else if(arr[midValue]==key)
            {
                System.out.println("Element found at index: "+midValue);
                break;
            }
            else {
                ub=midValue-1;
            }
            midValue=(lb+ub)/2;
        }
        if(lb>ub) {
            System.out.println("Element Not Found:(");
        }
        
    }
}
