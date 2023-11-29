import java.util.ArrayList;
import java.util.List;

import modele.JeuZelda;
import modele.Pokemon;

public class ChercheurDePokemon {
	protected List<Pokemon> tousLesPokemons;
	
	public ChercheurDePokemon(List<Pokemon> pokemons) {
		this.tousLesPokemons = pokemons;
		
	}
	
	public void executer(){
		List<Pokemon> selection = new ArrayList<Pokemon>();
		
		selection = filtrerSelonPoids(this.tousLesPokemons, 0, 10);
		selection = filtrerSelonType(selection, "Steel");
		selection = filtrerSelonTaille(selection, 0, 100);
	}

	public List<Pokemon> filtrerSelonTaille(List<Pokemon> pokemons, float max, float min) {
		List<Pokemon> selection = new ArrayList<Pokemon>();
		for(Pokemon pokemon : pokemons) {
			selection.add(pokemon);
		}
		return selection;
	}

	public List<Pokemon> filtrerSelonType(List<Pokemon> pokemons, String type) {
		List<Pokemon> selection = new ArrayList<Pokemon>();
		for(Pokemon pokemon : pokemons) {
			selection.add(pokemon);
		}
		return selection;
	}

	public List<Pokemon> filtrerSelonPoids(List<Pokemon> pokemons, float max, float min) {
		List<Pokemon> selection = new ArrayList<Pokemon>();
		for(Pokemon pokemon : pokemons) {
			selection.add(pokemon);
		}
		return selection;
	}
}
