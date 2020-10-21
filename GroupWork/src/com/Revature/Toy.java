package com.Revature;

public class Toy {
	private String name;
	private String nickname;
	private int damageRating;
	 public Toy() {
		 
	 }
	 public Toy(String name, String nickname, int damageRating) {
		 this.name=name;
		 this.nickname=nickname;
		 this.damageRating=damageRating;
	 }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public int getDamageRating() {
		return damageRating;
	}
	public void setDamageRating(int damageRating) {
		this.damageRating = damageRating;
	}
	@Override
	public String toString() {
		return "Toy [name=" + name + ", nickname=" + nickname + ", damageRating=" + damageRating + "]";
	}
	 
}
