package fr.adaming.MyFirstProject.ch4;

public class BulletinAppreciation {

/**
* Cette méthode attend un argument entier - la note du devoir - 
* et retourne une mention, O, E, A, P, D ou T, en fonction de sa valeur. 
*/
  public char convertirNiveaux(int noteDevoir) {
    char niveau;

    if (noteDevoir >= 19) {
      niveau = 'O'; // note " Optimal "
    }
    else if (noteDevoir >= 15 && noteDevoir < 19) {
	niveau = 'E'; // note " Exceptionnel "
    }
    else if (noteDevoir >= 10 && noteDevoir < 15) {
	niveau = 'A'; // note " Acceptable "
    }
    else if (noteDevoir >= 7 && noteDevoir < 10) {
	niveau = 'P'; // note " Piètre "
    }
    else if (noteDevoir >= 3 && noteDevoir < 7) {
	niveau = 'D'; // note " Désolant "
    }
    else {
	niveau = 'T'; // note " Troll "
    }
    return niveau;
  }

  public static void main(String[] args) {

	  BulletinAppreciation convertisseur = new BulletinAppreciation();
	  char tonNiveau = convertisseur.convertirNiveaux(15);

	  switch (tonNiveau) {

	    case 'O':
	       System.out.println("Performance optimale !");
		 break;
	    case 'E':
		 System.out.println("Effort exceptionnel !");	
		 break;
	    case 'A':
		 System.out.println("C'est acceptable !");
		 break;
	    case 'P':
		 System.out.println("Piètre performance !");
	 	 break;
	    case 'D':
		 System.out.println("C'est décevant !");
	 	 break;
	    case 'T':
	       System.out.println("Espèce de troll !");
		 break;
	  }
	}	
}