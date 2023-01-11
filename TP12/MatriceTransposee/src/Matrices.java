public class Matrices {


    public static void afficherMatrice(int[][] matrice){

        for (int i = 0 ; i < matrice.length ; i++){
            for (int j = 0 ; j < matrice[i].length ; j++){
                System.out.print(matrice[i][j] + "\t\t");
            }
            System.out.println();
        }
    }
    /*
    * La matrice doit être carrée, c'est-à-dire hauteur = largeur.
     */
    public static int[][] transposerMatrice(int[][] matrice){

        int[][] matriceTransposee = new int[matrice.length][matrice.length];

        for (int i = 0 ; i < matrice.length ; i++){
            for (int j = 0 ; j < matrice[i].length ; j++){
                matriceTransposee[j][i] = matrice[i][j];
            }
        }
        return matriceTransposee;
    }

}
