package fr.adaming.MyFirstProject.ch3;

public class Poisson extends AnimalFamilier {
	  int profondeurCourante = 0;
	  int profondeurMax = 200;

	  public int plonger(int combienDePlus) {
	    profondeurCourante = profondeurCourante + combienDePlus;
	    if (profondeurCourante > profondeurMax) {
	      System.out.println("Je suis un petit " 
	        + " poisson et je ne peux pas plonger" 
	        + " plus profond que "
	        + profondeurMax + " mètres");
	      profondeurCourante = profondeurCourante 
	                                         - combienDePlus;
	    }
	    else {
	      System.out.println("Plongée de " + combienDePlus 
	                                         + " mètres");
	      System.out.println("Je suis à " + profondeurCourante 
	                       + " mètres sous le niveau de la mer");
	    }
	    return profondeurCourante; 
	  }

	  public String dire(String unMot) {
	    return "Ne sais-tu pas que les poissons ne"
	                                + " parlent pas ?";
	  } 
	}
