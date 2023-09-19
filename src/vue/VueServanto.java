package vue;

import com.sun.media.jfxmedia.logging.Logger;

import architecture.Vue;
import controleur.ControleurServanto;
import javafx.scene.control.Label;
import modele.Servanto;

public class VueServanto extends Vue {
	
	protected ControleurServanto controleur = null;
	protected static VueServanto instance = null; 
	public static VueServanto getInstance() {if(null==instance)instance = new VueServanto();return VueServanto.instance;}; 
	
	private VueServanto()  {
		super("servanto.fxml", VueServanto.class);
		Logger.logMsg(Logger.INFO, "new VueMonnaies()");
		super.controleur = this.controleur = new ControleurServanto();
	}

	public void afficherServanto(Servanto servant) {
		Label vueName = (Label)lookup("#servant-name");
		Label vueNP = (Label)lookup("#servant-np");
		Label vueAtk = (Label)lookup("#servant-atk");
		Label vueHp = (Label)lookup("#servant-hp");
		Label vueClass = (Label)lookup("#servant-class");
		Label vueRarity = (Label)lookup("#servant-rarity");

		vueName.setText(servant.getNom());
		vueNP.setText("NP: " + servant.getNp());
		vueAtk.setText("Attaque : " + servant.getAtk());
		vueHp.setText("Points de vie : " + servant.getPv());
		vueClass.setText(servant.getClasse());
		vueRarity.setText(servant.getRarete()+"*");
	}
	
}
