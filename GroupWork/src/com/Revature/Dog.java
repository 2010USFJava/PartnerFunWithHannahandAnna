package com.Revature;

public class Dog {
	//variables
	
	private String name;
	private int weight;
	private String breed;
	private Toy favoriteToy;
	
	//constructors
	public Dog() {}
	public Dog(String name, int weight, String breed, Toy favoriteToy) {
		this.name=name;
		this.weight=weight;
		this.breed=breed;
		this.favoriteToy=favoriteToy;
		
	}
	
	//getters and setters
	public String getName() {
		return name;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public String getBreed() {
		return breed;
		
	}
	
	public Toy getFavoriteToy() {
		return favoriteToy;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setWeight(int weight) {
		this.weight=weight;
	}
	
	public void setBreed(String breed) {
		this.breed=breed;
		
	}
	
	public void setFavoriteToy(Toy toy) {
		this.favoriteToy=toy;
	}
	
	@Override
	public String toString() 
	{
		return "Dog: Name="+name+" Weight="+weight+" Breed="+breed+" FavoriteToy="+favoriteToy.getName();
		
	}
	
	
	
	
	

}