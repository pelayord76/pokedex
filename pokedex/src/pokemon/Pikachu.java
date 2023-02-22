package pokemon;

public class Pikachu extends Pokemon implements Evolucionador {

	private int carga;

	public Pikachu(String nombre) {

		super(nombre);
		carga = 100;
	}

	@Override
	public int getTipo() {
		return Pokemon.POKEMON_ELECTRICO;
	}

	@Override
	public int ataque() {
		return 50;
	}

	@Override
	public int defensa() {
		return 50;
	}

	@Override
	public Pokemons evolucion() {
		return Evolucionador.Pokemons.RAICHU;
	}
}
