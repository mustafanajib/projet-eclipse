package exo_2;

import java.util.*;

public class exo_x {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		Scanner sc=new Scanner(System.in);
		System.out.println("combien de match voulez vous verifier/consulter/saisir ");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
		Scanner scr=new Scanner(System.in);
		System.out.println("pourriez vous saisir votre score ");
		int score1=scr.nextInt();
		System.out.println("pourriez vous saisir score de votre adversaire ");
		int score2=sc.nextInt();
		
		if(score1 > score2) 
		{
			System.out.println("vous avez gagner vos 3 points Félicitation");
		}
		else 
		{
			if(score1==score2) 
				System.out.println("vous avez fait un match nul : 0 points ");
			else
				System.out.println("vous avez perdu votre match vous aurez 0 points");

		}
		
		}                               }
	             }


