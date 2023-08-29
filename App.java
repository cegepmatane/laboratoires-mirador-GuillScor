
public class App {

	public static void main(String[] args) {
		
		Operator op = new Operator();
		op.setNom("Skadi");
		System.out.println("Nom de l'operator:" + op.getNom());
		
		Companion comp = new Companion();
		comp.setNom("Kafka");
		System.out.println("Nom du companion:" + comp.getNom());
		
		JeuZelda jz = new JeuZelda();
		jz.setNom("Tears of the Kingdom");
		System.out.println("Nom du jeu Zelda:" + jz.getNom());
		
		Pokemon poke = new Pokemon();
		poke.setNom("Métalosse");
		System.out.println("Nom du Pokémon:" + poke.getNom());
		
		Servanto serv = new Servanto();
		serv.setNom("Senji Muramasa");
		System.out.println("Nom du servanto:" + serv.getNom());
		;
	}

}
