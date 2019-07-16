package com.pokemon;

public abstract class AbstractPokemon implements PokemonInterface {
	
	
	public abstract String pokemonInfo(Pokemon pokemon);
	public abstract Pokemon createPokemon(String name, int health, String type);
	public abstract void listPokemon();
	
}
