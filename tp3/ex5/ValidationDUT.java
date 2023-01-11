/*
 * Ce programme demande la saisie des moyennes de deux UE par semestre et indique si l'élève à validé le Semestre. Si non, indique si il a validé un semestre ou certaines UE.
*/

import java.util.Scanner;

public class ValidationDUT{

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in).useDelimiter("\n");

		System.out.print("Saisissez la moyenne de l'UE1 du semestre 1 : ");
		double ue1S1 = scanner.nextDouble();

		System.out.print("Saisissez la moyenne de l'UE2 du semestre 1 : ");
		double ue2S1 = scanner.nextDouble();

		System.out.print("Saisissez la moyenne de l'UE1 du semestre 2 : ");
		double ue1S2 = scanner.nextDouble();

		System.out.print("Saisissez la moyenne de l'UE2 du semestre 2 : ");
		double ue2S2 = scanner.nextDouble();

		double moyenneS1 = ((ue1S1 * 17) + (ue2S1 * 13)) / 30;
		double moyenneS2 = ((ue1S2 * 16) + (ue2S2 * 14)) / 30;

		double moyenneTot = (moyenneS1 + moyenneS2) / 2;

		boolean valideUe1S1 = false;
		boolean valideUe2S1 = false;
		boolean valideUe1S2 = false;
		boolean valideUe2S2 = false;

		// Test validations ue
		if (ue1S1 >= 10)
			valideUe1S1 = true;
		if (ue2S1 >= 10)
			valideUe2S1 = true;
		if (ue1S2 >= 10)
			valideUe1S2 = true;
		if (ue2S2 >= 10)
			valideUe2S2 = true;

		boolean valideS1 = false;
		boolean valideS2 = false;
		boolean valideS1AvecComp = false;
		boolean valideS2AvecComp = false;

		// Test validation Semestre 1
		if (valideUe1S1 == true && valideUe2S1 == true){
			valideS1 = true;
		} else if (ue1S1 >= 8 && ue2S1 >= 8){
			valideS1AvecComp = true;
		}

		// Test validation Semestre 2 
		if ((valideUe1S2 == true && valideUe2S2 == true)){
			valideS2 = true;
		} else if (ue1S2 >= 8 && ue2S2 >= 8){
			valideS2AvecComp = true;
		}

		
		// Gestion de l'affichage
		System.out.println("\n\n");

		// Cas Validé avec deux semestres Validés

		if (valideS1 && valideS2){
			System.out.println("S1 Validé");
			System.out.println("S2 Validé");
		
		// Cas compensation pour S1
		} else if (valideS2){
			if (valideS1AvecComp){	
				if (moyenneTot >= 10){
					System.out.println("S1 validé par Compensation");
					System.out.println("S2 validé");
				} else {
					System.out.println("S1 non validé compensable");

					if (valideUe1S1)
						System.out.println("UE1 du S1 Acquise");
					if (valideUe2S1)
						System.out.println("UE2 du S1 Acquise");

					System.out.println("S2 validé");
				}
			} else {
				System.out.println("S1 non validé non compensable");

				if (valideUe1S1)
					System.out.println("UE1 du S1 Acquise");
				if (valideUe2S1)
					System.out.println("UE2 du S1 Acquise");

				System.out.println("S2 non Validé compensable");

				if (valideUe1S2)
					System.out.println("UE1 du S2 Acquise");
				if (valideUe2S2)
					System.out.println("UE2 du S2 Acquise");
			}
				

		} else if (valideS1){
			if (valideS2AvecComp){
				if (moyenneTot >= 10){
					System.out.println("S1 Validé");
					System.out.println("S2 Validé par Compensation");
				} else {

					System.out.println("S1 Validé");
					System.out.println("S2 non Validé compensable");

					if (valideUe1S2)
						System.out.println("UE1 du S2 Acquise");
					if (valideUe2S2)
						System.out.println("UE2 du S2 Acquise");
				}
			} else {

				System.out.println("S1 Validé");
				System.out.println("S2 non Validé non compensable");

				if (valideUe1S2)
					System.out.println("UE1 du S2 Acquise");
				if (valideUe2S2)
					System.out.println("UE2 du S2 Acquise");
			}

		} else if (valideS1AvecComp && valideS2AvecComp){
			
			System.out.println("S1 non validé compensable");

			if (valideUe1S1)
				System.out.println("UE1 du S1 Acquise");
			if (valideUe2S1)
				System.out.println("UE2 du S1 Acquise");

			System.out.println("S2 non validé compensable");

			if (valideUe1S2)
				System.out.println("UE1 du S2 Acquise");
			if (valideUe2S2)
				System.out.println("UE2 du S2 Acquise");

		} else {
			
			if (valideS1AvecComp){

				System.out.println("S1 non validé compensable");

				if (valideUe1S1)
					System.out.println("UE1 du S1 Acquise");
				if (valideUe2S1)
					System.out.println("UE2 du S1 Acquise");
					
				System.out.println("S2 non validé non compensable");

				if (valideUe1S2)
					System.out.println("UE1 du S2 Acquise");
				if (valideUe2S2)
					System.out.println("UE2 du S2 Acquise");

			} else if (valideS2AvecComp){

				System.out.println("S1 non validé non compensable");

				if (valideUe1S1)
					System.out.println("UE1 du S1 Acquise");
				if (valideUe2S1)
					System.out.println("UE2 du S1 Acquise");
					
				System.out.println("S2 non validé compensable");

				if (valideUe1S2)
					System.out.println("UE1 du S2 Acquise");
				if (valideUe2S2)
					System.out.println("UE2 du S2 Acquise");
			} else {

				System.out.println("S1 non validé non compensable");

				if (valideUe1S1)
					System.out.println("UE1 du S1 Acquise");
				if (valideUe2S1)
					System.out.println("UE2 du S1 Acquise");
					
				System.out.println("S2 non validé non compensable");

				if (valideUe1S2)
					System.out.println("UE1 du S2 Acquise");
				if (valideUe2S2)
					System.out.println("UE2 du S2 Acquise");

			}
		}
	}
}