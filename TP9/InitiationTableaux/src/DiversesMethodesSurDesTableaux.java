
public class DiversesMethodesSurDesTableaux {

    static int nbOccurrences (int[] tab, int val){

        int nbOcc = 0;

        for (int indice = 0 ; indice < tab.length ; indice++){
            if (tab[indice] == val) {
                nbOcc++;
            }
        }
        return nbOcc;
    }

    static int nbStrictementNegatifs(int[] tab){
        int nbNeg = 0;
        for (int indice = 0 ; indice < tab.length ; indice++){
            if (tab[indice] < 0){
                nbNeg++;
            }
        }
        return nbNeg;
    }

    static int sommeValeurs(int[] tab){
        int sommeVal = 0;

        for (int indice = 0 ; indice < tab.length ; indice++){
            sommeVal += tab[indice];
        }
        return sommeVal;
    }

    static boolean estPresent (int[] tab, int val){

        for (int indice = 0 ; indice < tab.length ; indice++){
            if (tab[indice] == val){
                return true;
            }
        }
        return false;

    }

    static boolean tousPositifs(int[] tab){

        for(int indice = 0 ; indice < tab.length ; indice++){
            if (tab[indice] < 0){
                return false;
            }
        }
        return true;
    }

    static int indicePremOccurrence(int[] tab, int val){

        for (int indice = 0 ; indice < tab.length ; indice++){
            if(tab[indice] == val) {
                return indice;
            }
        }
        return -1;
    }

    static int indiceDernOccurrence(int[] tab, int val){

        int dernierIndice = -1;
        for (int indice = 0 ; indice < tab.length ; indice++){
            if(tab[indice] == val) {
                dernierIndice = indice;
            }
        }
        return dernierIndice;
    }

    static int nbOccurrences(int[] tab, int min, int max){

        int nbOcc = 0;
        if (min > max){
            return -1;
        }
        for (int indice = 0 ; indice < tab.length ; indice++){
            if (tab[indice] <= max && tab[indice] >= min){
                nbOcc++;
            }
        }
        return nbOcc;
    }

    static double plusGrandPositif(double[] tab){

        double valMax = -1;
        if (tab.length == 0){
            return -1;
        }
        for(int indice = 0 ; indice < tab.length ; indice++){
            if(tab[indice] >= 0 && tab[indice] > valMax) {
                valMax = tab[indice];
            }
        }
        return valMax;
    }

    static int nbOccBigramme(String chaine){

        char[] tabChar = new char[chaine.length()];

        int nbOcc = 0;

        for (int indice = 0 ; indice < tabChar.length; indice++){
            tabChar[indice] = chaine.charAt(indice);
        }
        for (int indice = 0 ; indice < tabChar.length; indice++){
            if(indice != tabChar.length - 1) {
                if (tabChar[indice] == tabChar[indice + 1]) {
                    nbOcc++;
                    if (indice == tabChar.length - 2) {
                        break;
                    } else {
                        indice++;
                    }
                }
            }
        }
        return nbOcc;
    }
}
