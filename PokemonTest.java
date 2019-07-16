package com.pokemon;

public abstract class PokemonTest extends AbstractPokemon{

	public static void main(String[] args) {
		Pokemon pikachu = new Pokemon("Pikachu", 100, "Electric");
		System.out.println(PokemonInterface.pokemonInfo(pikachu));
		Pokemon eevee = new Pokemon("Eevee", 100, "Normal");
		pikachu.attackPokemon(eevee);
		Pokemon bulbasaur = new Pokemon("Bulbasuar", 100, "Grass");
		
		System.out.println(PokemonInterface.pokemonInfo(eevee));
		
		System.out.println("Number of Pokemons: " + Pokemon.getNumOfPokemons());
		PokemonInterface.listPokemon();
	}
	
}
