package exo_2;

import java.util.*;

public class condition {

	public static void main(String[] args) {
		
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("entrer un nombre X :");
		int i=sc.nextInt();
		
		 
		if (i < 0)
		  System.out.println("le nombre est négatif");
		else
		  System.out.println("le nombre est positif");
		   */
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("entrer un nombre X :");
		int X=sc.nextInt();
		
		if(X<0)
		{
			System.out.println("le nombre que vous avez saisi est negatif");
		}
		else
		{
			if(X==0) 
				System.out.println("le nombre que vous avez saisi est nul ");
			else
				System.out.println("le nombre que vous avez saisi est positif");
			
		}
		
		
		Scanner scc = new Scanner(System.in);
		System.out.println("entrer un nombre Y :");
		int Y=scc.nextInt();
		
		if(Y<100 && Y>50)
		{
			System.out.println("le nombre est bien dans l'intervalle");
		}
		else
		{
			if(X==0) 
				System.out.println("le nombre que vous avez saisi est nul ");
			else
				System.out.println("le nombre n'est pas dans l'intervalle");
			
		}
		
		}
}
