import java.util.*;
public class Maps {

	public static void main(String[] args) {
		// map
		
		//Hashmap
		HashMap<Integer,String> h=new HashMap<Integer,String>();      
	      h.put(1,"One+");    
	      h.put(2,"OPPO");    
	      h.put(3,"Realme");   
	       
	      System.out.println("\nThe elements of Hashmap are ");  
	      for(Map.Entry m:h.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }
	      
	     //HashTable
	       
	      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
	      
	      ht.put(4,"Shankar");  
	      ht.put(5,"Pawan");  
	      ht.put(6,"RAGHU");  
	      ht.put(7,"ASHOK");  

	      System.out.println("\nThe elements of HashTable are ");  
	      for(Map.Entry n:ht.entrySet()){    
	       System.out.println(n.getKey()+" "+n.getValue());    
	      }
	      
	      
	      //TreeMap
	      
	      TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(8,"Devil");    
	      map.put(9,"Babi");    
	      map.put(10,"nani");       
	      
	      System.out.println("\nThe elements of TreeMap are ");  
	      for(Map.Entry l:map.entrySet()){    
	       System.out.println(l.getKey()+" "+l.getValue());    
	      }    
	      
	   }  
}
