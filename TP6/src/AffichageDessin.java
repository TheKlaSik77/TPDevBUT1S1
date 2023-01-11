public class AffichageDessin {
    /**
     * Affiche une ligne de caractères (sans retour à la ligne).
     *
     * @param c
     *            le caractère à afficher
     * @param longueur
     *            le nombre d'affichages du caractère (longueur >=0)
     */
    public static void afficherEnLigne(char c, int longueur) {
        if (longueur < 0) {
            System.out.println("ERREUR! afficherEnLigne : longueur négative ("
                    + longueur + ")");
        } else {
            for (int colonne = 1; colonne <= longueur; colonne++) {
                System.out.print(c);
            }
        }
    }



    /**
     * Affiche une ligne de caractères avec retour à la ligne.
     *
     * @param c
     *            le caractère à afficher
     * @param longueur
     *            le nombre d'affichages du caractère (longueur >=0).
     */
    public static void afficherEnLigneln(char c, int longueur) {
        afficherEnLigne(c, longueur);
        System.out.println();
    }

    /**

     * Affiche un rectangle composé avec le caractère '*'

     *

     * @param largeur

     *            largeur du rectangle (largeur >=0)

     * @param hauteur

     *            hauteur du rectangle (hauteur >=0)

     */

    public static void afficherRectangle(int largeur, int hauteur){
        if (largeur < 0 || hauteur < 0){
            System.out.println("Erreur! Valeur inférieur à 0");
        }else {
            for (int i = 0; i < hauteur; i++) {
                afficherEnLigneln('*', largeur);
            }
        }
    }

    /**

     * Affiche un carré composé avec le caractère '*'

     *

     * @param  coté

     *            coté du carré (coté >=0)

     */

    public static void afficherCarré(int coté){
        afficherRectangle(coté,coté);
    }

    /**

     * Affiche un triangle rectangle d'étoiles dont le sommet haut est à gauche.

     *

     * @param hauteur

     *            la hauteur du triangle (hauteur >=0)

     */

    public static void afficherTriangleRectangleGauche(int hauteur){
         if (hauteur >= 0) {
             for (int i = 1; i <= hauteur; i++) {
                 afficherEnLigneln('*', i);
             }
         } else {
             System.out.println("Erreur ! Hauteur négative");
         }
    }

    /**
     * Affiche un triangle rectangle d'étoiles dont le sommet haut est à droite.

            *

            * @param hauteur

     *            la hauteur du triangle (hauteur >=0)

     */

    public static void afficherTriangleRectangleDroit(int hauteur){
         if (hauteur >= 0) {
             for (int i = 1; i <= hauteur; i++) {
                 afficherEnLigne(' ', (hauteur - i));
                 afficherEnLigneln('*', i);
             }
         } else {
             System.out.println("Erreur! Hauteur négative");
         }
    }

    /**

     * Affiche un triangle isocèle d'étoiles (sommet en haut).

     * (Autrement dit, il s'agit d'une pyramide.)

     *

     * @param hauteur

     *            la hauteur du triangle (hauteur >=0)

     */

    public static void afficherTriangleIsocele(int hauteur){
        if (hauteur < 0){
            System.out.println("Erreur! Hauteur négative");
        } else {
            int add = 1;
            for (int i = 1; i <= hauteur; i++) {
                afficherEnLigne(' ', (hauteur - i));
                afficherEnLigne('*', (add));
                afficherEnLigneln(' ', (hauteur - i));
                add += 2;
            }
        }
    }
    /**

     * Affiche un triangle isocèle d'étoiles (base en haut).

     * (Autrement dit, il s'agit d'une pyramide inversée.)

     *

     * @param hauteur

     *            la hauteur du triangle (hauteur >=0)

     */

    public static void afficherTriangleIsoceleInverse(int hauteur){

        if (hauteur >= 0){
            System.out.println("Erreur! Hauteur négative!");
        } else {
            int add = (hauteur * 2) - 1;
            for (int i = hauteur; i >= 1; i--) {
                afficherEnLigne(' ', (hauteur - i));
                afficherEnLigne('*', (add));
                afficherEnLigneln(' ', (hauteur - i));
                add -= 2;
            }
        }

    }

    /**

     * Affiche l'un en dessous de l'autre un triangle isocèle d'étoiles puis un triangle isocèle d'étoiles inversé.

     *

     * @param demiHauteur

     *            la hauteur de chacun des triangles (hauteur >=0)

     */

    public static void afficherTriangleIsocèleEtTriangleIsocèleInversé(int demiHauteur){
        if (demiHauteur < 0){
            System.out.println("Erreur ! Demi hauteur négative");
        } else {
            afficherTriangleIsocele(demiHauteur);
            afficherTriangleIsoceleInverse(demiHauteur);
        }
    }

    /**

     * Affiche un losange d'étoiles.

     *

     * @param hauteur

     *            la hauteur (totale) du losange (hauteur >=0 et hauteur impaire)

     */

    public static void afficherLosange(int hauteur){

        if (hauteur % 2 == 0 || hauteur < 0) {
            System.out.println("Erreur! Hauteur paire");
        } else {
            int add = 1;
            for (int i = 1 ; i <= ((hauteur- 1) / 2) ; i++){
                afficherEnLigne(' ',1); // Pour décaler la pyramide de 1 espace
                afficherEnLigne(' ', (((hauteur- 1) / 2) - 1) - ((add - 1) / 2));
                afficherEnLigneln('*',add);

                add += 2;
            }
            afficherEnLigneln('*',hauteur);

            add = (hauteur - 2);
            for (int i = ((hauteur- 1) / 2) ; i >= 1 ; i--){
                afficherEnLigne(' ',1);
                afficherEnLigne(' ',(((hauteur- 1) / 2) - 1) - ((add - 1) / 2));
                afficherEnLigneln('*',add);
                add -= 2;
            }
        }
    }

    // Question i
    /**

     * Affiche un damier avec le caractère 'B' pour blanc et 'N' pour noir.

     *

     * @param largeur

     *            largeur du damier (largeur paire et >=0)

     * @param hauteur

     *            hauteur du damier (hauteur paire et >=0)

     */

    public static void afficherDamier(int largeur, int hauteur){

        if (hauteur % 2 != 0 || hauteur < 0){
            System.out.println("Erreur! Hauteur impaire ou négative!");
        }
        if (largeur % 2 != 0 || largeur < 0){
            System.out.println("Erreur! Largeur impaire ou négative!");
        } else {
            for (int i = 1; i <= hauteur; i++) {
                if (i % 2 == 1) {
                    for (int j = 1; j <= largeur; j++) {
                        afficherEnLigne('B', 1);
                        j++;
                        afficherEnLigne('N', 1);
                    }
                    System.out.println("");
                } else {
                    for (int j = 1; j <= largeur; j++) {
                        afficherEnLigne('N', 1);
                        j++;
                        afficherEnLigne('B', 1);
                    }
                    System.out.println("");
                }
            }
        }
    }

    /**

     * Affiche avec des étoiles un rectangle creux.

     *

     * @param largeur

     *            largeur du rectangle (largeur >=0)

     * @param hauteur

     *            hauteur du rectangle (hauteur >=0)

     */

    public static void afficherRectangleCreux(int largeur, int hauteur){

        if (largeur < 0 || hauteur < 0){
            System.out.println("Erreur! Arguments négatifs");
        } else {
            if (largeur == 0 || hauteur == 0){
                System.out.println("");
            } else if (largeur == 1){
                for (int i = 1 ; i <= hauteur ; i++){
                    afficherEnLigneln('*', 1);
                }
            } else if (largeur == 2){
                for (int i = 1 ; i <= hauteur ; i++){
                    afficherEnLigneln('*', 2);
                }
            } else if (hauteur == 1){
                afficherEnLigneln('*',largeur);
            } else if (hauteur == 2){
                afficherEnLigneln('*',largeur);
                afficherEnLigneln('*',largeur);
            }
            else{
                afficherEnLigneln('*', largeur);
                for (int i = 2; i <= (hauteur - 1); i++) {
                    afficherEnLigne('*', 1);
                    afficherEnLigne(' ', largeur - 2);
                    afficherEnLigneln('*', 1);
                }
                afficherEnLigneln('*', largeur);
            }
        }
    }
    /**

     * Affiche une croix de 'x'.

     *

     * @param hauteur

     *            la hauteur (totale) de la croix (hauteur >=0 et hauteur

     *            impaire)

     */

    public static void afficherCroix(int hauteur){
        if (hauteur < 0 || hauteur % 2 != 1){
            System.out.println("Erreur! Hauteur négative ou paire!");
        }
            int nbEspacesCentre = hauteur - 2;
            int nbEspacesCotes = 0;

            for (int i = 1 ; i <= (( hauteur - 1 ) / 2) ; i++){
                afficherEnLigne(' ', nbEspacesCotes);
                afficherEnLigne('*',1);
                afficherEnLigne(' ', nbEspacesCentre);
                afficherEnLigne('*',1);
                afficherEnLigneln(' ', nbEspacesCotes);
                nbEspacesCentre -= 2;
                nbEspacesCotes++;
            }
            afficherEnLigne(' ', (hauteur - 1) / 2);
            afficherEnLigne('*',1);
            afficherEnLigneln(' ', (hauteur - 1) / 2);
            nbEspacesCentre += 2;
            nbEspacesCotes--;
            for (int i = (hauteur / 2) + 2 ; i <= hauteur ; i++){
                afficherEnLigne(' ', nbEspacesCotes);
                afficherEnLigne('*',1);
                afficherEnLigne(' ', nbEspacesCentre);
                afficherEnLigne('*',1);
                afficherEnLigneln(' ', nbEspacesCotes);
                nbEspacesCentre += 2;
                nbEspacesCotes--;
            }
    }

    public static void main(String[] args) {
        afficherCroix(11);
    }


}
