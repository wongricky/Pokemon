package com.pokemon;

public abstract class AbstractPokemon implements PokemonInterface {
	
	
	public String pokemonInfo(Pokemon pokemon){
		return("Name: " + pokemon.name +"\nHealth: "+ pokemon.health + "\nType: "+ pokemon.type);
	};
	
	public abstract Pokemon createPokemon(String name, int health, String type);
	public abstract void listPokemon();
	
}
