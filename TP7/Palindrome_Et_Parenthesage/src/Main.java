import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*
        System.out.println(OperationsString.estUnPalindrome("ressasser"));
        System.out.println(OperationsString.estUnPalindrome("bateau"));
        System.out.println(OperationsString.estUnPalindrome(""));
        System.out.println(OperationsString.estUnPalindrome("12345678987654321"));
        System.out.println(OperationsString.estUnPalindrome("00000"));
        System.out.println(OperationsString.estUnPalindrome("757"));
        System.out.println(OperationsString.estUnPalindrome("789874"));

        OperationsString.affichePalindromeSaisie();
        OperationsString.affichePalindrome("ressasser");
        OperationsString.affichePalindrome("bateau");
        OperationsString.affichePalindrome("");

        System.out.println(OperationsString.parenthesesCorrectes("((()(()())()))")); //→ vrai
        System.out.println(OperationsString.parenthesesCorrectes("()((()(((()())(())))()))")); //→ vrai
        System.out.println(OperationsString.parenthesesCorrectes("()((()(((()())(())))()))")); //→ vrai
        System.out.println(OperationsString.parenthesesCorrectes("(")); //→ faux
        System.out.println(OperationsString.parenthesesCorrectes(")")); //→ faux
        System.out.println(OperationsString.parenthesesCorrectes("(()))(()")); //→ faux
        System.out.println(OperationsString.parenthesesCorrectes("()())(((()())(()))()))")); //→ faux
        */

        System.out.println(OperationsString.parenthesesCorrectes("[{()}]")); // -> Vrai
        System.out.println(OperationsString.parenthesesCorrectes("({()}){}[]")); // -> Vrai
        System.out.println(OperationsString.parenthesesCorrectes("")); // -> Vrai
        System.out.println(OperationsString.parenthesesCorrectes("[{(})]")); // -> Faux



    }
}