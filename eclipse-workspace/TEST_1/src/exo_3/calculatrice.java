package exo_3;

import java.util.*;

public class calculatrice {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("--------Calculatrice---------");
		System.out.println("-------- 1-Addition ---------");
		System.out.println("-------- 2-Soustraction------");
		System.out.println("-------- 3-Multiplication----");
		System.out.println("-------- 4-Division ---------");
		System.out.println("-------- 5-Modulo   ---------");
		System.out.println("-------- 6-Racine carrée ----");
		System.out.println("-------- 7-Puissance 2 ----");


		
        int choix = sc.nextInt();
        
        
        switch(choix)
        {
        case 1:
    		System.out.println("entrez un nombre");
    		double a=sc.nextDouble();
    		System.out.println("entrez le 2éme nombre");
    		double b=sc.nextDouble();
    		System.out.println("le Resultat est :"+ (a+b));
        break;
        
        case 2:
    		System.out.println("entrez un nombre");
    		double c=sc.nextDouble();
    		System.out.println("entrez le 2éme nombre");
    		double d=sc.nextDouble();
    		System.out.println("le Resultat est :"+ (c-d));
        break;
        
        case 3:
    		System.out.println("entrez un nombre");
    		double e=sc.nextDouble();
    		System.out.println("entrez le 2éme nombre");
    		double f=sc.nextDouble();
    		System.out.println("le Resultat est :"+ (e*f));
        break;
        
        case 4:
    		System.out.println("entrez un nombre");
    		double j=sc.nextDouble();
    		System.out.println("entrez le 2éme nombre");
    		double h=sc.nextDouble();
    		System.out.println("le Resultat est :"+ (j/h));
        break;
        
        case 5:
    		System.out.println("entrez un nombre");
    		double i=sc.nextDouble();
    		System.out.println("entrez le 2éme nombre");
    		double g=sc.nextDouble();
    		System.out.println("le Resultat est :"+ (i%g));
        break;
        
        case 6:
    		System.out.println("entrez un nombre");
    		double k=sc.nextDouble();
    		System.out.println("le Resultat est :"+ Math.sqrt(k));
        break;
        
        case 7:
        	System.out.println("entrez un nombre");
    		double l=sc.nextDouble();
    		System.out.println("le Resultat est :"+ (l*l));
        break;
        }

	}

}
