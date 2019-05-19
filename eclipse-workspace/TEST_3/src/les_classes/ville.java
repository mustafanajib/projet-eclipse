package les_classes;

public class ville {

	String nomVille;
	String nomPays;
	int nbHabitants;
	private char categorie;

	
	public ville() {
		nomVille ="inconnu";
		nomPays="inconnu";
		nbHabitants=0;	
	    this.setCategorie();
	}
	
	private void setCategorie() {
		// TODO Auto-generated method stub
		
	}

	public ville(String pNom, int pNbre, String pPays)
	  {
	    nomVille = pNom;
	    nomPays = pPays;
	    nbHabitants = pNbre;
	    
	  }        
	
	
	
	public ville(String nomVille, String nomPays, int nbHabitants) {
		super();
		this.nomVille = nomVille;
		this.nomPays = nomPays;
		this.nbHabitants = nbHabitants;
	}

	public String getNomVille() {
		return nomVille;
	}
	public void setNomVille(String nomVille) {
		this.nomVille = nomVille;
	}
	public String getNomPays() {
		return nomPays;
	}
	public void setNomPays(String nomPays) {
		this.nomPays = nomPays;
	}
	public int getNbHabitants() {
		return nbHabitants;
	}
	public void setNbHabitants(int nbHabitants) {
		this.nbHabitants = nbHabitants;
	}
	@Override
	public String toString() {
		return "ville [nomVille=" + nomVille + ", nomPays=" + nomPays + ", nbHabitants=" + nbHabitants + "]";
	}
	
	public String comparateur(ville v2) {
		String str = new String();

	    if (v2.getNbHabitants() > this.nbHabitants)
	      str = v2.getNomVille()+" est une ville plus peuplée que "+this.nomVille;
	     
	    else
	      str = this.nomVille+" est une ville plus peuplée que "+v2.getNomVille();
	     
	    return str;
	    
   

	}
	
	
}
