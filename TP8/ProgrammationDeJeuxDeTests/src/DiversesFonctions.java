public class DiversesFonctions {

    /*
     * Retourne la valeur absolue d'un int.
     */
    public static int valAbs(int x) {
        int valAbs;
        if (x<0) {
            valAbs = -x;
        }
        else {
            valAbs = x;
        }
        return valAbs;
    }

    /*
     * Retourne la valeur absolue d'un int.
     */
    // Autre solution avec return dans les branches du if...else.

/*	public static int valAbs(int x) {
		if (x<0) {
			return -x;
		}
		else {
			return x;
		}
	}
*/

    /*
     * Retourne true si x est égal à zéro.
     */
    public static boolean estNul (int x){
        return x==0;
    }

    /*
     * Retourne un nombre aléatoire pair compris entre 0 et 100 inclus.
     */
    public static int aleatoirePairEntre0et100inclus() {
        return 2*(int)(Math.random()*51);
    }

    /**
     * Indique le signe de a.
     * @param a
     *      entier
     * @return
     *      -1 si a est négatif, 0 si a vaut 0, 1 si a est positif
     */
    public static int signe(int a){
        if (a < 0)
            return -1;
        else if (a == 0)
            return 0;
        return 1;
    }

    /**
     * Indique si a est pair ou non
     * @param a
     *      entier
     * @return
     *      true si pair, false sinon
     */
    public static boolean pair(int a){
        return (a % 2 == 0);
    }

    /**
     * Renvoie la plus grande valeur parmis 3
     * @param a
     *      entier
     * @param b
     *      entier
     * @param c
     *      entier
     * @return
     *      si a>=b && a>=c -> a
     *      si b>=c && b>=a -> b
     *      si c>=a && c>=b -> c
     */
    public static int max(int a, int b, int c){
        if (a >= b && a >= c){
            return a;
        } else if (b >= a && b >= c){
            return b;
        }
        return c;
    }

    /**
     * Indique si une chaîne de caractères n'est pas vide
     * @param s
     *      chaîne de caractère
     * @return
     *      true si longeur de la chaine s > 0, false sinon
     */
    public static boolean auMoinsUnCaractère(String s){
        return (s.length() > 0);
    }

    /**
     * Indique si la chaîne est un nombre binaire.
     * @param s
     *      chaine de caractère
     * @return
     *      true si s est un nombre binaire, false sinon
     */
    public static boolean nombreBinaire(String s){
        if ( ! auMoinsUnCaractère(s)){
            return false;
        } else {
            for (int indice = 0; indice < s.length(); indice++) {
                if (s.charAt(indice) != '1' && s.charAt(indice) != '0') {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Renvoie le nombre int correspondant à la chaine de caractère en paramètre si elle contient au plus 9 chiffres et s'il est positif
     * @param nombreEntierPositif
     *      chaine de caractère à convertir en int
     * @return
     *      retourne le nombre en int si c'est bien un nombre de au plus 9 chiffres, -1 sinon
     */
    public static int valeur(String nombreEntierPositif){

        char car = ' ';
        int valeur = 0;
        int mult = 1 ;
        if (nombreEntierPositif.length() > 9 || nombreEntierPositif.length() == 0){
            return -1;
        } else {
            for (int indexCaractère = 0 ; indexCaractère < nombreEntierPositif.length() ; indexCaractère++) {
                car = nombreEntierPositif.charAt(indexCaractère);
                if ((car != '0') && (car != '1') && (car != '2') && (car != '3') && (car != '4') && (car != '5') && (car != '6') && (car != '7') && (car != '8') && (car != '9')) {
                    return -1;
                }

            }
            for (int index = nombreEntierPositif.length() - 1 ; index >= 0 ; index -- ){
                if (nombreEntierPositif.charAt(index) != '0'){
                    valeur += mult * (nombreEntierPositif.charAt(index) - '0');
                }
                mult *= 10;
            }
        }
        return valeur;

    }

    /**
     * Renvoie la valeur en décimale du nombre binaire en paramètre
     * @param nombreBinaireNonSigne
     *      nombre binaire à convertir
     * @return
     *      retourne la valeur du nombre binaire, -1 si la longueur de la chaine nombreBinaireNonSigne est supérieure à 30 ou si ce n'est pas un nombre binaire.
     */
    public static int valeurBinaire (String nombreBinaireNonSigne){

        int valeurMult = 1;
        int valeur = 0;
        if (nombreBinaireNonSigne.length() > 30){
            return -1;
        } else {
            if (! nombreBinaire(nombreBinaireNonSigne)){
                return -1;
            } else {
                for (int indexCar = nombreBinaireNonSigne.length() - 1; indexCar >= 0 ; indexCar--){

                    if (nombreBinaireNonSigne.charAt(indexCar) == '1'){
                        valeur += valeurMult;
                    }
                    valeurMult *= 2;
                }
            }
            return valeur;
        }
    }

    /**
     * Calcule le pgcd à l'aide de l'algorithme d'Euclide
     * @param a
     * @param b
     * @return
     *      -1 si une des valeurs est égale à 0, le pgcd des deux nombres sinon
     */
    public static int pgcd(int a, int b){


        int valAAbs = valAbs(a);
        int valBAbs = valAbs(b);

        int reste = 1;
        if (valBAbs > valAAbs) {
            int temp = valBAbs;
            valBAbs = valAAbs;
            valAAbs = temp;
        }

        if (valBAbs == 0){
            return valAAbs;
        } else {
            while(valBAbs != 0) {
                int temp = valBAbs;
                valBAbs = valAAbs % valBAbs;
                valAAbs = temp;
            }

        }

        return valAAbs;

    }

    public static String ecritureEnBase2NonSigne(int a){
        // prendre le max 2puissanceN de a à chaque fois, puis ajouter 1 à la bonne position. Ensuite a-r= a
        // et recommencer en faisant une boucle entre nouveau max et ancien max pour mettre des 0.
        StringBuilder nbBinaire = new StringBuilder("");
        int puissanceDe2Max = 0;
        int difference = a;
        for (int puissanceDe2 = 0 ; Math.pow(2,puissanceDe2) <= difference ; puissanceDe2++){
            puissanceDe2Max = puissanceDe2;
        }
        for (int puissanceDe2 = puissanceDe2Max ; puissanceDe2 >= 0 ; puissanceDe2--){
            if ((int)(Math.pow(2,puissanceDe2)) <= difference){
                nbBinaire.append("1");
                difference = difference - (int)(Math.pow(2,puissanceDe2));
            } else {
                nbBinaire.append("0");
            }
        }
        return nbBinaire.toString();

    }
}
