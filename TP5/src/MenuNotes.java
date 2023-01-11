import java.util.Scanner;

public class MenuNotes {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



        System.out.print("Insérez une première note sur 20: ");
        double note1 = scanner.nextDouble();
        double note2 = 0;
        double somme = note1;
        double moyenne = note1;
        double plusGrande = note1;
        double plusPetite = note1;
        int nbNotes = 1;


        int choix = 0;
        do {
            System.out.println("1. Saisir une note sur 20");
            System.out.println("2. Afficher la moyenne");
            System.out.println("3. Afficher la plus grande valeur");
            System.out.println("4. Afficher la plus petite valeur");
            System.out.println("5. Quitter");

            do {
                System.out.print("Choisissez (1, 2, 3, 4 ou 5) : ");
                choix = scanner.nextInt();
            } while(choix < 1 || choix > 5);

            switch (choix){
                case 1 :
                    do{
                        System.out.print("Insérez une nouvelle note sur 20 : ");
                        note2 = scanner.nextDouble();
                    } while (note2 < 0 || note2 > 20);
                    nbNotes++;
                    somme += note2;
                    moyenne = somme/nbNotes;
                    if (note2 >= plusGrande) {
                        plusGrande = note2;
                    }
                    if (note2 <= plusPetite){
                        plusPetite = note2;
                    }

                    break;

                case 2:
                    System.out.println("La moyenne est de : " + moyenne + ".");
                    break;
                case 3:
                    System.out.println("La plus grande valeur est : " + plusGrande + ".");
                    break;
                case 4:
                    System.out.println("La plus petite valeur est : " + plusPetite + ".");
                    break;
                case 5:
                    System.out.println("Au revoir !");
                    break;
            }
            System.out.println("\n-------------------------------\n");

        } while (choix != 5);

        scanner.close();
    }
}
