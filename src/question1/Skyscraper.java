package question1;

import java.util.Scanner;

public class Skyscraper {

	    public static void main(String[] args)
	    {
				try(Scanner sc = new Scanner(System.in)){
		        	System.out.println("Enter the total number floors in the building : ");
		        	int no_of_floors = sc.nextInt();
			        int x[] = new int[no_of_floors+1];
			        
			        for(int i=1;i<=no_of_floors;i++){
			            System.out.println("Enter the floor size given on day : "+i);
			            int m=sc.nextInt();
			            x[m]=i;
			        }
			        int j=no_of_floors;
			        boolean flag;
			        
			        
			        System.out.println("The order of construction is as follows ");
			        for(int i=1;i<=no_of_floors;i++){
			            flag=false;
			            System.out.println("Day "+i+" :");
			            while(j>=1 && x[j]<=i){
			                flag=true;
			                System.out.print(j +" ");
			                j--;
			            }
			            if(flag==true){
			                System.out.println();
			         }
			     }
		    }
	  }
}
