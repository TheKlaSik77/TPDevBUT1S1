public class MethodesTabDoubles {

    public static int nbTrue2D(boolean[][] tab){
        int cpt = 0;
        for (int ligne = 0 ; ligne < tab.length ; ligne++){
            for (int colonne = 0 ; colonne < tab[ligne].length ; colonne++){
                if (tab[ligne][colonne] == true){
                    cpt++;
                }
            }
        }
        return cpt;
    }

    public static int nbTrue4D(boolean[][][][] tab){
        int cpt = 0;
        for (int dim1 = 0 ; dim1 < tab.length ; dim1++){
            for (int dim2 = 0 ; dim2 < tab[dim1].length ; dim2++){
                for (int dim3 = 0 ; dim3 < tab[dim1][dim2].length ; dim3++) {
                    for (int dim4 = 0; dim4 < tab[dim1][dim2][dim3].length; dim4++) {
                        if (tab[dim1][dim2][dim3][dim4] == true){
                            cpt++;
                        }
                    }
                }
            }
        }
        return cpt;
    }

    public static boolean estPresente2D(int[][] tab, int val){

        for (int ligne = 0 ; ligne < tab.length ; ligne++){
            for (int colonne = 0 ; colonne < tab[ligne].length ; colonne++){
                if (tab[ligne][colonne] == val){
                    return true;
                }
            }
        }
        return false;

    }

    public static boolean estPresente4D(int[][][][] tab, int val){

        for (int dim1 = 0 ; dim1 < tab.length ; dim1++){
            for (int dim2 = 0 ; dim2 < tab[dim1].length ; dim2++){
                for (int dim3 = 0 ; dim3 < tab[dim1][dim2].length ; dim3++) {
                    for (int dim4 = 0; dim4 < tab[dim1][dim2][dim3].length; dim4++) {
                        if (tab[dim1][dim2][dim3][dim4] == val){
                            return true;
                        }
                    }
                }
            }
        }
        return false;

    }

    public static void remplaceNegParZeros2D(int[][] tab){

        for (int ligne = 0 ; ligne < tab.length ; ligne++){
            for (int colonne = 0 ; colonne < tab[ligne].length ; colonne++){
                if (tab[ligne][colonne] < 0){
                    tab[ligne][colonne] = 0;
                }
            }
        }


    }

    public static void remplaceNegParZeros4D(int[][][][] tab){

        for (int dim1 = 0 ; dim1 < tab.length ; dim1++){
            for (int dim2 = 0 ; dim2 < tab[dim1].length ; dim2++){
                for (int dim3 = 0 ; dim3 < tab[dim1][dim2].length ; dim3++) {
                    for (int dim4 = 0; dim4 < tab[dim1][dim2][dim3].length; dim4++) {
                        if (tab[dim1][dim2][dim3][dim4] < 0){
                            tab[dim1][dim2][dim3][dim4] = 0;
                        }
                    }
                }
            }
        }
    }

    public static int[] sommeLignes(int[][] tab){

        int[] tabSomme = new int[tab.length];

        for (int indiceTabSomme = 0 ; indiceTabSomme < tabSomme.length ; indiceTabSomme ++){
            for (int colonne = 0 ; colonne < tab[indiceTabSomme].length ; colonne++){
                tabSomme[indiceTabSomme] += tab[indiceTabSomme][colonne];
            }
        }
        return tabSomme;
    }

    public static int[] nbZerosParLigne(int[][] tab){

        int[] tabNbZeros = new int[tab.length];

        int cpt = 0;
        for (int indiceTabSomme = 0 ; indiceTabSomme < tabNbZeros.length ; indiceTabSomme ++){
            for (int colonne = 0 ; colonne < tab[indiceTabSomme].length ; colonne++){
                if (tab[indiceTabSomme][colonne] == 0){
                    cpt++;
                }
            }
            tabNbZeros[indiceTabSomme] = cpt;
            cpt = 0;
        }
        return tabNbZeros;
    }

    public static boolean[] estPresent0ParLignes(int[][] tab){

        boolean[] presence0Lignes = new boolean[tab.length];


        for (int indiceTabSomme = 0 ; indiceTabSomme < presence0Lignes.length ; indiceTabSomme ++){
            for (int colonne = 0 ; colonne < tab[indiceTabSomme].length ; colonne++){
                if (tab[indiceTabSomme][colonne] == 0){
                    presence0Lignes[indiceTabSomme] = true;
                    break;
                }
            }

        }
        return presence0Lignes;
    }

}
