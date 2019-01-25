package fr.adaming.MyFirstProject.ch3;

public class MaitreAnimal {

	  public static void main(String[] args) {

	    String reactionAnimal;	

	    AnimalFamilier monAnimal = new AnimalFamilier();

	    monAnimal.manger();
	    reactionAnimal = monAnimal.dire("Miaou !! Miaou !!");
	    System.out.println(reactionAnimal);
	  
	    monAnimal.dormir();
		  
	  }
	  
	}