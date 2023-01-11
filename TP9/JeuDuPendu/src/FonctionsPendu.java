import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Scanner;

public class FonctionsPendu {

    /* Apparence du pendu
    *
    *    /------
    *    |     |
    *    |     O
    *    |   / 0 \
    *    |    / \
    *    |
    * ___L____________
    *
    * 3 Niveaux de difficulté : 1.Facile (9 essais), 2.Normal (6 essais), 3.Difficile (3 essais)
    *
    *
    * */

    /**
     * Affiche l'état du pendu selon le niveau de difficulté et le nombre d'essais restants En plus d'une phrase : il vous reste .. essais.
     * @param difficule
     *      1 pour facile, 2 pour normal, 3 pour difficile.
     * @param nbEssaisActuel
     *      numéro de l'essai actuel.
     */
    public static void affichePendu(int difficule, int nbEssaisActuel){

        String penduEtape1 = "\n\n\n\n\n\n________________";
        String penduEtape2 = "   /\n   |\n   |\n   |\n   |\n   |\n___L____________";
        String penduEtape3 = "   /------\n   |\n   |\n   |\n   |\n   |\n___L____________";
        String penduEtape4 = "   /------\n   |     |\n   |\n   |\n   |\n   |\n___L____________";
        String penduEtape5 = "   /------\n   |     |\n   |     O\n   |\n   |\n   |\n___L____________";
        String penduEtape6 = "   /------\n   |     |\n   |     O\n   |     0\n   |\n   |\n___L____________";
        String penduEtape7 = "   /------\n   |     |\n   |     O\n   |    /0\n   |\n   |\n___L____________";
        String penduEtape8 = "   /------\n   |     |\n   |     O\n   |    /0\\\n   |\n   |\n___L____________";
        String penduEtape9 = "   /------\n   |     |\n   |     O\n   |    /0\\\n   |    / \\\n   |\n___L____________";

        switch(difficule){
            case 1:
                switch (nbEssaisActuel){
                    case 1:
                        System.out.println(penduEtape1);
                        break;
                    case 2:
                        System.out.println(penduEtape2);
                        break;
                    case 3:
                        System.out.println(penduEtape3);
                        break;
                    case 4:
                        System.out.println(penduEtape4);
                        break;
                    case 5:
                        System.out.println(penduEtape5);
                        break;
                    case 6:
                        System.out.println(penduEtape6);
                        break;
                    case 7:
                        System.out.println(penduEtape7);
                        break;
                    case 8:
                        System.out.println(penduEtape8);
                        break;
                    case 9:
                        System.out.println(penduEtape9);
                        break;
                }
                break;
            case 2:
                switch (nbEssaisActuel){
                    case 1:
                        System.out.println(penduEtape1);
                        break;
                    case 2:
                        System.out.println(penduEtape2);
                        break;
                    case 3:
                        System.out.println(penduEtape3);
                        break;
                    case 4:
                        System.out.println(penduEtape5);
                        break;
                    case 5:
                        System.out.println(penduEtape6);
                        break;
                    case 6:
                        System.out.println(penduEtape9);
                        break;
                }
                break;

            case 3:
                switch (nbEssaisActuel){
                    case 1:
                        System.out.println(penduEtape3);
                        break;
                    case 2:
                        System.out.println(penduEtape5);
                        break;
                    case 3:
                        System.out.println(penduEtape9);
                        break;
                }
                break;
        }
    }


    /**
     * retourne un mot aléatoirement dans un dictionnaire de mot (fichier)
     *
     * @return
     *      Retourne un mot aléatoire parmi la liste de mot
     *
     *
     */
    public static String motAleatoire() throws IOException {


        String motSecret = "";
        int nbAleatoire = (int)(Math.random()*(22740 - 1)) + 1;

        Reader reader = new FileReader("./src/dictionnaire.txt");
        BufferedReader br = new BufferedReader(reader);

        try{
            for (int ligne = 1 ; ligne <= nbAleatoire ; ligne++){
                if (ligne == nbAleatoire){
                    motSecret = br.readLine();
                }
                br.readLine();
            }


        }catch (IOException e){
            System.out.println("IOException : " + e.getMessage());;
        }
        return motSecret;
    }


    /**
     * Indique si la lettre est dans le mot
     * @param motSecretTransforme
     *      Le mot à deviner
     * @param lettreProposee
     *      Lettre proposée par le joueur
     * @return
     *      retourne vrai si la lettre est dans le mot, false sinon
     */
    public static boolean estDansLeMot(String motSecretTransforme, char lettreProposee){

        for (int indice = 0 ; indice < motSecretTransforme.length() ; indice++){
            if (motSecretTransforme.charAt(indice) == lettreProposee){
                return true;
            }
        }
        return false;
    }

    /**
     * retourne une chaine de caractère de la taille du mot secret, mais dont tous les caractères ont été remplacés par le caractère '_'
     * @param motSecret
     *      Mot à deviner
     * @return
     *      retourne le String contenant "tailleMotSecret" * '_'
     */
    public static String transformerMotEnMotCache(String motSecret){

        StringBuilder motCache = new StringBuilder();

        for (int indice = 0 ; indice < motSecret.length() ; indice++){
            if (motSecret.charAt(indice) == '-'){
                motCache.append('-');
            } else if (motSecret.charAt(indice) == ' '){
                motCache.append(' ');
            } else {
                motCache.append('_');
            }
        }
        return motCache.toString();

    }

    /**
     * Place la lettre une ou plusieurs fois dans le mot Caché
     * @param motSecret
     *      mot à deviner
     * @param motSecretCache
     *      mot secret camouflé avec les '_'
     * @param lettre
     *      Lettre proposée par le joueur
     *
     * @return
     *      retourne le mot caché avec la lettre dévoilée à la bonne place.
     */
    public static String placerLettreDansMotCache(String motSecret, String motSecretCache, char lettre, ArrayList<String> listeLettresDejaDonnees){


        if (estDansLeMot(motSecret, lettre)){
            StringBuilder motSecretAvecLettres = new StringBuilder();
            for (int indice = 0 ; indice < motSecret.length() ; indice++){
                if (motSecret.charAt(indice) == lettre){
                    motSecretAvecLettres.append(motSecret.charAt(indice));
                } else {
                    motSecretAvecLettres.append(motSecretCache.charAt(indice));
                }
            }
            return motSecretAvecLettres.toString();
        } else {
            String lettreProposee = Character.toString(lettre);
            listeLettresDejaDonnees.add(lettreProposee);
            return motSecretCache;

        }

    }

    /**
     * L'utilisateur saisit une lettre et le programme vérifie si elle n'est pas dans la liste de lettre déjà donnéees ou si son format est correct.
     * @param listeLettresDejaDonnees
     *      liste de String (lettres déjà données)
     * @return
     *     La lettre de l'utilisateur
     */
    public static char demanderLettre(ArrayList listeLettresDejaDonnees){

        Scanner scanner = new Scanner(System.in).useDelimiter("\n");

        System.out.print("Proposez une lettre (minuscule, sans accent) : ");
        String lettre = scanner.nextLine();

        while ( (lettre.length() != 1) || (lettre.charAt(0) < 'a' || lettre.charAt(0) > 'z') || listeLettresDejaDonnees.contains(lettre)){
            System.out.print("Erreur lettre invalide ou déja proposée! Proposez une lettre (minuscule, sans accent) : ");
            lettre = scanner.nextLine();
        }

        return lettre.charAt(0);
    }

    public static int demanderDifficulte(){

        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Choisissez votre difficulté : \n1. Facile (9 essais) \n2. Normal (6 essais)\n3. Difficile (3 essais)\n\nSélectionnez 1, 2 ou 3 : ");
        int difficulte = scanner.nextInt();

        while (difficulte < 1 || difficulte > 3){
            System.out.print("\n-------------------------------------------------------------\nErreur! Choix invalide\n\nChoisissez votre difficulté : \n1. Facile (9 essais) \n2. Normal (6 essais)\n3. Difficile (3 essais)\n\nSélectionnez 1, 2 ou 3 : ");
            difficulte = scanner.nextInt();
        }
        return difficulte;

    }


}
