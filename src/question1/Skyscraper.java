package question1;

import java.util.Scanner;

import question1.Linkedlist.Node;

public class Skyscraper {

	    public static void main(String[] args)
	    {
	    	Linkedlist list = new Linkedlist();
	    	
			try(Scanner sc = new Scanner(System.in)){
		        
				System.out.println("enter the total no of floors in the building");
		        
				int no_of_floors = sc.nextInt();
		        int Bottom_floor = no_of_floors;
		        boolean flag;
		        
		        for(int i=0; i<no_of_floors; i++) {
		        	System.out.println("enter the floor size given on day :" + (i+1));
		        	list = list.insert(list, sc.nextInt());
		        }
		        
		        System.out.println("The order of construction is as follows ");
		        
		        list.head = list.reverse(list.head);
		        Node current = list.head;
		        
		        for(int i=1;i<=no_of_floors;i++){
		            flag=false;
		            System.out.println("Day "+i+" :");
//		            j++;
		            while(Bottom_floor>=1 && current.data<=i){
		                flag=true;
		                System.out.print(Bottom_floor +" ");
		                Bottom_floor--;
		                current = current.next;
		            }
		            if(flag==false){
		                System.out.println();
//		                if((current.next) != null) {
//		                current = current.next;
//		                }
		            }
		        }
			}
	    }
}
