package DataStructures;

import java.io.*; 
public class DeleteFirstKEYLL 
{ 
Coulmn1 head; // head of list 
    	static class Coulmn1 
{ 
        		int data; 
        		Coulmn1 next; 
        		Coulmn1(int d) 
        		{ 
            			data = d; 
            			next = null; 
        		} 
    	} 
// Method to insert a new Coulmn1 
    	public static DeleteFirstKEYLL insert(DeleteFirstKEYLL list, int data) 
    	{ 
        		// Create a new Coulmn1 with given data 
        		Coulmn1 new_Coulmn1 = new Coulmn1(data); 
        		new_Coulmn1.next = null; 
   		// If the Linked List is empty, then make the new Coulmn1 as head 
        		if (list.head == null) 
{ 
            			list.head = new_Coulmn1; 
        		} 
        		else 
{ 
            			// Else traverse till the last Coulmn1 and insert the new_Coulmn1 there 
            			Coulmn1 last = list.head; 
            			while (last.next != null) 
{ 
                			last = last.next; 
            			} 
   			// Insert the new_Coulmn1 at last Coulmn1 
            			last.next = new_Coulmn1; 
        		} 
        		return list; 
    	} 
   	public static void printList(DeleteFirstKEYLL list) 
    	{	 
        		Coulmn1 currCoulmn1 = list.head; 
        		System.out.print("LinkedList: "); 
        		// Traverse through the LinkedList 
        		while (currCoulmn1 != null) 
{ 
            			// Print the data at current Coulmn1 
            			System.out.print(currCoulmn1.data + " "); 
            			// Go to next Coulmn1 
            			currCoulmn1 = currCoulmn1.next; 
        		} 
        		System.out.println(); 
    	} 
    	// Method to delete a Coulmn1 in the LinkedList by KEY 
    	public static DeleteFirstKEYLL deleteByKey(DeleteFirstKEYLL list, int key) 
    	{ 
        		// Store head Coulmn1 
        		Coulmn1 currCoulmn1 = list.head, prev = null; 
        		if (currCoulmn1 != null && currCoulmn1.data == key) 
{ 
            			list.head = currCoulmn1.next; // Changed head 
            			System.out.println(key + " found and deleted"); 
            			return list; 
        		} 
        		while (currCoulmn1 != null && currCoulmn1.data != key) 
{ 
            			prev = currCoulmn1; 
            			currCoulmn1 = currCoulmn1.next; 
        		} 
        		if (currCoulmn1 != null) 
{ 
            			prev.next = currCoulmn1.next; 
            			System.out.println(key + " found and deleted"); 
        		} 
        		if (currCoulmn1 == null) 
{ 
            			System.out.println(key + " not found"); 
        		} 
        		return list; 
    	} 
    	// method to create a Singly linked list with n Coulmn1s 
    	public static void main(String[] args) 
    	{ 
        		/* Start with the empty list. */
        		DeleteFirstKEYLL list = new DeleteFirstKEYLL(); 
        		// Insert the values 
        		list = insert(list, 10); 
        		list = insert(list, 12); 
        		list = insert(list, 13); 
        		list = insert(list, 14); 
        		list = insert(list, 15); 
        		list = insert(list, 16); 
        		list = insert(list, 17); 
        		list = insert(list, 18); 
        		// Print the LinkedList 
        		printList(list); 
        		// Delete Coulmn1 with value 1 
        		deleteByKey(list, 11); 
        		// Print the LinkedList 
        		printList(list); 
        		// Delete Coulmn1 with value 4 
        		deleteByKey(list, 14); 
        		// Print the LinkedList 
        		printList(list); 
        		// Delete Coulmn1 with value 10 
       		deleteByKey(list, 18); 
        		// Print the LinkedList 
        		printList(list); 
    	} 
} 

