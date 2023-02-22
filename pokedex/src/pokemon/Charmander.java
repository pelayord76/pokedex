package pokemon;

public class Charmander extends Pokemon implements Evolucionador {

	private int combustible;

	public Charmander(String nombre) {

		super(nombre);
		combustible = 100;
	}

	@Override
	public int getTipo() {
		return Pokemon.POKEMON_FUEGO;
	}

	@Override
	public int ataque() {
		return 80;
	}

	@Override
	public int defensa() {
		return 20;
	}

	@Override
	public Pokemons evolucion() {
		return Evolucionador.Pokemons.CHARMELEON;
	}
}
