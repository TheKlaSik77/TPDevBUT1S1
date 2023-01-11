public class EncoreDesMethodesSurDesTableaux {

    /**
     * Retourne la moyenne des valeurs d'un tableau
     * @param tab
     *      La longueur du tableau doit être strictement supérieure à 0.
     * @return
     *      retourne la moyenne en valeur approximative.
     */
    public static double moyenne(double[] tab){

        double somme = 0;
        for (int indice = 0 ; indice < tab.length ; indice++){
            somme += tab[indice];
        }
        return somme/ tab.length;
    }

    /**
     * Donne la valeur maximale d'un tableau
     * @param tab
     *      La longueur du tableau doit être strictement supérieure à 0.
     * @return
     *      Retourne la valeur maximale de tab
     */
    public static double plusGrand(double[] tab){

        double maxActuel = tab[0];
        for (double valeur : tab){
            if (valeur > maxActuel){
                maxActuel = valeur;
            }
        }
        return maxActuel;
    }

    /**
     * Test si deux tableaux sont identiques.
     * @param tab1
     *      1er tableau.
     * @param tab2
     *      2e tableau (à comparer au premier).
     * @return
     *      retourne true si les tableaux ont la même taille et si le contenu des deux tableaux est le même.
     */
    public static boolean egaux(int[] tab1, int[] tab2){

        if (tab1.length == tab2.length){
            for (int indice = 0 ; indice < tab1.length ; indice++){
                if (tab1[indice] != tab2[indice]){
                    return false;
                }
            }
            return true;
        }
        return false;

    }

    /**
     * Retourne un tableau contenant la somme entre les deux cases du même indice dans le tab1 et le tab2
     * @param tab1
     *      Doit être de même taille que le tab2
     * @param tab2
     *      Doit être de même taille que le tab1
     * @return
     *      retourne le tableau avec des valeurs valant cases à cases l'addition du tab1 et tab2.
     */
    public static int[] sommeMemeLongueur(int[] tab1, int[] tab2){

        int[] tabSomme = new int[tab1.length];

        for (int indice = 0 ; indice < tab1.length ; indice++){
            tabSomme[indice] = tab1[indice] + tab2[indice];
        }
        return tabSomme;
    }

    /**
     * Retourne la somme entre les deux tableaux case à case et si un des tableaux se termine avant, complète avec les valeurs du plus grand tab
     * @param tab1
     * @param tab2
     * @return
     * la somme entre les deux tableaux
     */
    public static int[] somme(int[] tab1, int[] tab2){

        if (tab2.length > tab1.length){
            int[] temp = tab1;
            tab1 = tab2;
            tab2 = temp;
        }

        int[] tabSomme = new int[tab1.length];

        for (int indice = 0 ; indice < tab1.length ; indice++){
            if (tab2.length > indice){
                tabSomme[indice] = tab1[indice] + tab2[indice];
            } else {
                tabSomme[indice] = tab1[indice];
            }
        }
        return tabSomme;
    }

    /**
     * retourne le tableau de valeurs absolues de tab
     * @param tab
     * @return
     */
    public static int[] positifs(int[] tab){

        int[] tabPos = new int[tab.length];
        for (int indice = 0 ; indice < tab.length ; indice++){
            if(tab[indice] < 0){
                tabPos[indice] = -tab[indice];
            } else{
                tabPos[indice] = tab[indice];
            }
        }
        return tabPos;
    }

    public static void plusGrandSeuil(double[] tab, double seuil){
        int nbSousSeuil = 0;
        int indice = 0;
        for (double val : tab){
            if (val <= seuil){
                nbSousSeuil++;
            }
        }
        if (nbSousSeuil > 0){
            double[] tabSousSeuil = new double[nbSousSeuil];
            for(double val : tab){
                if (val <= seuil){
                    tabSousSeuil[indice] = val;
                    indice++;
                }
            }
            double plusGrand = tabSousSeuil[0];
            for (double val : tabSousSeuil){
                if (val > plusGrand){
                    plusGrand = val;
                }
            }

            System.out.println("La valeur la plus grande dans le tableau sous " + seuil + " est : " + plusGrand + ".");
        } else {
            System.out.println("Pas de valeurs Inférieures au seuil.");
        }
    }

}


