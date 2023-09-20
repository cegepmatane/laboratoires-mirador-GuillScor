package controleur;



import com.sun.media.jfxmedia.logging.Logger;

import architecture.Controleur;
import donnee.OperatorDAO;
import modele.Operator;
import vue.VueOperator;

public class ControleurOperator extends Controleur{

	public ControleurOperator()
	{
		Logger.logMsg(Logger.INFO, "new ControleurMirador()");
	}
	
	public void initialiser()
	{
		VueOperator vue = VueOperator.getInstance();
		
		OperatorDAO operatorDAO = new OperatorDAO();
		Operator op = operatorDAO.recupererOperator();
		
		vue.afficherOperator(op);
	}

}
