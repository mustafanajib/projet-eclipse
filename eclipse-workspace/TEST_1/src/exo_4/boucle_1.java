package exo_4;

import java.util.*;

public class boucle_1 {

	public static void main(String[] args) {
		

		String prenom;
		char reponse = 'O';
		Scanner sc = new Scanner(System.in);
		while (reponse == 'O')
		{
		  System.out.println("Donnez un prénom : ");
		  prenom = sc.nextLine();
		  System.out.println("Bonjour " +prenom+ ", comment vas-tu ?");                        
		  
		  reponse = ' ';
		                        
		  
		  while(reponse != 'O' && reponse != 'N')
		  {
	
		    System.out.println("Voulez-vous réessayer ? (O/N)");
		    reponse = sc.nextLine().charAt(0);
		  }
		}
		System.out.println("Au revoir…");
		
		
		/*
		   Scanner sc=new Scanner(System.in);
		      System.out.println("entrez un nombre X : ");
		      int X=sc.nextInt();
		      
		      while(X <= 10)
		    	  
		      {
		    	  System.out.println(" je suis  " +X+ "  fois plus fort(e) que toi");
		    	  X++;
		      }
		
     */
	}

}
