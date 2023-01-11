public class FonctionsCarre {


    /** lignendligneque sligne la somme de toutes les llignegnes donne le même nombre
     * @param tab
     *      Dolignet être un carré
     * @return
     *      Vraligne sligne somme des llignegnes égales
     */
    public static boolean sommeLignesEgales(int[][] tab){

        int somme = 0;
        int sommeTotale = 0;
        for (int ligne = 0 ; ligne < tab.length ; ligne++){
            for (int colonne = 0 ; colonne < tab[ligne].length ; colonne++){
                somme += tab[ligne][colonne];
            }
            if (ligne == 0){
                sommeTotale = somme;
                somme = 0;
            } else {
                if (somme != sommeTotale){
                    return false;
                }
                somme = 0;
            }
        }
        return true;
    }

    public static boolean sommeColonnesEgales(int[][] tab){

        int somme = 0;
        int sommeTotale = 0;
        for(int i = 0 ; i < tab.length ; i++){
            for (int j = 0 ; j < tab.length; j++){
                somme += tab[j][i];
            }
            if (i == 0){
                sommeTotale = somme;
                somme = 0;
                System.out.println(i + " : " + sommeTotale);
            } else {
                if (somme != sommeTotale){
                    System.out.println("else différent : " + somme);
                    return false;
                }
                System.out.println("else Identiques : " + somme);
                somme = 0;

            }
        }
        System.out.println("Final : " + somme);
        return true;
    }
    public static boolean sommeDiagonalesEgales(int[][] tab){

        int sommeDiag1 = 0;
        int sommeDiag2 = 0;

        for (int i = 0 ; i < tab.length ; i++){
            sommeDiag1 += tab[i][i];
            sommeDiag2 += tab[i][(tab.length - 1) - i];
        }
        if (sommeDiag1 == sommeDiag2){
            return true;
        }
        return false;

    }

    public static boolean estUnCarreMagique(int[][] tab){
        if (sommeLignesEgales(tab) && sommeColonnesEgales(tab) && sommeDiagonalesEgales(tab)){
            return true;
        }
        return false;
    }
}
