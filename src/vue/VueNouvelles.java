package vue;

import java.util.List;

import com.sun.media.jfxmedia.logging.Logger;

import architecture.Vue;
import controleur.ControleurNouvelles;
import javafx.scene.control.Label;
import modele.Nouvelle;

public class VueNouvelles extends Vue {

	protected ControleurNouvelles controleur = null;
	protected static VueNouvelles instance = null; 
	public static VueNouvelles getInstance() {if(null==instance)instance = new VueNouvelles();return VueNouvelles.instance;}; 

	private VueNouvelles() {
		super("nouvelles.fxml", VueNouvelles.class);
		Logger.logMsg(Logger.INFO, "new VueNouvelles()");
		super.controleur = this.controleur = new ControleurNouvelles();
	}

	public void afficherNouvelles(List<Nouvelle> nouvelles) {
		Label vueTitre = (Label)lookup("#text-1");
		Label vueDate = (Label)lookup("#date-1");
		
		for(int i = 1; i<=6;i++) {
			vueTitre = (Label)lookup("#text-"+i);
			vueDate = (Label)lookup("#date-"+i);
			
			vueTitre.setText(nouvelles.get(i-1).getTitre());
			vueDate.setText(nouvelles.get(i-1).getDate());
		}
		
	}
	
	
}
