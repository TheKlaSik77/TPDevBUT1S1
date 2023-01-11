/*
 * Cette classe contient toutes les méthodes concernant les opérations sur les températures.
 */
public class FarenheitEtCelsius {

    /**
     * Affiche la conversion d'une température en farenheit passée en paramètre.
     *
     * @param tempEnFarenheit
     *
     * température à convertir (en Farenheit).
     *
     */
    public static void afficherFenC(double tempEnFarenheit){
        double tempEnCelsuis = ((tempEnFarenheit - 32) * 5.0) / 9.0;

        System.out.println(tempEnFarenheit + " -> " + tempEnCelsuis);
    }

    /**
     * Affiche la conversion d'une température en Farenheit entière approximative.
     *
     * @param tempEnFarenheit
     *
     * température entière à convertir (en Farenheit)
     */
    public static void afficherFenCApprox(int tempEnFarenheit){
        double tempEnC = Math.round((tempEnFarenheit - 32) * 5.0) / 9.0;
        long tempCApprox = Math.round(tempEnC);

        System.out.println(tempEnFarenheit + " ~> " + tempCApprox);
    }

    /**
     *      Retourne la conversion d'une température en farenheit passée en paramètre.
     *
     * @param tempEnFarenheit
     *      température à convertir (en Farenheit).
     *
     * @return
     *      conversion en degrés celsius.
     */
    public static double convertirFenC(double tempEnFarenheit){

        return ((tempEnFarenheit - 32) * 5.0) / 9.0;
    }

    /**
     * Vérifie si l'eau gèle.
     * @param tempEnFarenheit
     *      Température en farenheit
     * @return
     *      vrai si la température en degrés celsius est inférieure ou égale à 0, faux sinon
     */
    public static boolean caGeleEnF(double tempEnFarenheit){

        if (convertirFenC(tempEnFarenheit) <= 0) {
            return true;
        }
        return false;
    }

    /**
     * Affiche "Attention! Ça glisse!" si la ça gèle, "Pas de Danger!" sinon.
     *
     * @param tempEnFarenheit
     *      température en Farenheit.
     */
    public static void caGlisseEnF(double tempEnFarenheit){
        if (caGeleEnF(tempEnFarenheit) == true){
            System.out.println("Attention! Ça glisse!");
        } else {
            System.out.println("Pas de Danger!");
        }
    }

    /**
     * Renvoie l'état d'ébullition de l'eau
     *
     * @param tempEnFarenheit
     *      Température en Farenheit.
     *
     * @return
     *      retourne vrai si la température de l'eau est supérieure à 100 degrés celsius, faux sinon.
     */
    public static boolean caBoutEnF(double tempEnFarenheit){

        if (convertirFenC(tempEnFarenheit) >= 100){
           return true;
        }
        return false;
    }

    /**
     * renvoie true si l'eau est à l'état liquide, faux sinon.
     * @param tempEnFarenheit
     *      température en Farenheit.
     * @return
     *      retourne true si la température en degrés Celsius est entre 1 et 99.
     */
    public static boolean eauLiquideEnF(double tempEnFarenheit){
        if ((convertirFenC(tempEnFarenheit) > 0) && (convertirFenC(tempEnFarenheit) < 100)){
            return true;
        }
        return false;
    }




}
