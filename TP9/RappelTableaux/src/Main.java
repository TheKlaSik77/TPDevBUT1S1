import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useDelimiter("\n");

        System.out.print("Insérez le nombre de notes à saisir: ");
        int tailleTableau = scanner.nextInt();
        double[] tab = new double[tailleTableau];
        double note = 0;
        double nbNotes = 0;
        double sommeNotes = 0;
        double moyenne;

        for (int indice = 0 ; indice < tailleTableau-1 ; indice++){

            System.out.print("Insérez une note: ");
            note = scanner.nextDouble();
            while(note < 0 || note > 20) {
                System.out.print("Erreur la note doit être comprise dans l'intervalle [0,20].\nInsérez une note: ");
                note = scanner.nextDouble();
            }
            sommeNotes += note;
            nbNotes++;
            tab[indice] = note;
        }

        if (tailleTableau != 0) {
            moyenne = sommeNotes / nbNotes;
            System.out.println("La moyenne est de " + moyenne);
        } else {
            System.out.println("Pas de valeur dans le tableau.");
        }

    }
}