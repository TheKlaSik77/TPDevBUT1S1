/*
 * Affiche le compte à rebours depuis un nombre de "départ" saisit.
 */
import java.util.Scanner;

public class CompteARebours {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int depart;
        int nbTab = 0;
        System.out.print("Entier de départ : ");
        depart = Integer.parseInt(sc.nextLine());


        while (depart < 0){
            System.out.print("Erreur! Entier de départ : ");
            depart = Integer.parseInt(sc.nextLine());
        }
        nbTab = (9-(depart % 10));

        System.out.println("nbTab : " + nbTab);
        while (nbTab > 0){
            System.out.print("\t");
            nbTab -= 1;
        }
        for (int i = depart ; i >= 0 ; i--) {

            System.out.print(i + "\t");
            if (i % 10 == 0){
                System.out.println("");
            }
        }

        System.out.println();
        System.out.println("C'est fini !");

        sc.close();
    }

}
