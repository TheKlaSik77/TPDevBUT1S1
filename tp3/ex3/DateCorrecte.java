/*
 * Ce programme saisit une date (jour/mois/année) et indique si cette date est correcte ou pas en tenant compte des années bissextiles.
*/
import java.util.Scanner;

public class DateCorrecte{

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in).useDelimiter("\n");

		System.out.print("Saisissez un jour : ");
		int jour = scanner.nextInt();

		System.out.print("Saisissez un mois (en chiffre) : ");
		int mois = scanner.nextInt();

		System.out.print("Saisissez l'année : ");
		int annee = scanner.nextInt();


		if ((jour < 1 || jour > 31) || (mois < 1 || mois > 12)){
			System.out.println("Date incorrecte");
		} else {

			if (mois == 1 || mois == 3 || mois == 5 || mois == 7 || mois == 8 || mois == 10 || mois == 12){
				System.out.println("La date est correcte!");

			} else if (mois == 2) {

				//Cas année bissextile ou non
				// On teste si l'année est divisible par 4 ou pas
				if (annee % 4 == 0){
					if (jour <= 29){
						System.out.println("La date est correcte!");
					} else {
						System.out.println("La date est incorrecte!");
					}
				} else {
					if (jour <= 28){
						System.out.println("La date est correcte!");
					} else {
						System.out.println("La date est incorrecte!");
					}
				}



			} else {

				if (jour != 31){
					System.out.println("La date est correcte!");

				} else {
					System.out.println("La date est incorrecte");
				}
			}
		}
	}
}