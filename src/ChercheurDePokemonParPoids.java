import java.util.ArrayList;
import java.util.List;

import modele.Pokemon;

public class ChercheurDePokemonParPoids extends ChercheurDePokemon{
	
	public ChercheurDePokemonParPoids(List<Pokemon> pokemons) {super(pokemons);}
	
	public List<Pokemon> filtrerSelonPoids(List<Pokemon> pokemons, float max, float min) {
		List<Pokemon> selection = new ArrayList<Pokemon>();
		for(Pokemon pokemon : pokemons) {
			if(pokemon.getWeight()>= min && pokemon.getWeight() <= max) {
				selection.add(pokemon);
			}
		}
		return selection;
	}
}
