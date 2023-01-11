
import java.util.Scanner;

public class TroisTablesDeMultiplication{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in).useDelimiter("\n");

        System.out.print("Insérez une valeur entre 2 et 9 inclus : ");
        int valeur = scanner.nextInt();

        while(valeur < 2 || valeur > 9){

            System.out.print("Erreur ! Insérez une valeur entre 2 et 9 inclus : ");
            valeur = scanner.nextInt();
        }

        System.out.println("\tpar " + (valeur-1) + "\tpar " + valeur + "\tpar " + (valeur + 1));

        for (int i = 0 ; i <= 10 ; i++){
            System.out.println(i + "\t" + (i * (valeur-1)) + "\t" + (i * (valeur)) + "\t" + (i * (valeur+1)));
        }


        scanner.close();


    }
}