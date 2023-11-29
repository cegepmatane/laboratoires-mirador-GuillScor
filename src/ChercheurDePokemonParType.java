import java.util.ArrayList;
import java.util.List;

import modele.Pokemon;

public class ChercheurDePokemonParType extends ChercheurDePokemon{
	
	public ChercheurDePokemonParType(List<Pokemon> pokemons) {super(pokemons);}
	
	public List<Pokemon> filtrerSelonType(List<Pokemon> pokemons, String type) {
		List<Pokemon> selection = new ArrayList<Pokemon>();
		for(Pokemon pokemon : pokemons) {
			if(pokemon.getTypes() == type) {
				selection.add(pokemon);
			}
		}
		return selection;
	}
}
