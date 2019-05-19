package exo_1;

public class les_bases {

	public static void main(String[] args) {
		
		// Affichage simple
     System.out.println("hello world i'm Najib Mustafa");
     System.out.println("go go go go ");
     System.out.println("hello world i'm Najib Mustafa");
     System.out.println("go go go go ");
		
     // declaration des variables de type String .
	 String phrase;
	 phrase = " hello word";
	 System.out.println(phrase);
	 
	 String S=new String();
	 S ="hello the other world ";
	 System.out.println(S);
	 
	 String S1 = "hello how are you ";
	 System.out.println(S1);
	 
	 String phrase2 = new String("est ce que ca va ? ");
	 System.out.println(phrase2);
	
	 // declaration des differents types
	 int A= 12;
	 float pi= 3.1416f;
	 char lettre='Z';
	 String mot="salut maroc";
	 
	 //calcule
	 
	 int a=1,b=2,c=3;
	 
	 int n1,n2,n3;
	 n1= 1+2;
	 n2= 2*3;
	 n3=n1/n2;
	 n1=5%2;
	 n2=3-1;
	 System.out.println("res =" + (n1-n2));
	 
	 // faire le cast (caster double to int )
	 double a1= 10,a2 = 3;
	 int resultat=(int)(a1/a2);
	 System.out.println("le resultat est ="+ resultat);
	 
	 
	 int c1= 10,c2 = 3;
	 double resultat2=(c1/c2);
	 System.out.println("le resultat est ="+ resultat);
	 
	 int nbre1 = 3, nbre2 = 2;
	 double resultat3 = (double)(nbre1) / (double)(nbre2);
	 System.out.println("Le résultat est = " + resultat3);
	 
	 //faire transformer un int vers un string ou #
	 
	 int i = 12;
	 String j = new String();
	 j = j.valueOf(i);
	 
	 int k = Integer.valueOf(j).intValue();
	 
	
	 int najib = 10;
	 String mustafa =new String();
	 mustafa =mustafa.valueOf(najib);
	 
	 int hicham=Integer.valueOf(najib).intValue();
	 
	int x1=1,x2=2;
	double res=(x1)*(x2);
	
	
	
		
		
		
		
	}

}
