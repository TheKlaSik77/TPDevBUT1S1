/*
 * Ce programme choisit un entier au hasard entre 1 et 999, le but est de trouver cet entier
 * A l'aide de ses indications.
 */

import java.util.Scanner;

public class DevinerUnEntier {

    static final int NB_ESSAIS_MAX = 12;
    static final int NB_MAX = 999;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        int essaiActuel = 1;

        int nbMystere = ((int)(Math.random() * NB_MAX) + 1);
        System.out.println("-------------------------");
        System.out.println("Je pense à un nombre entre 1 et " + NB_MAX + ". Allez vous le retrouver ? Tu as " + NB_ESSAIS_MAX + " essais.");
        int nbPropose = 0;
        do{
            do{
                System.out.print("Saisissez un nombre entre 1 et " + NB_MAX + " : ");
                nbPropose = scanner.nextInt();

            } while (nbPropose < 0 || nbPropose > NB_MAX);

            if (nbPropose == nbMystere){
                System.out.println("Bravo! Tu m'as battu en " + essaiActuel + "coups, c'était bien " + nbMystere + ". Snif!");
                System.exit(0);
            } else if (nbPropose > nbMystere){
                System.out.println("Trop grand !");
            } else if (nbPropose < nbMystere){
                System.out.println("Trop petit !");
            }

            essaiActuel++;
            System.out.println("-------------------------");
        } while ( essaiActuel <= NB_ESSAIS_MAX);
        System.out.println("Tu as Perdu ! BOUUUH! C'etait " + nbMystere + "!");
    }
}
