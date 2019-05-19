package exo_1;

public class tableau {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tab[]={0,1,2,3,4};
		char tabc[]= {'a','b','c','d'};
		double tabd[]= {1.0,2.0,3.0,4.0};
		String tabs[]= {"najib","mustafa","Ahyaoui","Keltoum"};
		
		//un tableau vide de 4 cases ou bien vide
		
		int tabv[]=new int [4];
		int tabvv[];
		
		//tableau multidimentionnels
		
		int tabmultidim[][] = {{1,2,3,4},{5,6,7,8}};
		
		
		System.out.println(tabc[3]);
		
		//afficher l'integralité du tableau
		
		for(int i = 0;i<tabc.length;i++) {
			System.out.println("dans la case "+i+" nous avons "+tabc[i]);
		}
	}

}
