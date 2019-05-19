package exo_2;

import java.util.*;

public class menu {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		System.out.println("veuillez entrer votre note : ");
		int note =sc.nextInt();
		
		switch(note)
		{
		case 0:
			System.out.println("Ouuuf t'es nul a khoya ");
			break;
		
		case 10:
			System.out.println("Vous avez juste la moyenne.");
			break;
			
		case 20:
			System.out.println("parfait !!!");
			break;
		default:
			System.out.print("il faut davantage travailler");
			
			
       }
		
		
		
		
		
		

	}

}
