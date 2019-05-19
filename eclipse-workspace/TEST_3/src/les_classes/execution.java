package les_classes;

public class execution {

	public static void main(String[] args) {

		
		ville v1 =new ville();
		ville v2 =new ville("essaouira",800000,"Maroc");
		ville v3 =new ville("Casablanca",5000000,"Maroc");
		capital cap=new capital();
		System.out.println(cap);
		
		System.out.println(v2.getNomVille()+" est une ville de "+v2.getNbHabitants()+" qui se situe au "+v2.getNomPays());

		v2.setNbHabitants(100000);
		System.out.println(v2.getNomVille()+" est une ville de "+v2.getNbHabitants()+" qui se situe au "+v2.getNomPays());
        System.out.println(v3.comparateur(v2));
        
	}

}
