package fr.adaming.MyFirstProject.ch3;

public class Voiture {
	public void demarrer() {
		System.out.println("En avant ! La voiture d�marre");
	}
	
	public void arreter() {
		System.out.println("Stop ! La voiture s'arr�te");
	}
	
	public int rouler(int duree) {
		int distance = duree * 60;
		System.out.println("Vroum vroum ! La voiture a parcouru une distance de " + distance);
		return distance;
	}
}
