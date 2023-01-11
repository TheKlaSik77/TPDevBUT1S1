import java.util.Scanner;

public class CarreParfait {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useDelimiter("\n");

        System.out.print("Insérez un nombre entier naturel : ");
        int valeur = scanner.nextInt();

        while (valeur < 0){
            System.out.println("Erreur ! Insérez un nombre entier naturel : ");
            valeur = scanner.nextInt();
        }
        int n = 0;

        while(n <= valeur){
            if (n*n == valeur){
                System.out.println(valeur + " est un carré parfait car " + n + " x " + n + " = " + valeur);
                System.exit(0);
            }
            n++;
        }
        System.out.println(valeur + " n'est pas un carré parfait!");
    }
}
