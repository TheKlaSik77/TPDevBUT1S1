/*
 * Ce programme saisit un rayon entier et indique la circonférence et l'aire du cercle
 */

import java.util.Scanner;

public class Circonferences{

    static final double PI = Math.PI;
    public static void main(String[] args){


        Scanner scanner = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Circonférence et aire de cercles");
        System.out.print("rayon (négatif pour terminer) : ");
        int rayon = scanner.nextInt();

        if (rayon < 0){
            System.out.println("Au revoir !");
            System.exit(0);
        } else {
            double perimetre = 0;
            double aire = 0;

            perimetre = 2 * PI * rayon;
            aire = PI * (rayon * rayon);

            System.out.println("circonférence : " + perimetre + "; aire : " + aire + ".");
        }
    }
}