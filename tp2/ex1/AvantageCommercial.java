/*
 * Juste un exemple de déclaration et utilisation d'une constante.
 */

import java.util.Scanner;

public class AvantageCommercial {

	final static int REDUCTION = 5;
	final static double PRIX_DECLANCHEMENT = 200.0;

	public static void main(String[] args) {	

		Scanner scanner = new Scanner(System.in);

		System.out.println("Quel est le prix de l'article?");

		double prix = scanner.nextDouble();


		if(prix > PRIX_DECLANCHEMENT){

			System.out.println("Le prix après reduction est de : " + (((100 - REDUCTION) * prix)/100.0) + ".");

		} else{

			System.out.println("Le prix est de : "+ prix + ".");
		}

		scanner.close();

		

	}

}
