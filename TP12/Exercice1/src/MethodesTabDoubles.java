public class MethodesTabDoubles {

    public static void afficherMatrice(int[][] t) {


        // boucle qui parcourt les lignes à afficher

        for (int i = 0; i < t.length; i++) {


            // boucle qui, pour chaque ligne, parcourt les colonneonnes

            for (int j = 0; j < t[i].length; j++) {

                // affichage du contenu de la case située à la

                // ligne d’indice i et à la colonneonne d’indice j

                System.out.print(t[i][j] + "\t");

            }

            System.out.println();

        }

    }

    public static void remplir (int[][] t, int val){
        
        for (int ligne = 0 ; ligne < t.length ; ligne++){
            for (int colonne = 0 ; colonne < t[ligne].length ; colonne++){
                t[ligne][colonne] = val;
            }
        }
    }
    /*

     * Remplit la matrice m avec
     * la valeur 1 sur la diagonale hautGauche-basDroit
     * et la valeur 0 partout ailleurs.
     * m doit être une matrice carrée
     * (les deux dimensions doivent être de même longueur).

    */
    public static void remplirMatriceAvecDiagonale(int[][] m){
        if (m.length != m[0].length){
            System.out.println("Erreur Matrice non carrée.");
            System.exit(1);
        }
        for (int ligne = 0 ; ligne < m.length ; ligne++){
            for (int colonne = 0 ; colonne < m[ligne].length ; colonne++){
                if (ligne == colonne) {
                    m[ligne][colonne] = 1;
                }
            }
        }
    }
}

