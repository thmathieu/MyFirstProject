package fr.adaming.MyFirstProject.ch3;

public class AnimalFamilier {
	
	int age;
	float poids;
	float taille;
	String couleur;
	
	public void dormir() {
		System.out.println("Bonne nuit, à demain");
	}
	
	public void manger() {
		System.out.println("J'ai si faim ... Donne-moi un biscuit !");
	}
	
	public String dire(String unMot) {
		String reponseAnimal = "OK !! OK !! " + unMot;
		return reponseAnimal;
	}

}
