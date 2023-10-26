package vue;


import com.sun.media.jfxmedia.logging.Logger;

import architecture.Vue;
import controleur.ControleurOperator;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import modele.Operator;

public class VueOperator extends Vue {

	protected ControleurOperator controleur;
	protected static VueOperator instance = null; 
	public static VueOperator getInstance() {if(null==instance)instance = new VueOperator();return VueOperator.instance;}; 
	
	private VueOperator() 
	{
		super("operator.fxml", VueOperator.class);
		super.controleur = this.controleur = new ControleurOperator();
		Logger.logMsg(Logger.INFO, "new VueMirador()");
	}
		
	public void activerControles()
	{
		super.activerControles();
	}

	public void afficherOperator(Operator op) {
		Label vueName = (Label)lookup("#nom-op");
		Label vueClass = (Label)lookup("#class-op");
		Label vueAtk = (Label)lookup("#atk-op");
		Label vueDef = (Label)lookup("#def-op");
		Label vueHp = (Label)lookup("#hp-op");
		TextArea vueDescription = (TextArea)lookup("#quote-op");
		ImageView vueImage1 = (ImageView)lookup("#image1-op");
		ImageView vueImage2 = (ImageView)lookup("#image2-op");
		
		vueName.setText("Operator " + op.getNom());
		vueClass.setText(op.getJob());
		vueAtk.setText("Atk : " + op.getAtk());
		vueDef.setText("Def : " + op.getDef());
		vueHp.setText("Hp : " + op.getHp());
		vueDescription.setText(op.getDescription());
		vueImage1.setImage(new Image(op.getImage1()));
		vueImage2.setImage(new Image(op.getImage2()));
	}
}
