import java.util.Scanner;

public class HorrairesBoulangerie{

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);

		boolean ouvert = false;

		System.out.print("Insérez le numéro correspondant au jour de la semaine : ");
		int jour = scanner.nextInt();

		System.out.print("Insérez l'heure (entre 0 et 23) : ");
		int heure = scanner.nextInt();

		if ((heure < 0 || heure > 23) || (jour < 1 || jour > 7)){
			System.out.println("Erreur de saisie dans l'heure ou le jour");
		} else {

			if (jour == 7){
				if (heure >=7 && heure < 13){
					ouvert = true;
				} else {
					ouvert = false;
				}
			} else if (jour == 1){
				ouvert = false;
			} else {
				if ((heure >= 7 && heure < 13) || (heure >= 16 && heure < 19)){
					ouvert = true;
				} else {
					ouvert = false;
				}

			}
			if (ouvert){
				System.out.println("La boulangerie est ouverte! ");
			} else {
				System.out.println("La boulangerie est fermée! ");
			}
		}

	}

}