package exo_2;

import java.util.*;

public class recherche {

	public static void main(String[] args) {
		
		char tableauCaractere[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
		int i = 0;
		char reponse = ' ',carac = ' ';
		Scanner sc = new Scanner(System.in);
		
		
		         
		do {
		  do {
		    i = 0;
		    System.out.println("Rentrez une lettre en minuscule, SVP ");
		    carac = sc.nextLine().charAt(0);
		    
		    while(i < tableauCaractere.length && carac != tableauCaractere[i])
		      i++;
		         
		    if (i < tableauCaractere.length)
		      System.out.println(" La lettre " +carac+ " se trouve bien dans le tableau !");
		    else 
		      System.out.println(" La lettre " +carac+ " ne se trouve pas dans le tableau !");
		         
		  }while(i >= tableauCaractere.length);

		  do{
		    System.out.println("Voulez-vous essayer à nouveau ? (O/N)");
		    reponse = sc.nextLine().charAt(0);
		  }while(reponse != 'N' && reponse != 'O');    
		  
		  
		}while (reponse == 'O');
		                
		System.out.println("Au revoir !");
		

	}

}
