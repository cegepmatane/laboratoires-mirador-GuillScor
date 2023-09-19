package controleur;

import java.util.ArrayList;
import java.util.List;

import com.sun.media.jfxmedia.logging.Logger;

import architecture.Controleur;
import modele.Nouvelle;
import modele.StatistiquesMeteores;
import vue.VueMirador;

public class ControleurMirador extends Controleur{

	public ControleurMirador()
	{
		Logger.logMsg(Logger.INFO, "new ControleurMirador()");
	}
	
	public void initialiser()
	{
		VueMirador vue = VueMirador.getInstance();
		
		int nombreAstronautes = 42;
		vue.afficherNombreAstronautes(nombreAstronautes);
		
		StatistiquesMeteores statistiquesMeteores = new StatistiquesMeteores(20,500,4000);
		vue.afficherStatistiquesMeteores(statistiquesMeteores);
		
		Nouvelle nouvelle1 = new Nouvelle("TN where", "HyperGryph");
		Nouvelle nouvelle2 = new Nouvelle("Bazett dans 6 mois, plus de SQ pls", "Lasagna");
		Nouvelle nouvelle3 = new Nouvelle("Jingliu et Topaz sont banger", "Kekhoyo");
		
		List<Nouvelle> nouvelles = new ArrayList<Nouvelle>();
		nouvelles.add(nouvelle1);
		nouvelles.add(nouvelle2);
		nouvelles.add(nouvelle3);
		
		vue.afficherNouvelles(nouvelles);
	}

}
