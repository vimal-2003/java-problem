import java.util.*;  
public class LinkedList3 {  
  public static void main(String [] args)  
        {  
           LinkedList<String> ll=new LinkedList<String>();  
           ll.add("Ravi");  
           ll.add("Vijay");  
           ll.add("Ajay");  
           ll.add("Anuj");  
           ll.add("Gaurav");  
           ll.add("Harsh");  
           ll.add("Virat");  
           ll.add("Gaurav");  
           ll.add("Harsh");  
           ll.add("Amit");  
          
           System.out.println("Initial list of elements: "+ll);   
              ll.remove("Vijay");  
              System.out.println("After invoking remove(object) method: "+ll);   
              ll.remove(0);  
              System.out.println("After invoking remove(index) method: "+ll);   
              LinkedList<String> ll2=new LinkedList<String>();  
              ll2.add("Ravi");  
              ll.addAll(ll2);  
              System.out.println("Updated list : "+ll);   
        
              ll.removeAll(ll2);  
              System.out.println("After invoking removeAll() method: "+ll);   
     
              ll.removeFirst();  
              System.out.println("After invoking removeFirst() method: "+ll);  
         
              ll.removeLast();  
              System.out.println("After invoking removeLast() method: "+ll);  
        
              ll.removeFirstOccurrence("Gaurav");  
              System.out.println("After invoking removeFirstOccurrence() method: "+ll);  
            
              ll.removeLastOccurrence("Harsh");  
              System.out.println("After invoking removeLastOccurrence() method: "+ll);  
  
              ll.clear();  
              System.out.println("After invoking clear() method: "+ll);   
       }  
    }         
