package controleur;

import com.sun.media.jfxmedia.logging.Logger;

import architecture.Controleur;
import donnee.PokemonDAO;
import modele.Pokemon;
import vue.VuePokemon;

public class ControleurPokemon extends Controleur {

	public ControleurPokemon()
	{
		Logger.logMsg(Logger.INFO, "new ControleurNumerique()");
	}
	public void initialiser()
	{
		VuePokemon vue = VuePokemon.getInstance();
		
		PokemonDAO pokemonDAO = new PokemonDAO();
		Pokemon poke = pokemonDAO.recupererPokemon();
		
		vue.afficherPokemon(poke);
	}

}
