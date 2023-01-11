import java.util.Scanner;

public class OperationsString {

    public static boolean estUnPalindrome(String motATester){

        char lettreTest = 'a';
        if (motATester.equals("")){
            return true;
        } else if(motATester.length() % 2 == 1){
            for (int indexLettre = 0 ; indexLettre < ((motATester.length() - 1) / 2) ; indexLettre++){
                lettreTest = motATester.charAt(indexLettre); // On récupère la lettre de l'indexLettre.
                if (((motATester.charAt(indexLettre)) != (motATester.charAt(motATester.length() - 1 - indexLettre)))) { // Teste l'égalité entre la lettre de l'indice et la lettre correspondante à l'indice en partant de la fin du mot. (-1, car l'indice part de 0)
                    return false;
                }
            }
            return true;
        } else {
            for (int indexLettre = 0 ; indexLettre < ((motATester.length()) / 2) ; indexLettre++){

                if ((motATester.charAt(indexLettre) != ((motATester.charAt(motATester.length() - 1 - indexLettre))))) { // Teste l'égalité entre la lettre de l'indice et la lettre correspondante à l'indice en partant de la fin du mot. (-1, car l'indice part de 0)
                    return false;
                }
            }
            return true;
        }
    }

    public static void affichePalindromeSaisie(){

        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Saisissez un mot, je vous dirai si c'est un palindrome ou pas : ");
        String motATester = scanner.nextLine();

        if (estUnPalindrome(motATester) == true){
            System.out.println(motATester + " est un palindrome!");
        } else {
            System.out.println(motATester + " n'est pas un palindrome!");
        }
    }

    public static void affichePalindrome(String motATester){

        if (estUnPalindrome(motATester) == true){
            System.out.println(motATester + " est un palindrome!");
        } else {
            System.out.println(motATester + " n'est pas un palindrome!");
        }
    }

    public static boolean parenthesesCorrectes(String expression){

        int nbParenthesesOuvrantes = 0;
        int nbParenthesesFermantes = 0;
        int nbAccoladesOuvrantes = 0;
        int nbAccoladesFermantes = 0;
        int nbCrochetsOuvrants = 0;
        int nbCrochetsFermants = 0;

        char dernierCharOuvrant = ' ';


        for (int index = 0 ; index < expression.length() ; index++) {
            if((expression.charAt(index) == '(') || (expression.charAt(index) == ')')){
                if (expression.charAt(index) == '(') {
                    nbParenthesesOuvrantes++;
                    dernierCharOuvrant = '(';
                } else if (expression.charAt(index) == ')') {
                    nbParenthesesFermantes++;
                    if ((nbParenthesesOuvrantes >= nbParenthesesFermantes) && (dernierCharOuvrant == '(')) {
                        nbParenthesesOuvrantes--;
                        nbParenthesesFermantes--;
                    } else {
                        return false;
                    }
                }
            } else if ((expression.charAt(index) == '{') || (expression.charAt(index) == '}')){
                if (expression.charAt(index) == '{') {
                    nbAccoladesOuvrantes++;
                    dernierCharOuvrant = '{';
                } else if (expression.charAt(index) == '}') {
                    nbAccoladesFermantes++;
                    if ((nbAccoladesOuvrantes >= nbAccoladesFermantes) && (dernierCharOuvrant == '{')) {
                        nbAccoladesOuvrantes--;
                        nbAccoladesFermantes--;
                    } else {
                        return false;
                    }
                }
            } else if ((expression.charAt(index) == '[') || (expression.charAt(index) == ']')){
                if (expression.charAt(index) == '[') {
                    nbCrochetsOuvrants++;
                    dernierCharOuvrant = '[';
                } else if (expression.charAt(index) == ']') {
                    nbCrochetsFermants++;
                    if ((nbCrochetsOuvrants >= nbCrochetsFermants) && (dernierCharOuvrant == '[')) {
                        nbCrochetsOuvrants--;
                        nbCrochetsFermants--;
                    } else {
                        return false;
                    }
                }

            }
        }
        if ((nbParenthesesOuvrantes == 0 && nbParenthesesFermantes == 0) && (nbAccoladesOuvrantes == 0 && nbAccoladesFermantes == 0) && (nbCrochetsOuvrants == 0 && nbCrochetsFermants == 0)){
            return true;
        } else {
            return false;
        }


    }

}
