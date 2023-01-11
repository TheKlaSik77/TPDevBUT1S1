import java.util.Scanner;

public class MenuAvecSwitch {

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

            switch(choix){
                case 1 : valeur += 1;
                case 2 : valeur *= 2;
                case 3 : valeur -= 4;
                case 4 :
                    System.out.println("Au revoir ");
                    break;
            }
            if (choix != 4){
                System.out.println("Valeur actuelle : " + valeur + ".");
            }

            System.out.println("-----------------------------------");

        }while (choix != 4);

        scanner.close();

    }
}
