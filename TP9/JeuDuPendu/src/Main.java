import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        int choix = 0;

        do {
            Affichage.jeu();
            System.out.println("-------------------------\n\n Voulez-vous rejouer ?\n1. Oui\n2.Non\n(1 ou 2)? ");
            choix = scanner.nextInt();
            while (choix < 1 || choix > 2){
                System.out.println("-------------------------\n\n Erreur choix invalide! Voulez-vous rejouer ?\n1. Oui\n2. Non\n(1 ou 2)? ");
                choix = scanner.nextInt();
            }
        } while(choix == 1);

        System.out.println("C'était un plaisir de jouer avec vous! A la prochaine!");

    }
}