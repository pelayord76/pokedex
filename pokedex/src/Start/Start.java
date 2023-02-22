package Start;

import gimnasio.Gimnasio;
import pokemon.Charmander;
import pokemon.Pikachu;
import pokemon.Pokemon;
import pokemon.Squirtle;
import robots.Robot;

public class Start {

	public static void main(String[] args) {

		Pikachu pika = new Pikachu("Kachu");
		Robot atom = new Robot("Atom");

		Gimnasio goFit = new Gimnasio();
		goFit.batalla(pika, atom);

		Pokemon[] MiPokedex = new Pokemon[3];
		MiPokedex[0] = new Pikachu("Pika");
		MiPokedex[1] = new Charmander("Char");
		MiPokedex[2] = new Squirtle("Squirt");

		for (Pokemon pokemon : MiPokedex) {

			// nombre del pokemon
			System.out.println("Nombre: " + pokemon.getNombre());

			// tipo del pokemon
			switch (pokemon.getTipo()) {

			case Pokemon.POKEMON_ELECTRICO: System.out.println("Tipo: Eléctrico"); break;
			case Pokemon.POKEMON_FUEGO: System.out.println("Tipo: Fuego"); break;
			case Pokemon.POKEMON_AGUA: System.out.println("Tipo: Agua"); break;
			}
			
			
		}
	}
}
