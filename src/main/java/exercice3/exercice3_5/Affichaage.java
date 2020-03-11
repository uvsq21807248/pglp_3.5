package exercice3.exercice3_5;


import java.time.LocalDateTime;
import java.lang.invoke.MethodHandles;

import org.slf4j.LoggerFactory;

public class Affichaage implements Affichage{


	
	org.slf4j.Logger logger = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
	public void afficher(String chaine) {
		// TODO Auto-generated method stub
		System.out.println(chaine ) ; 
		logger.info(chaine);
	}
}

