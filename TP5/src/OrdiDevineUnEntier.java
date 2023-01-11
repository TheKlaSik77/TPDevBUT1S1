/*
 * Le Programme demande à l'utilisateur de penser à un nombre, l'ordinateur propose un nombre, l'utilisateur dit si c'est + ou -.
 * Si l'ordinateur n'a pas trouvé au bout de NB_ESSAIS_MAX, alors l'utilisateur a gagné. Sinon, l'ordinateur a gagné.
 */

import java.util.Scanner;

public class OrdiDevineUnEntier {
    static final int NB_ESSAIS_MAX = 12;
    static final int NB_MAX = 999;

    public static void main(String[] args) {
        /*
        //Méthode 1 : Stratégie purement aléatoire :
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");

        int nbEssaiActuel = 1;
        int nbPropose = 0;

        int repUtil = -2;
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.print("Pensez à un nombre entier entre 0 et " + NB_MAX + " inclus, puis tapez entrée lorsque vous êtes prêt.");

        String entree = scanner.nextLine();
        System.out.println("----------------------------------------------------------------------------------------------------");

        do {

            nbPropose = ((int)(Math.random() * NB_MAX)) + 1;
            System.out.println("Essai n° "+ nbEssaiActuel +" : est-ce que " + nbPropose + " est le bon nombre ? Saisissez un nombre négatif si trop petit, un nombre positif si trop grand, 0 si nombre trouvé ");

            do {
                System.out.print("Insérez 0 si le nombre est trouvé, -1 si c'est trop petit, et 1 si c'est trop grand : ");
                repUtil = scanner.nextInt();
            }while(repUtil != -1 && repUtil != 0 && repUtil != 1);
            System.out.println("----------------------------------------------------------------------------------------------------");
            if (repUtil == 0) {
                System.out.println("Je suis un robot ! Personne ne me bat ! Je suis trop fort !");
                System.out.println("----------------------------------------------------------------------------------------------------");
                System.exit(0);
            } else if (repUtil == -1){
                System.out.println("Utilisateur : C'est trop petit !");
            } else if (repUtil == 1){
                System.out.println("Utilisateur : C'est trop grand !");
                }
                System.out.println("----------------------------------------------------------------------------------------------------");
                nbEssaiActuel++;
            }while(nbEssaiActuel <= NB_ESSAIS_MAX);

            System.out.println("COUIC !!");
        */
        /*
        //Méthode 2 : Stratégie utilisant les réponses l'utilisateur :
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");

        int nbEssaiActuel = 1;
        int nbPropose = 0;
        int min = 1;
        int max = NB_MAX;
        int repUtil = -2;
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.print("Pensez à un nombre entier entre 0 et " + NB_MAX + " inclus, puis tapez entrée lorsque vous êtes prêt.");

        String entree = scanner.nextLine();
        System.out.println("----------------------------------------------------------------------------------------------------");

        do {

            nbPropose = ((int)(Math.random() * (max - min + 1) + min));
            System.out.println("Essai n° "+ nbEssaiActuel +" : est-ce que " + nbPropose + " est le bon nombre ? Saisissez un nombre négatif si trop petit, un nombre positif si trop grand, 0 si nombre trouvé ");

            do {
                System.out.print("Insérez 0 si le nombre est trouvé, -1 si c'est trop petit, et 1 si c'est trop grand : ");
                repUtil = scanner.nextInt();
            }while(repUtil != -1 && repUtil != 0 && repUtil != 1);
            System.out.println("----------------------------------------------------------------------------------------------------");
            if (repUtil == 0) {
                System.out.println("Je suis un robot ! Personne ne me bat ! Je suis trop fort !");
                System.out.println("----------------------------------------------------------------------------------------------------");
                System.exit(0);
            } else if (repUtil == -1){
                System.out.println("Utilisateur : C'est trop petit !");
                min = nbPropose + 1;
            } else if (repUtil == 1){
                System.out.println("Utilisateur : C'est trop grand !");
                max = nbPropose - 1;
            }
            System.out.println("----------------------------------------------------------------------------------------------------");
            nbEssaiActuel++;
        }while(nbEssaiActuel <= NB_ESSAIS_MAX);

        System.out.println("COUIC !!");
        */
        // Méthode 3 : Recherche par dichotomie :

        Scanner scanner = new Scanner(System.in).useDelimiter("\n");

        int nbEssaiActuel = 1;
        int nbPropose = 0;
        int min = 1;
        int max = NB_MAX;
        int repUtil = -2;
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.print("Pensez à un nombre entier entre 0 et " + NB_MAX + " inclus, puis tapez entrée lorsque vous êtes prêt.");

        String entree = scanner.nextLine();
        System.out.println("----------------------------------------------------------------------------------------------------");

        do {

            nbPropose = (min + max) / 2;
            System.out.println("Essai n° "+ nbEssaiActuel +" : est-ce que " + nbPropose + " est le bon nombre ? Saisissez un nombre négatif si trop petit, un nombre positif si trop grand, 0 si nombre trouvé ");

            do {
                System.out.print("Insérez 0 si le nombre est trouvé, -1 si c'est trop petit, et 1 si c'est trop grand : ");
                repUtil = scanner.nextInt();
            }while(repUtil != -1 && repUtil != 0 && repUtil != 1);
            System.out.println("----------------------------------------------------------------------------------------------------");
            if (repUtil == 0) {
                System.out.println("Je suis un robot ! Personne ne me bat ! Je suis trop fort !");
                System.out.println("----------------------------------------------------------------------------------------------------");
                System.exit(0);
            } else if (repUtil == -1){
                System.out.println("Utilisateur : C'est trop petit !");
                min = nbPropose + 1;    // +1 Pour exclus
            } else if (repUtil == 1){
                System.out.println("Utilisateur : C'est trop grand !");
                max = nbPropose - 1;    // -1 Pour exclus
            }
            System.out.println("----------------------------------------------------------------------------------------------------");
            nbEssaiActuel++;
        }while(nbEssaiActuel <= NB_ESSAIS_MAX);

        System.out.println("COUIC !!");
    }
}
