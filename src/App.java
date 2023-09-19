
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.List;
import java.util.Scanner;

import architecture.Controleur;
import architecture.Fenetre;
import donnee.NouvelleDAO;
import donnee.PokemonDAO;
import donnee.ServantoDAO;
import donnee.StationSpatialeDAO;
import donnee.ZeldaDAO;
import modele.Nouvelle;
import vue.VueMirador;
import vue.VuePokemon;
import vue.VueServanto;
import vue.VueZelda;

public class App {

	public static void main(String[] parametres) {
		Controleur.choisirVuePrincipale(VueZelda.class);
		Fenetre.launch(Fenetre.class, parametres);	
		
		ZeldaDAO zeldaDAO = new ZeldaDAO();
		zeldaDAO.listerZelda();
		
	}

}
