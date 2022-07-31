package Project5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        /*System.out.println("Hello World!");*/
        System.out.println("\n**************************************\n");
        System.out.println("\tWelcome to TheDesk \n");
        System.out.println("**************************************");
        optionsSelection();

    }
    private static void optionsSelection() {
        String[] arr = {"1. I wish to review my expenditure",
                "2. I wish to add my expenditure",
                "3. I wish to delete my expenditure",
                "4. I wish to sort the expenditures",
                "5. I wish to search for a particular expenditure",
                "6. Close the application"
        };
        int[] arr1 = {1,2,3,4,5,6};
        int  slen = arr1.length;
        for(int i=0; i<slen;i++){
            System.out.println(arr[i]);
            // display the all the Strings mentioned in the String array
        }
        ArrayList<Integer> arrlist = new ArrayList<Integer>();
        ArrayList<Integer> expenses = new ArrayList<Integer>();
        expenses.add(1000);
        expenses.add(2300);
        expenses.add(45000);
        expenses.add(32000);
        expenses.add(110);
        expenses.addAll(arrlist);
        System.out.println("\nEnter your choice:\t");
        Scanner sc = new Scanner(System.in);
        int  options =  sc.nextInt();
        for(int j=1;j<=slen;j++){
            if(options==j){
                switch (options){
                    case 1:
                        System.out.println("Your saved expenses are listed below: \n");
                        System.out.println(expenses+"\n");
                        optionsSelection();
                        break;
                    case 2:
                        System.out.println("Enter the value to add your Expense: \n");
                        int value = sc.nextInt();
                        expenses.add(value);
                        System.out.println("Your value is updated\n");
                        expenses.addAll(arrlist);
                        System.out.println(expenses+"\n");
                        optionsSelection();

                        break;
                    case 3:
                        System.out.println("You are about the delete all your expenses! \nConfirm again by selecting the same option...\n");
                        int con_choice = sc.nextInt();
                        if(con_choice==options){
                               expenses.clear();
                            System.out.println(expenses+"\n");
                            System.out.println("All your expenses are erased!\n");
                        } else {
                            System.out.println("Oops... try again!");
                        }
                        optionsSelection();
                        break;
                    case 4:
                        sortExpenses(expenses);
                        // Printing Ascending Order
                        System.out.println("Sorted Expenses ArrayList: " + expenses);
                        optionsSelection();
                        break;
                    case 5:
                        searchExpenses(expenses);
                        optionsSelection();
                        break;
                    case 6:
                        closeApp();
                        break;
                    default:
                        System.out.println("You have made an invalid choice!");
                        break;
                }
            }
        }

    }
    private static void closeApp() {
        System.out.println("Closing your application... \nThank you!");
            }
    private static void searchExpenses(ArrayList<Integer> arrayList) {
        int leng = arrayList.size();
        sortExpenses(arrayList);
        //
        System.out.println("Enter Expenditure you want Search:");
        Scanner sc1=new Scanner(System.in);
        int key=sc1.nextInt();
        int first = 0;
        //assigning last index element to last
        int last=arrayList.size()-1; 
        //calculating mid arraylist 
        int mid = (first + last)/2;  
        
        //while first and last do not be equal
        while( first <= last ){  
            //if the mid < key, then key to be searched is in the first half of array
            if ( arrayList.get(mid) < key ){  
                first = mid + 1;     
            }else if ( arrayList.get(mid) == key ){ 
                //if key = element at mid, then print the location
                System.out.println("Expenditure is found at index: " + mid);  
                break;  
            }else{  
                //the key is to be searched in the second half of the array
                last = mid - 1;  
            }  
            mid = (first + last)/2;  
       }  
       //if first and last indices are equal, then key is not present in the arrayList
       if ( first > last ){  
          System.out.println("Entered Expenditure is NOT Found! :(\n");  
       }       
     
    }
    
    
    private static void sortExpenses(ArrayList<Integer> arrayList) {
        int arrlength =  arrayList.size();
       //The expenses sorted in ascending order using Bubble Sort.
        for (int i = 0; i < arrlength - 1; i++) {
            for (int j = arrlength - 1; j > i; j--) {
                if (arrayList.get(j - 1) > arrayList.get(j)) {
                    //Swapping
                    int tmp = arrayList.get(j - 1);
                    arrayList.set(j -1, arrayList.get(j));
                    arrayList.set(j, tmp);
                    
                	}
            }
        }

		
       
      
            
    	
    }
}    