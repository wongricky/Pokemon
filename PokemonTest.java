package com.pokemon;

public abstract class PokemonTest extends AbstractPokemon{

	public static void main(String[] args) {
		Pokedex dex = new Pokedex();
		Pokemon pikachu = dex.createPokemon("Pikachu", 100, "Electric");
		System.out.println(dex.pokemonInfo(pikachu));
		Pokemon eevee = dex.createPokemon("Eevee", 100, "Normal");
		pikachu.attackPokemon(eevee);
		Pokemon bulbasaur = dex.createPokemon("Bulbasuar", 100, "Grass");
		
		System.out.println(dex.pokemonInfo(eevee));
		
		System.out.println("Number of Pokemons: " + Pokemon.getNumOfPokemons());
		dex.listPokemon();
	}
	
}
