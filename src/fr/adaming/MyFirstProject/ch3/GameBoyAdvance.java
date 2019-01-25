package fr.adaming.MyFirstProject.ch3;

public class GameBoyAdvance {
	  String typeCartouche;
	  int largeurEcran;
	  
	public static void main(String[] args) {
		int x;
		int y;
		x = 5;
		y = x + 2;
		int monScore = 5;
		monScore += 1;
		
		System.out.println("x : " + x);
		System.out.println("y : " + y);
		System.out.println("monScore : "+monScore);
	
		
		char niveau = 'E';
		int chaises = 12;                            
		boolean sonActif = false;         
		double revenuNational = 23863494965745.78; 
		float prixJeu = 12.50f;      
		long totalVoitures = 4637283648392l;
		
		System.out.println("niveau de type char : "+niveau);
		System.out.println("chaises de type int : "+chaises);
		System.out.println("sonActif de type boolean : "+sonActif);
		System.out.println("revenuNational de type double : "+revenuNational);
		System.out.println("prixJeu de type float "+prixJeu);
		System.out.println("totalVoitures de type long "+totalVoitures);
		
		final String CAPITALE_ETAT = "Washington";
		
		x = 12;
		y = 12;
		
		int zx = x++;
		int zy = ++y;
		
		System.out.println("x : "+x+" et zx : "+zx);
		System.out.println("y : "+y+" et zy : "+zy);
	}
	  
	void demarrerJeu() {
	  }
	  void arreterJeu() {
	  }
	}