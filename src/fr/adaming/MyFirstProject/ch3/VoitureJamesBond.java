package fr.adaming.MyFirstProject.ch3;

public class VoitureJamesBond extends Voiture {
	
	public int rouler(int duree) {
		int distance = duree * 180;
		System.out.println("Whouah ! James Bond peut aller trois fois plus vite et parcourir une distance de " + distance);
		return distance;
	}

}
