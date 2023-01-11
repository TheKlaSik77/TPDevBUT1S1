import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LectureDansUnFichierTexte {

    public static void main(String[] args) {
        /*

        lire();
        System.out.println();

        lireScoresEnUtilisantScanner();

        lireScoresEnUtilisantSplit();

         */

        // afficherMeilleurScoreEtNomJoueur();
        nbIntervallesContenusDansLAutre();

    }

    /*
        Cette méthode montre comment lire ligne à ligne un fichier texte.
     */
    public static void lire() {
        try {
            // Ouvrir en lecture le fichier "scores.txt"
            //
            BufferedReader reader = new BufferedReader(new FileReader("scores.txt"));

            // Lire une à une les lignes contenues dans le fichier
            String ligne = reader.readLine();
            while (ligne != null) {
                System.out.println(ligne);
                ligne = reader.readLine();
            }

            // lorqu'on a terminé d'utiliser le fichier, ne pas oublier de fermer le reader.
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Ce fichier n'existe pas.");
        } catch (IOException e) {
            System.out.println("Une erreur est survenue pendant la lecture du fichier...");
        }
    }

    /*
        Cette méthode montre comme Scanner peut être utilisé pour lire les éléments constituant un fichier texte.
        Documentation de Scanner : https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html
     */
    public static void lireScoresEnUtilisantScanner() {
        try {
            // Ouvrir en lecture le fichier "scores.txt" et créer un scanner facilitant sa lecture
            BufferedReader reader = new BufferedReader(new FileReader("scores.txt"));
            Scanner scannerDeScores = new Scanner(reader);

            while (scannerDeScores.hasNext()) {
                String nomJoueur = scannerDeScores.next();
                System.out.println("Scores du joueur : " + nomJoueur);
                int numScore = 0;
                while (scannerDeScores.hasNextInt()) {
                    numScore++;
                    System.out.println("\tscore n° " + numScore + " : " + scannerDeScores.nextInt());
                }
                System.out.println("nombre de scores de " + nomJoueur + " : " + numScore);
                System.out.println();
            }

            // lorqu'on a terminé d'utiliser le fichier, ne pas oublier de fermer le scanner (cela fermera aussi le reader).
            scannerDeScores.close();
        } catch (FileNotFoundException e) {
            System.out.println("Ce fichier n'existe pas.");
        } catch (IOException e) {
            System.out.println("Une erreur est survenue pendant la lecture du fichier...");
        }
    }

    /*
        Cette méthode montre comment la méthode split de la classe String peut être utilisée pour lire les éléments constituant un fichier texte.
        N.B. Cette méthode fait la même chose que la méthode précédente : il s'agit de deux techniques permettant de faire la même chose.
        Documentation de split : https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#split-java.lang.String-
     */
    public static void lireScoresEnUtilisantSplit() {
        try {
            // Ouvrir en lecture le fichier "scores.txt"
            BufferedReader reader = new BufferedReader(new FileReader("scores.txt"));

            String ligne = reader.readLine();
            while (ligne != null) {
                if (ligne.length() > 0) {
                    String[] splitLigne = ligne.split(" "); // Découper la ligne en utilisant l'espace comme séparateur.
                    System.out.println("Scores du joueur : " + splitLigne[0]);
                    for (int i = 1; i < splitLigne.length; i++)
                        System.out.println("\tscore n° " + i + " : " + Integer.parseInt(splitLigne[i]));
                    System.out.println("nombre de scores de " + splitLigne[0] + " : " + (splitLigne.length - 1));
                    System.out.println();
                }
                ligne = reader.readLine();
            }

            // lorqu'on a terminé d'utiliser le fichier, ne pas oublier de fermer le reader.
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Ce fichier n'existe pas.");
        } catch (IOException e) {
            System.out.println("Une erreur est survenue pendant la lecture du fichier...");
        }
    }

    public static void afficherMeilleurScoreEtNomJoueur(){
        try {
            BufferedReader reader = new BufferedReader(new FileReader("scores.txt"));

            String ligne = reader.readLine();
            int meilleurScore = 0;
            String personneMeilleurScore = "";

            while (ligne != null){
                if (ligne.length() > 0){
                    String[] splitLine = ligne.split(" ");
                    for (int i = 1 ; i < splitLine.length ; i++){
                        if (Integer.parseInt(splitLine[i]) > meilleurScore){
                            meilleurScore = Integer.parseInt(splitLine[i]);
                            personneMeilleurScore = splitLine[0];
                        }
                    }
                    ligne = reader.readLine();
                }
            }
            System.out.println("Le meilleur score est détenu par " + personneMeilleurScore + " avec un score de " + meilleurScore + ".");
        }catch (FileNotFoundException e) {
            System.out.println("Ce fichier n'existe pas.");
        } catch (IOException e) {
            System.out.println("Une erreur est survenue pendant la lecture du fichier...");
        }
    }

    public static void nbIntervallesContenusDansLAutre(){
        int compteur = 0;
        try {
            BufferedReader reader = new BufferedReader(new FileReader("input.txt"));

            String ligne = reader.readLine();
            while(ligne != null){

                String[] splitLigne = ligne.split(","); // Découper la ligne en utilisant l'espace comme séparateur.

                String[] splitPartie1 = splitLigne[0].split("-");
                String[] splitPartie2 = splitLigne[1].split("-");
                int min1 =  Integer.parseInt(splitPartie1[0]);
                int max1 =  Integer.parseInt(splitPartie1[1]);

                int min2 =  Integer.parseInt(splitPartie2[0]);
                int max2 =  Integer.parseInt(splitPartie2[1]);

                if ((min2 >= min1 && max2 <= max1) || (min1 >= min2 && max1 <= max2)){
                    System.out.println(ligne);
                    compteur++;
                }

                ligne = reader.readLine();
            }
            System.out.println("Il y a " + compteur + " intervalles qui sont contenus les uns dans les autres.");

        }catch (FileNotFoundException e) {
            System.out.println("Ce fichier n'existe pas.");
        } catch (IOException e) {
            System.out.println("Une erreur est survenue pendant la lecture du fichier...");
        }

    }
}
