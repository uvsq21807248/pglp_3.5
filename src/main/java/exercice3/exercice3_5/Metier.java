package exercice3.exercice3_5;

import java.time.*;

public class Metier implements Affichage {
	private Affichaage aff;
	public Metier(Affichaage aff) {
		this.aff = aff;
	}
	public void intruction() {
		aff.afficher(LocalDateTime.now() + " : Dé but  de  uneMethodeMetier ");
		aff.afficher(LocalDateTime.now() + " :  Fin  de  uneMethodeMetier ");
	}
	public void afficher(String chaine) {
		// TODO Auto-generated method stub
		
	}

}
