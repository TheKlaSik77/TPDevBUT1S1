/*
 * Saisit l'âge et si l'utilisateur habite Montreuil et renvoie le prix 
 * du billet de bus du 122 bis avec une réduction de 30% si l'utilisateur
 * est de Montreuil.
*/

import java.util.Scanner;

public class TarifsBilletsBus122Bis{

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in).useDelimiter("\n");

		boolean reductionAccordee = false;
		double prix = 0;

		System.out.print("Insérez votre âge : ");
		int age = scanner.nextInt();

		if (age < 0 || age > 122){
			System.out.println("Age invalide! Veuillez indiquer une valeur entre 0 et 122");
		} else {
			System.out.print("Etes-vous de Montreuil ? (1 pour oui, 0 pour non) : ");
			int choix = scanner.nextInt();
			System.out.println();

			if (choix == 1){
				reductionAccordee = true;
			}

			if (age <= 3){

				if (reductionAccordee == true){
					prix = 0.25 * 0.70;
				} else {
					prix = 0.25;
				}
			} else if (age < 20 || age >= 65){

				if (reductionAccordee == true){
					prix = 0.80 * 0.70;
				} else {
					prix = 0.80;
				}
			} else {
				if (reductionAccordee == true){
					prix = 1.20 * 0.70;
				} else {
					prix = 1.20;
				}
			}

			int euros = (int)prix;
			int centimes = (int)((prix - euros) * 100) + 1;

			System.out.println("Le prix du billet de bus sera de : " + euros + " € et " + centimes + " centimes.");
		}	
	}
}