import java.util.Scanner;

public class HorrairesDuBus122{

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);

		int heuresProchainBus = 0;
		int minutesProchainBus = 0;
		int heuresSuivant = 0;
		int minutesSuivant = 0;

		// Boucle d'insertion de l'heure
		System.out.println("Inserez le nombre correspondant à l'heure actuelle (de 0 à 23), puis insérez le nombre correspondant aux minutes actuelles (de 0 à 59).");
		int heures = scanner.nextInt();
		int minutes = scanner.nextInt();

		while ((heures < 0 || heures > 23) || (minutes < 0 || minutes > 59)){
			System.out.println("Erreur de valeur (0 <= heure <= 23 et 0 <= minutes <= 60)! Veuillez Inserez le nombre correspondant à l'heure actuelle, puis insérez le nombre correspondant aux minutes actuelles.");
			heures = scanner.nextInt();
			minutes = scanner.nextInt();
		}

		// Affichage de l'heure actuelle, si les minutes sont entre 0 et 9, le programme affichera 0h05 et pas 0h5
		if (minutes >= 0 && minutes <= 9){
			System.out.println("Il est " + heures + " h 0" + minutes + ".");
		} else{
			System.out.println("Il est " + heures + " h " + minutes + ".");
		}

		// Premier cas de figure : Les bus ne circulent pas entre 21 h et 5 h tous les deux exclus.
		if ((heures > 21 || heures < 5) || (heures == 21 && minutes > 0)){
			System.out.println("Aucun bus ne circule à cette heure-ci.");
			heuresProchainBus = 5;
			minutesProchainBus = 0;
			heuresSuivant = 5;
			minutesSuivant = 10;

		// Deuxième cas de figure : Il y a un bus toutes les 10 minutes ( de 5h à 7h59 et de 19 h 30 à 21h)
		} else if ((heures >= 5 && heures < 8) || ((heures == 19) && (minutes >= 30)) || ((heures > 19) && (heures < 21)) || ((heures == 21) && (minutes == 0))){

			System.out.println("A cette heure ci, le bus passe toutes les 10 mins");
			
			// Cas du 21 h
			if (heures == 21 && minutes == 0){

				System.out.println("Départ Imminent!");
				heuresProchainBus = 5;
				minutesProchainBus = 0;
				heuresSuivant = 5;
				minutesSuivant = 10;
				

			// Cas du 20 h 50
			} else if ((heures == 20) && (minutes >= 50)) {

				heuresProchainBus = 21;
				minutesProchainBus = 0;
				heuresSuivant = 5;
				minutesSuivant = 0;
			
			} else if (heures == 7 && minutes >= 50){

				heuresProchainBus = 8;
				minutesProchainBus = 0;
				heuresSuivant = 8;
				minutesSuivant = 6;

			// Cas du départ imminent
			} else if (minutes % 10 == 0){
				System.out.println("Départ Imminent!");
				
				if (minutes == 50){

					heuresProchainBus = heures + 1;
					minutesProchainBus = 0;
					heuresSuivant = heuresProchainBus;
					minutesSuivant = minutesProchainBus + 10;

				} else if (minutes == 40){

					heuresProchainBus = heures;
					minutesProchainBus = minutes + 10;
					heuresSuivant = heuresProchainBus + 1;
					minutesSuivant = 0;

				} else {

					heuresProchainBus = heures;
					minutesProchainBus = ((minutes + 10) / 10) * 10;
					heuresSuivant = heuresProchainBus;
					minutesSuivant = ((minutesProchainBus + 10) / 10) * 10;

				}

			// Cas du "le prochain bus est dans ..."
			} else {

				if (minutes > 50){

					heuresProchainBus = heures + 1;
					minutesProchainBus = 0;
					heuresSuivant = heuresProchainBus;
					minutesSuivant = minutesProchainBus + 10;

				} else if (minutes > 40){

					heuresProchainBus = heures;
					minutesProchainBus = ((minutes + 10) / 10) * 10;
					heuresSuivant = heuresProchainBus + 1;
					minutesSuivant = 0;

				} else {

					heuresProchainBus = heures;
					minutesProchainBus = ((minutes + 10) / 10) * 10;
					heuresSuivant = heuresProchainBus;
					minutesSuivant = ((minutesProchainBus + 10) / 10) * 10;
				}

			} 
				
		
		// Troisième cas de figure : Il y a un bus toutes les 6 minutes (de 8h à 19 h 29)
		} else if ((heures >= 8 && heures < 19) || (heures == 19 && minutes < 30)){
			

			System.out.println("A cette heure ci, le bus passe toutes les 6 mins");
			
			// Cas du 19 h 24
			if (heures == 19 && minutes == 24){
				
				System.out.println("Départ Imminent!");
				
				heuresProchainBus = heures;
				minutesProchainBus = ((minutes + 6) / 6) * 6;
				heuresSuivant = heuresProchainBus;
				minutesSuivant = minutesProchainBus + 10;

			// Cas du > 19 h 24
			}else if (heures == 19 && minutes > 24){

				heuresProchainBus = heures;
				minutesProchainBus = ((minutes + 6) / 6) * 6;
				heuresSuivant = heuresProchainBus;
				minutesSuivant = minutesProchainBus + 10;

			// Cas du départ imminent
			} else if (minutes % 6 == 0){
				System.out.println("Départ Imminent!");
				
				if (minutes == 54){

					heuresProchainBus = heures + 1;
					minutesProchainBus = 0;
					heuresSuivant = heuresProchainBus;
					minutesSuivant = minutesProchainBus + 6;

				} else if (minutes == 48){

					heuresProchainBus = heures;
					minutesProchainBus = minutes + 6;
					heuresSuivant = heuresProchainBus + 1;
					minutesSuivant = 0;

				} else {

					heuresProchainBus = heures;
					minutesProchainBus = ((minutes + 6) / 6) * 6;
					heuresSuivant = heuresProchainBus;
					minutesSuivant = ((minutesProchainBus + 6) / 6) * 6;

				}

			
			// Cas du "le prochain bus est dans ..."
			} else {

				if (minutes > 54){

					heuresProchainBus = heures + 1;
					minutesProchainBus = 0;
					heuresSuivant = heuresProchainBus;
					minutesSuivant = minutesProchainBus + 6;

				} else if (minutes > 48){

					heuresProchainBus = heures;
					minutesProchainBus = ((minutes + 6) / 6) * 6;
					heuresSuivant = heuresProchainBus + 1;
					minutesSuivant = 0;

				} else {

					heuresProchainBus = heures;
					minutesProchainBus = ((minutes + 6) / 6) * 6;
					heuresSuivant = heuresProchainBus;
					minutesSuivant = ((minutesProchainBus + 6) / 6) * 6;
				}

			} 
			
		}
		
		if (minutesProchainBus >= 0 && minutesProchainBus <= 9){
			System.out.print("Le prochain bus passe à " + heuresProchainBus + " h 0" + minutesProchainBus);

			// Affichage de l'heure de passage du bus suivant le prochain bus
			if (minutesSuivant >= 0 && minutesSuivant <= 9){
				System.out.println(", le suivant à " + heuresSuivant + " h 0" + minutesSuivant + ".");
			} else {
				System.out.println(", le suivant à " + heuresSuivant + " h " + minutesSuivant + ".");
			}

		} else {

			System.out.print("Le prochain bus passe à " + heuresProchainBus + " h " + minutesProchainBus);

			// Affichage de l'heure de passage du bus suivant le prochain bus
			if (minutesSuivant >= 0 && minutesSuivant <= 9){
				System.out.println(", le suivant à " + heuresSuivant + " h 0" + minutesSuivant + ".");
			} else {
				System.out.println(", le suivant à " + heuresSuivant + " h " + minutesSuivant + ".");
			}
			
		}
		
	}

}

// de 5h à 8h inclus fait
// de 19h30 à 21h fait
// de 21h à 5 h fait
