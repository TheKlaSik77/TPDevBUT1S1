import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        int nb20 = 0;
        double moyenne = 0.0;
        boolean note0 = false;
        int note = 0;
        int sommeNotes = 0;
        int nbNotes= 0;

        System.out.print("Indiquez combien de notes vous voulez insérer : ");
        int tailleTab = scanner.nextInt();
        while (tailleTab <= 0) {
            System.out.print("Erreur! Indiquez combien de notes vous voulez insérer : ");
            tailleTab = scanner.nextInt();
        }
        int[] tabNotes = new int[tailleTab];


        for (int indice = 0 ; indice < tailleTab ; indice++){
            System.out.print("Insérez une note entre 0 et 20 : ");
            note = scanner.nextInt();
            while (note < 0 || note > 20){
                System.out.print("Erreur ! Insérez une note entre 0 et 20 : ");
                note = scanner.nextInt();
            }
            if (note == 20){
                nb20++;
            } else if (note == 0){
                note0 = true;
            }
            tabNotes[indice] = note;
            nbNotes++;
            sommeNotes += note;

        }
        moyenne = sommeNotes/nbNotes;

        if (note0) {
            System.out.println("La note 20 a été donnée " + nb20 + " fois, la moyenne du groupe est de " + moyenne + "/20, au moins un 0/20 a été donné");
        } else {
            System.out.println("La note 20 a été donnée " + nb20 + " fois, la moyenne du groupe est de " + moyenne + "/20, aucun 0/20 n'a été donné");
        }
    }
}