package exercice3.exercice3_5;
import java.time.LocalDateTime;
public class UseClassMetier {
	private Affichaage aff;

	public UseClassMetier(Affichaage aff) {
		this.aff = aff;
	}
	public void intruction() {
		aff.afficher(LocalDateTime.now() + " : Dé but  de  uneMethodeMetier ");
		aff.afficher(LocalDateTime.now() + " :  Fin  de  uneMethodeMetier ");
	}
}
