import java.lang.reflect.Method;
import java.util.Scanner;

public class Menu {

    static int afficherMenuEtChoix(){

        String menu = "\nQue voulez-vous faire?\n\n1. Afficher le nombre d'étudiant.\n2. Afficher la liste des notes.\n3. Afficher la moyenne de la promotion.\n4. Indiquer si toutes les valeurs sont au dessus d'un seuil (que vous préciserez).\n5. Afficher la répartition des notes pour un intervalle (que vous préciserez).\n6. Afficher un histogramme de la répartition des notes pour un intervalle (que vous préciserez).\n7. Calculer la médiane et l'écart type.\n8. Quitter.\n\nVotre Choix: ";

        Scanner scanner = new Scanner(System.in).useDelimiter("\n");

        System.out.print(menu);
        int choix = scanner.nextInt();
        while (choix < 1 || choix > 8){
            System.out.println("Choix incorrect! Réessayez : ");
            choix = scanner.nextInt();
        }

        return choix;
    }

    static void deroulementLogiciel(){

        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Indiquez le nombre d'étudiant: ");

        int nbEtudiants = scanner.nextInt();
        while (nbEtudiants <= 0){
            System.out.print("Erreur valeur < 1 ! Indiquez le nombre d'étudiant: ");
            nbEtudiants = scanner.nextInt();
        }

        int[] tabNotes = new int[nbEtudiants];
        tabNotes = MethodesTableaux.saisirNotesDansTab(tabNotes);

        int choix = 0;
        do {
            choix = afficherMenuEtChoix();

            switch (choix){
                case 1:
                    System.out.println("-----------------------------------------------");
                    System.out.println("Le nombre d'étudiant est de " + nbEtudiants + ".");
                    System.out.println("-----------------------------------------------");
                    break;
                case 2:
                    System.out.println("-----------------------------------------------");
                    MethodesTableaux.afficherListeNotes(tabNotes);
                    System.out.println("-----------------------------------------------");
                    break;
                case 3:
                    System.out.println("-----------------------------------------------");
                    System.out.println(MethodesTableaux.moyenneTab(tabNotes));
                    System.out.println("-----------------------------------------------");
                    break;
                case 4:
                    System.out.println("-----------------------------------------------");
                    if (MethodesTableaux.valeursTabSupSeuil(tabNotes)){
                        System.out.println("OK");
                    } else {
                        System.out.println("NON");
                    }
                    System.out.println("-----------------------------------------------");
                    break;
                case 5:
                    System.out.println("-----------------------------------------------");
                    MethodesTableaux.repartitionIntervalle(tabNotes);
                    System.out.println("-----------------------------------------------");
                    break;
                case 6:
                    System.out.println("-----------------------------------------------");
                    MethodesTableaux.repetitionIntervalleHistogramme(tabNotes);
                    System.out.println("-----------------------------------------------");
                    break;
                case 7:
                    System.out.println("-----------------------------------------------");
                    System.out.println("ok");
                    System.out.println("-----------------------------------------------");
                    break;
                case 8:
                    System.exit(0);
                    break;
            }
        } while (choix != 8);
    }
}
