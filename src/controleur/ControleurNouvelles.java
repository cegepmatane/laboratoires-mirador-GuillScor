package controleur;

import java.util.List;

import com.sun.media.jfxmedia.logging.Logger;

import architecture.Controleur;
import donnee.NouvelleDAO;
import modele.Nouvelle;
import vue.VueNouvelles;

public class ControleurNouvelles extends Controleur {

	public ControleurNouvelles()
	{
		Logger.logMsg(Logger.INFO, "new ControleurNouvelles()");
	}
	public void initialiser()
	{
		VueNouvelles vue = VueNouvelles.getInstance();
		
		NouvelleDAO nouvelleDAO = new NouvelleDAO();
		List<Nouvelle> nouvelles = nouvelleDAO.listerNouvelles();
		
		vue.afficherNouvelles(nouvelles);
	}

}
