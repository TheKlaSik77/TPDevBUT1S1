import java.util.Scanner;

/*
 * Cette classe regroupe toutes les méthodes concernant l'affichage du menu.
 */
public class MenuTemp {

    public static void menuTemp(){

        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        String menu = "1. Afficher une température degrés Farenheit en celsius.\n2. Afficher l'approximation de la conversion d'une température degrés Farenheit en celsius.\n3. Est-ce que ça glisse ?\n4. Est-ce que ça bout ?\n5. Est-ce que l'eau est à l'état liquide?\n6. Quitter\n";

        boolean fin = false ;
        int choix= 0;
        double tempEnFarenheit = 0;
        int tempEnFarenheitInt = 0;

        while(fin == false){
            System.out.println(menu);
            System.out.println("-----------------------------");
            System.out.println("Que voulez-vous savoir ?");
            choix = scanner.nextInt();

            switch (choix){
                case 1:
                    System.out.println("Saisissez une température en degrés Farenheit.");
                    tempEnFarenheit = scanner.nextDouble();
                    FarenheitEtCelsius.afficherFenC(tempEnFarenheit);
                    break;
                case 2:
                    System.out.println("Saisissez une température entière en degrés Farenheit.");
                    tempEnFarenheitInt = scanner.nextInt();
                    FarenheitEtCelsius.afficherFenCApprox(tempEnFarenheitInt);
                    break;
                case 3:
                    System.out.println("Saisissez une température en degrés Farenheit.");
                    tempEnFarenheit = scanner.nextDouble();
                    FarenheitEtCelsius.caGlisseEnF(tempEnFarenheit);
                    break;
                case 4:
                    System.out.println("Saisissez une température en degrés Farenheit.");
                    tempEnFarenheit = scanner.nextDouble();
                    FarenheitEtCelsius.caBoutEnF(tempEnFarenheit);
                case 5:
                    System.out.println("Saisissez une température en degrés Farenheit.");
                    tempEnFarenheit = scanner.nextDouble();
                    FarenheitEtCelsius.eauLiquideEnF(tempEnFarenheit);
                    break;
                case 6:
                    fin = true;
                    break;
            }
        }
    }
}
