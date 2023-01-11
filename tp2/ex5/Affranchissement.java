import java.util.Scanner;

public class Affranchissement{

	public static void main(String[] args){

		double prix = 0;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Insérez le poids de votre lettre : ");
		double poids = scanner.nextInt();
		System.out.print("Insérez Une valeur (0 pour envoyer vers la France, 1 pour une destination internationnale) : ");
		int destination = scanner.nextInt();

		if (poids <= 0){
			System.out.println("Erreur votre lettre n'existe pas!");
		} else if (poids > 250){
			System.out.println("Allez donc voir à la poste!");
		} else if (destination == 0 || destination == 1){

			if (destination == 0){

				if (poids <= 20)
					prix = 1.56;
				else if (poids <= 100)
					prix = 2.64;
				else 
					prix = 4.42;


			} else if (destination == 1){

				if (poids <= 20)
					prix = 4.0;
				else if (poids <= 100)
					prix = 5.50;
				else 
					prix = 10.00;
			}
			System.out.println("Le prix de la lettre est de " + prix + "€.");
		} else {
				System.out.println("Destination incorrecte!");
		}


		
	}
}