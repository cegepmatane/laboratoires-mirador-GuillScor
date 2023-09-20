
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.List;
import java.util.Scanner;

import architecture.Controleur;
import architecture.Fenetre;
import donnee.NouvelleDAO;
import donnee.OperatorDAO;
import donnee.PokemonDAO;
import donnee.ServantoDAO;
import donnee.ZeldaDAO;
import modele.Nouvelle;
import vue.VueOperator;
import vue.VueNouvelles;
import vue.VuePokemon;
import vue.VueServanto;
import vue.VueZelda;

public class App {

	public static void main(String[] parametres) {
		Controleur.choisirVuePrincipale(VueOperator.class);
		Fenetre.launch(Fenetre.class, parametres);	
	}

}
