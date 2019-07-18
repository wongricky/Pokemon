package com.pokemon;

import java.util.ArrayList;

public class Pokemon {
	public String name;
	public int health = 0;
	public String type;
	public static int numberOfPokemons = 0;
	
	
	
	public Pokemon(String name, int health, String type) {
		this.name = name;
		this.health = health;
		this.type = type;
		System.out.println("Pokemon created: " + name);
		numberOfPokemons++;
	}
	
	void attackPokemon(Pokemon pokemon) {
		pokemon.health -= 10;
		System.out.println(pokemon.name + " has been attacked by " + name + "!");
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getHealth() {
		return this.health;
	}
	
	public void setName(int health) {
		this.health = health;
	}
	
	public String getType() {
		return this.type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public static int getNumOfPokemons() {
		return numberOfPokemons;
	}

}
