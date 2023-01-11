public class MethodesQuiModifientDesTableaux {

    static void raz(int[] tab){
        for (int i = 0 ; i < tab.length ; i++){
            tab[i] = 0;
        }
    }

    static void valAbs(int[] tab){
        for (int i = 0 ; i < tab.length ; i++){
            if(tab[i] < 0){
                tab[i] = - tab[i];
            }
        }
    }

    static void remplirTableauAvecValeursAleatoires(int[] t, int valMin, int valMax){
        int rand = 0;

        for (int indice = 0 ; indice < t.length ; indice++) {
            rand = (int) (Math.random() * ((valMax + 1) - valMin)) + valMin;
            t[indice] = rand;
        }
    }

    public static int[] creerEtremplirTableauAvecValeursAleatoires(int longueur, int valMin, int valMax){
        int[] tab = new int[longueur];

        remplirTableauAvecValeursAleatoires(tab, valMin,valMax);
        return tab;
    }

    public static void afficherTab(int[] tab){
        for (int val : tab){
            System.out.println(val);
        }
    }
}
