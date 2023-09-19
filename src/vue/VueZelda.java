package vue;

import java.util.List;

import com.sun.media.jfxmedia.logging.Logger;

import architecture.Vue;
import controleur.ControleurZelda;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import modele.JeuZelda;

public class VueZelda extends Vue {
	
	protected ControleurZelda controleur;
	
	protected static VueZelda instance = null; 
	public static VueZelda getInstance()  { if(null==instance) instance = new VueZelda(); return VueZelda.instance;}; 
	
	private VueZelda()  {
		super("jeuxzelda.fxml", VueZelda.class);
		Logger.logMsg(Logger.INFO, "new VueAmis()");
		super.controleur = this.controleur = new ControleurZelda();
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void afficherListeZelda(List<JeuZelda> listeJeuxZelda) {
		TableView tableau = (TableView)lookup("#zelda-table");
		TableColumn colonneNom = (TableColumn) tableau.getColumns().get(0);
		TableColumn colonneDate = (TableColumn) tableau.getColumns().get(1);
		TableColumn colonneDescription = (TableColumn) tableau.getColumns().get(2);
		colonneNom.setCellValueFactory(new PropertyValueFactory<>("nom"));
		colonneDate.setCellValueFactory(new PropertyValueFactory<>("date_sortie"));
		colonneDescription.setCellValueFactory(new PropertyValueFactory<>("description"));
		
		for(JeuZelda jeuZelda : listeJeuxZelda) {
			tableau.getItems().add(jeuZelda);
			System.out.println("Jeu : " + jeuZelda.getNom());
		}
	}
	
}
