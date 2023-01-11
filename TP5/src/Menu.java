import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useDelimiter("\n");

        int valeur = 0;
        int choix = 0;
        do {
            do {
                System.out.println("Valeur : " + valeur);
                System.out.print("Insérez votre choix (1, 2, 3 ou 4) : ");
                choix = scanner.nextInt();
            } while (choix != 1 && choix != 2 && choix != 3 && choix != 4);

            System.out.println("1. Ajouter 1");
            System.out.println("2. Multiplier par 2");
            System.out.println("3. Soustraire 4");
            System.out.println("4. Quitter");
            System.out.println();

            if (choix == 4) {
                System.out.println("Au revoir !");
            } else {
                if (choix == 1) {
                    valeur += 1;
                } else if (choix == 2) {
                    valeur *= 2;
                } else {
                    valeur -= 4;
                }
                System.out.println("Valeur Actuelle : " + valeur + ".");
                System.out.println("-----------------------------------");
            }

            System.out.println("-----------------------------------");

        }while (choix != 4);

        scanner.close();

    }
}
