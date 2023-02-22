package pokemon;

public class Squirtle extends Pokemon implements Evolucionador {

	private int amnea;

	public Squirtle(String nombre) {

		super(nombre);
		amnea = 100;
	}

	@Override
	public int getTipo() {
		return Pokemon.POKEMON_AGUA;
	}

	@Override
	public int ataque() {
		return 20;
	}

	@Override
	public int defensa() {
		return 80;
	}

	@Override
	public Pokemons evolucion() {
		return Evolucionador.Pokemons.WARTORTLE;
	}
}
