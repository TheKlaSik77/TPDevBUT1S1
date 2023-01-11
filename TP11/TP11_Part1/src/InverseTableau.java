public class InverseTableau {

    /*
     * Retourne un tableau contenant les éléments de tab mais dans l'ordre inverse.
     */
    public static int[] creeTableauInverse(int[] tab) {
        int longueur = tab.length;
        int[] tabInverse = new int[longueur];
        for (int i=0 ; i < tabInverse.length ; i++) {
            tabInverse[i] = tab[tabInverse.length-(i+1)];
        }
        return tabInverse;
    }

    /*
     * Inverse l'ordre des éléments de tab.
     */
    public static void inverseTableau(int[] tab) {
        int pivot;
        int longueur = tab.length;
        for (int i=0 ; i < longueur/2 ; i++) {
            pivot = tab[i];
            tab[i] = tab[longueur-(i+1)];
            tab[longueur-(i+1)] = pivot;
        }
    }


}

