package pokemon;

import peleador.Peleador;

public abstract class Pokemon implements Peleador {

	// tipos de pokemon. ES MEJOR HACER LO DE LA CLASE EVOLUCIONADOR
	public static final int POKEMON_ELECTRICO = 1;
	public static final int POKEMON_FUEGO = 2;
	public static final int POKEMON_AGUA = 3;
	
	protected String nombre;

	public Pokemon(String nombre) {

		this.nombre = nombre;
	}

	public abstract int getTipo();

	public String getNombre() {
		return nombre;
	}

	public abstract int ataque();
	public abstract int defensa();
}
