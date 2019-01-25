package fr.adaming.MyFirstProject.ch2;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World");
		afficherAdresse(2,"rue Hegel",59160,"Lomme");
		// TODO Auto-generated method stub
	}
	
	public static void afficherAdresse(int numRue, String nomRue, int codePostal, String nomVille) {
		System.out.print("J'habite au ");
		System.out.print(numRue + " " + nomRue + " ");
		System.out.print(codePostal + " " + nomVille);
	}
	
//	public static void bonjourEtoile() {
//		System.out.print("******    ***   **  ***   ****   ***   ");
//	}

}