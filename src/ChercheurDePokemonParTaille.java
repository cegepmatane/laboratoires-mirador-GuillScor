import java.util.ArrayList;
import java.util.List;

import modele.Pokemon;

public class ChercheurDePokemonParTaille extends ChercheurDePokemon{
	
	public ChercheurDePokemonParTaille(List<Pokemon> pokemons) {super(pokemons);}
	
	public List<Pokemon> filtrerSelonTaille(List<Pokemon> pokemons, float max, float min) {
		List<Pokemon> selection = new ArrayList<Pokemon>();
		for(Pokemon pokemon : pokemons) {
			if(pokemon.getHeight()>= min && pokemon.getHeight() <= max) {
				selection.add(pokemon);
			}
		}
		return selection;
	}
}
