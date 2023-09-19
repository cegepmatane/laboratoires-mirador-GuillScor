package vue;

import com.sun.media.jfxmedia.logging.Logger;

import architecture.Vue;
import controleur.ControleurPokemon;
import javafx.scene.control.Label;
import modele.Pokemon;

public class VuePokemon extends Vue {
	
	protected ControleurPokemon controleur;
	protected static VuePokemon instance = null; 
	public static VuePokemon getInstance() {if(null==instance)instance = new VuePokemon();return VuePokemon.instance;}; 
	
	private VuePokemon()  {
		super("pokemon.fxml", VuePokemon.class);
		Logger.logMsg(Logger.INFO, "new VueNumerique()");
		super.controleur = this.controleur = new ControleurPokemon();
	}
	
	public void afficherPokemon(Pokemon poke) {
		Label vueName = (Label)lookup("#name-pokemon");
		Label vueTypes = (Label)lookup("#type-pokemon");
		Label vueId = (Label)lookup("#pokemon-nb-pokedex");
		Label vueHeight = (Label)lookup("#pokemon-height");
		Label vueWeight = (Label)lookup("#pokemon-weight");
		
		vueName.setText(poke.getNom());
		vueTypes.setText(poke.getTypes());
		vueId.setText("N°" + poke.getId());
		vueHeight.setText(poke.getHeight() + "m");
		vueWeight.setText(poke.getWeight() + "kg");
		
		System.out.println(poke.getHeight());
	}
	
}
