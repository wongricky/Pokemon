package com.pokemon;

public interface PokemonInterface {
	public static Pokemon createPokemon(String name, int health, String type) {
		System.out.println("New pokemon created: " + name);
		return new Pokemon(type, health, type);
	}
	public static String pokemonInfo(Pokemon pokemon) {
		return("Name: " + pokemon.name +"\nHealth: "+ pokemon.health + "\nType: "+ pokemon.type);
	}
	public static void listPokemon() {
		System.out.println("Here are all the Pokemons: " + Pokemon.getAllPokemons());
	};
}
