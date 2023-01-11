/*
 * Ce programme saisit une date et indique en quelle saison nous sommes (fonctionne pour l'année 2022-2023).
*/

import java.util.Scanner;

public class QuelleSaison{

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in).useDelimiter("\n");

		String saison = "hiver";
		System.out.print("Saisissez un jour : ");
		int jour = scanner.nextInt();

		System.out.print("Saisissez un mois (en chiffre) : ");
		int mois = scanner.nextInt();

		boolean correcte = false;

		if ((jour < 1 || jour > 31) || (mois < 1 || mois > 12)){
			correcte = false;
		} else {

			if (mois == 1 || mois == 3 || mois == 5 || mois == 7 || mois == 8 || mois == 10 || mois == 12){
				correcte = true;

			} else if (mois == 2) {

				if (jour <= 29){
					correcte = true;
				} else {
					correcte = false;
				}

			} else {

				if (jour != 31){
					correcte = true;

				} else {
					correcte = false;
				}
			}
		}

		if (correcte == true){
			
			//Cas de la deuxième partie de l'Hiver (du 1er janvier au 19 mars)
			if (mois < 3 || ((jour >= 1 && jour < 20) && (mois == 3))){
				saison = "hiver";
			
			//Cas Printemps (du 20 mars au 20 juin)
			} else if (mois < 6 || (jour >= 1 && jour < 21) && (mois == 6)){
				saison = "printemps";

			// Cas Ete (du 21 juin au 22 septembre)
			} else if (mois < 9 || (jour >= 1 && jour < 23) && (mois == 9)){
				saison = "été";

			// Cas Automne (du 23 septembre au 20 decembre)
			} else if (mois < 12 || (jour >= 1 && jour < 21) && (mois == 12)){
				saison = "automne";
			
			// Cas de la première partie de l'Hiver (du 21 decembre au 31 decembre)
			} else {
				saison = "hiver";
			}

			System.out.println("Nous sommes actuellement en " + saison + ".");

		} else {
			System.out.println("Date Incorrecte");
		}
	}
}