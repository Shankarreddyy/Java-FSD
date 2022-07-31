package DataStructures;

public class CircularLinkedList 
{ 
    	static class Node1 
    	{ 
  		int data; 
        		Node1 next; 
                	Node1(int d) 
        		{ 
            			data = d; 
            			next = null; 
        		} 
}
Node1 head; 
CircularLinkedList()   
{ 
head = null; 
} 
    	void sortedInsert(Node1 new_Node1) 
    	{ 
        		Node1 current = head; 
if (current == null) 
        		{ 
            			new_Node1.next = new_Node1; 
            			head = new_Node1; 
  		} 
else if (current.data >= new_Node1.data) 
        		{ 
while (current.next != head) 
                			current = current.next; 
  		 	current.next = new_Node1; 
            			new_Node1.next = head; 
            			head = new_Node1; 
        		} 
        		else
        		{
while (current.next != head && current.next.data < new_Node1.data) 
                			current = current.next; 
  			new_Node1.next = current.next; 
            			current.next = new_Node1; 
        		} 
	}
void printList() 
    	{ 
        		if (head != null) 
       		{ 
            			Node1 temp = head; 
            			do
           			{ 
                			System.out.print(temp.data + " "); 
                			temp = temp.next; 
            			}  while (temp != head); 
        		} 
    	}
public static void main(String[] args) 
    	{ 
        		CircularLinkedList list = new CircularLinkedList(); 
        		int arr[] = new int[] {55,88,44,11,22,45,33}; 
        		Node1 temp = null; 
        		for (int i = 0; i < arr.length; i++) 
        		{ 
           			temp = new Node1(arr[i]); 
            			list.sortedInsert(temp); 
        		} 
list.printList(); 
    	}		 
}

