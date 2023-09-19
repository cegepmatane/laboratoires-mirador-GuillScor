package controleur;

import java.util.List;

import com.sun.media.jfxmedia.logging.Logger;

import architecture.Controleur;
import donnee.ZeldaDAO;
import modele.JeuZelda;
import vue.VueZelda;

public class ControleurZelda extends Controleur {

	public ControleurZelda()
	{
		Logger.logMsg(Logger.INFO, "new ControleurAmis()");
	}

	public void initialiser()
	{
		VueZelda vue = VueZelda.getInstance();
		
		ZeldaDAO zeldaDAO = new ZeldaDAO();
		List<JeuZelda> listeJeuxZelda = zeldaDAO.listerZelda();
		
		vue.afficherListeZelda(listeJeuxZelda);
	}

	
	public void notifierActionConvertir()
	{
		Logger.logMsg(Logger.INFO, "ControleurAmis.notifierActionConvertir()");
	}
	
}
