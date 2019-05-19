package exo_4;

public class boucle_3 {

	public static void main(String[] args) {
	
		for(int i = 1; i <= 8; i++)
		{
		  System.out.println("Voici la ligne "+i);
		}

		for(int i = 0, j = 2; (i < 30 && j < 40); i++, j+=4){
			  System.out.println("i = " + i + ", j = " + j);
			}
	}

}
