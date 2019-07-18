package com.pokemon;

import java.util.ArrayList;

public class Pokedex extends AbstractPokemon {
	ArrayList<Pokemon>allPokemons;
	
	public Pokedex() {
		allPokemons = new ArrayList<Pokemon>();
	}
	
	public void listPokemon() {
		for (int i = 0; i < allPokemons.size(); i ++) {
			System.out.println(allPokemons.get(i).getName());
		}
	};
	
	@Override
	public Pokemon createPokemon(String name, int health, String type) {
		System.out.println("New pokemon created: " + name);
		Pokemon p = new Pokemon(name, health, type);
		allPokemons.add(p);
		return p;
	}
	
	



}
