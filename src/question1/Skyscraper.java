package question1;

import java.util.Scanner;

public class Skyscraper {
	   
	    Node head; 
	   
	    static class Node {
	   
	        int data;
	        Node next;
	   
	        Node(int d)
	        {
	            data = d;
	            next = null;
	        }
	    }
	   

	    public static Skyscraper insert( Skyscraper list, int data)
	    {
	        Node new_node = new Node(data);
	   
	        if (list.head == null) {
	            list.head = new_node;
	        }
	        else {
	            Node last = list.head;
	            while (last.next != null) {
	                last = last.next;
	            }
	            last.next = new_node;
	        }
	        return list;
	    }
	   

//	    public static void printList(Skyscraper list)
//	    {
//	        Node currNode = list.head;
//	    
//	        System.out.print("LinkedList: ");
//	    
//	        while (currNode != null) {
//	            // Print the data at current node
//	            System.out.print(currNode.data + " ");
//	    
//	            // Go to next node
//	            currNode = currNode.next;
//	        }
//	    }
	    

	    public static void main(String[] args)
	    {
	    	Skyscraper list = new Skyscraper();
	    	
			try(Scanner sc = new Scanner(System.in)){
		        
				System.out.println("enter the total no of floors in the building");
		        
				int no_of_floors = sc.nextInt();
		        
		        for(int i=0; i<no_of_floors; i++) {
		        	System.out.println("enter the floor size given on day :" + (i+1));
		        	list = insert(list, sc.nextInt());
		        }
		        
		        System.out.println("The order of construction is as follows");
		        
		        Node current = list.head;

		        int Bottom_floor = no_of_floors;
		        int Top_floor = 1;
		        int Curr_floor = Bottom_floor;

		        for(int i=1; i<=no_of_floors; i++){
		        if(current.data == Curr_floor){
		            System.out.println("Day:" + i);
		            System.out.println(current.data);
		            Curr_floor = current.data;
		            current = current.next;
		        }else{
		            System.out.println("Day:" +i);
		            System.out.println("");
		            current = current.next;
		        }
		        }
			}
	    }
}
