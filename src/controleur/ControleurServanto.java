package controleur;

import com.sun.media.jfxmedia.logging.Logger;

import architecture.Controleur;
import donnee.ServantoDAO;
import modele.Servanto;
import vue.VueServanto;

public class ControleurServanto extends Controleur {

	public ControleurServanto()
	{
		Logger.logMsg(Logger.INFO, "new ControleurMonnaies()");
	}
	public void initialiser()
	{
		VueServanto vue = VueServanto.getInstance();
		
		ServantoDAO servantDAO = new ServantoDAO();
		Servanto servant = servantDAO.recupServant();
		
		vue.afficherServanto(servant);
	}

}


