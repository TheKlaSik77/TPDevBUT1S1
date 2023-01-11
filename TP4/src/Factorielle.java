
/*
 * Ce programme permet de travailler avec des factorielles
 */
import java.util.Scanner;

public class Factorielle {

    public static void main(String[] args) {

        /*
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");


        System.out.print("Insérez une valeur supérieure où égale à 0 : ");
        int valeur = scanner.nextInt();
        int fact = 0;
        while(valeur < 0){
            System.out.print("Erreur! Insérez une valeur supérieure où égale à 0 : ");
            valeur = scanner.nextInt();
        }
        if (valeur > 19){
            System.out.println("Trop grand, je ne peux pas calculer la factorielle de \"valeur\" lorsque \"valeur\" est supérieur à 19.");
            System.exit(1);
        }

        if (valeur == 0){
            fact = 1;
        } else {
            fact = 1;
            for (int i = 1 ; i <= valeur ; i++){
                fact = fact * i;
            }
        }
        System.out.println("La factorielle de " + valeur + " est " + fact + ".");

        int n;
        n = 2147483646;
        System.out.println(n);
        n++;
        System.out.println(n);
        n++;
        System.out.println(n);
        n++;
        System.out.println(n);
        // Passé 2147483647, le programme affiche -2147483648 puis est incrémenté par la suite
        */

        // La plus grande factorielle que l'on peut calculer normalement est 19.

        Scanner scanner = new Scanner(System.in).useDelimiter("\n");


        System.out.print("Insérez une valeur supérieure où égale à 0 : ");
        int valeur = scanner.nextInt();
        long fact = 0;
        while(valeur < 0){
            System.out.print("Erreur! Insérez une valeur supérieure où égale à 0 : ");
            valeur = scanner.nextInt();
        }

        if (valeur == 0){
            fact = 1;
        } else {
            fact = 1;
            for (int i = 1 ; i <= valeur ; i++){
                fact = fact * i;
            }
        }
        System.out.println("La factorielle de " + valeur + " est " + fact + ".");
        // La plus grande valeur est maintenant 39.
    }
}
