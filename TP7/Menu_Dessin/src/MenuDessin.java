/*
 * La classe MenuDessin regroupe toutes les méthodes correspondantes à l'affichage du menu de dessin.
 */

import java.util.Scanner;
public class MenuDessin {

    /**
     * Méthode correspondant à l'affichage du menu de dessin.
     */
    public static void menuDessin() {

        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        boolean fin = false;
        String menu = "1. Dessiner un Rectangle\n2. Dessiner un Carré\n3. Dessiner un Losange\n4. Dessiner une Croix\n5. Quitter le Programme\n";
        int largeur = 0;
        int hauteur = 0;
        int choix = 0;
        while (fin == false){
            System.out.println("-----------------------------------------------------------");
            System.out.println(menu);
            System.out.print("Veuillez sélectionner un Dessin : ");
            choix = scanner.nextInt();

            switch (choix){
                case 1:
                    System.out.print("Insérez la largeur du rectangle : ");
                    largeur = scanner.nextInt();
                    System.out.print("Insérez la hauteur du rectangle : ");
                    hauteur = scanner.nextInt();
                    System.out.println("-----------------------------------------------------------");

                    Dessins.afficherRectangle(largeur,hauteur);
                    break;
                case 2:
                    System.out.print("Insérez la valeur des cotés du carré : ");
                    largeur = scanner.nextInt();
                    System.out.println("-----------------------------------------------------------");

                    Dessins.afficherCarré(largeur);
                    break;
                case 3:
                    System.out.println("Insérez la Hauteur du Losange (Attention : celle-ci doit être impaire) : ");
                    hauteur = scanner.nextInt();
                    System.out.println("-----------------------------------------------------------");

                    Dessins.afficherLosange(hauteur);
                    break;
                case 4:
                    System.out.println("Insérez la Hauteur de la Croix (Attention : celle-ci doit être impaire) : ");
                    hauteur = scanner.nextInt();
                    System.out.println("-----------------------------------------------------------");

                    Dessins.afficherCroix(hauteur);
                    break;
                case 5:
                    fin = true;
                    break;
                default:
                    System.out.println("Erreur! Choix incorrect, Veuillez réessayer.");
                    break;
            }


        }

    }
}
