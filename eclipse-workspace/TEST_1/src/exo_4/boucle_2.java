package exo_4;

import java.util.*;

public class boucle_2 {

	public static void main(String[] args) {
	
   
		String prenom = new String();
		char reponse = ' ';
		 
		Scanner sc = new Scanner(System.in);
		 
		do{
		  System.out.println("Donnez un prénom : ");
		  prenom = sc.nextLine();
		  System.out.println("Bonjour " +prenom+ ", comment vas-tu ?");
		       
		  do{
		    System.out.println("Voulez-vous réessayer ? (O/N)");
		    reponse = sc.nextLine().charAt(0);
		  }while(reponse != 'O' && reponse != 'N');
		        
		}while (reponse == 'O');
		 
		System.out.println("Au revoir…");
	}

}
