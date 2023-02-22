package pokemon;

public interface Evolucionador {

	// evoluciones pokemon
	public static enum Pokemons { RAICHU, CHARMELEON, WARTORTLE, PIKACHU, SQUIRTLE }

	public Pokemons evolucion();
}
