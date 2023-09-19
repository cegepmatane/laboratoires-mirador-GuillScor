
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.List;
import java.util.Scanner;

import architecture.Controleur;
import architecture.Fenetre;
import donnee.NouvelleDAO;
import donnee.PokemonDAO;
import donnee.StationSpatialeDAO;
import modele.Nouvelle;
import vue.VueMirador;
import vue.VuePokemon;

public class App {

	public static void main(String[] parametres) {
		Controleur.choisirVuePrincipale(VuePokemon.class);
		
		//NouvelleDAO nouvelleDAO = new NouvelleDAO();
		/*List<Nouvelle> nouvelles = nouvelleDAO.listerNouvelles();
		for(Nouvelle nouvelle : nouvelles) {
			System.out.println("Titre : " + nouvelle.getTitre());
		}
		
		StationSpatialeDAO stationDAO = new StationSpatialeDAO();
		stationDAO.detaillerPosition();*/
		Fenetre.launch(Fenetre.class, parametres);	
		
		
	}

}
