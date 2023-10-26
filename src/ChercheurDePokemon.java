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
		
		selection = filtrerSelonMotsClés(this.tousLesPokemons);
		selection = filtrerSelonType(selection);
		selection = filtrerSelonTailleMin(selection);
	}

	public List<Pokemon> filtrerSelonTailleMin(List<Pokemon> pokemons) {
		List<Pokemon> selection = new ArrayList<Pokemon>();
		for(Pokemon pokemon : pokemons) {
			selection.add(pokemon);
		}
		return selection;
	}

	public List<Pokemon> filtrerSelonType(List<Pokemon> pokemons) {
		List<Pokemon> selection = new ArrayList<Pokemon>();
		for(Pokemon pokemon : pokemons) {
			selection.add(pokemon);
		}
		return selection;
	}

	public List<Pokemon> filtrerSelonMotsClés(List<Pokemon> pokemons) {
		List<Pokemon> selection = new ArrayList<Pokemon>();
		for(Pokemon pokemon : pokemons) {
			selection.add(pokemon);
		}
		return selection;
	}
}
