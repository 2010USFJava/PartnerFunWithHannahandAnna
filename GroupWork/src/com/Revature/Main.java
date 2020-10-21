package com.Revature;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Toy a= new Toy("Pig","Piggie",4);
		System.out.println(a);
		Toy b =new Toy("Rope","rope",7);
		System.out.println(b);
		Toy c =new Toy("Ball","ball",0);
		System.out.println(c);
		Dog r= new Dog("Romeo",55,"Border Collie",a);
		System.out.println(r);
	}

}
