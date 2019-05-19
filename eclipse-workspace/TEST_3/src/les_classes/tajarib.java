package les_classes;

public class tajarib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//afficher le contenu d'un tableau 
		
		String tab[]= {"najib","mustafa","essaouira","maroc"};
		for(String A : tab) {
			System.out.println(A);
		}
		
		
		//calculer la moyenne des notes d'un tableau 
		
		int calcule=0;
		int tab2[]= {1,2,3,4,5,6,7,8,9};
		for(int note : tab2) {
			calcule = calcule+note;
		}
		System.out.println("la moyenne des notes est : "+(calcule / tab2.length));
		
	
	
	for(;;) {
		String a="coucou";
		System.out.println(a);
	}
	
	
	
	

}}
