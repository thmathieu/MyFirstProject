package fr.adaming.MyFirstProject.ch3;

public class MaitrePoisson {

	  public static void main(String[] args) {
			
	    Poisson monPoisson = new Poisson();
			
	    // Essayons de plonger plus profond que 100 mètres
	    monPoisson.plonger(4);
	    monPoisson.plonger(97);
	    monPoisson.plonger(50);
	    monPoisson.plonger(64);
			
	    monPoisson.dormir();
	  }
	}
