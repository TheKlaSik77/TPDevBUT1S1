import java.util.Scanner;

public class MethodesTableaux {

    static int[] saisirNotesDansTab(int[] tab){
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        int note = 0;

        for (int indice = 0 ; indice < tab.length ; indice++){
            System.out.print("Veuillez saisir une note pour l'étudiant " + (indice+1) + ": ");
            note = scanner.nextInt();
            while (note < 0 || note > 20){
                System.out.println("Note invalide! Saisissez une note comprise entre 0 et 20: ");
                note = scanner.nextInt();
            }
            tab[indice] = note;
        }
        return tab;
    }

    static void afficherListeNotes(int[] tab){

        for (int indice = 0 ; indice < tab.length ; indice++){
            System.out.println("Note de l'élève " + (indice+1) + " : " + tab[indice] + "");
        }
    }

    static double moyenneTab(int[] tab){

        int somme = 0;

        for (int indice = 0 ; indice < tab.length ; indice++){
            somme += tab[indice];
        }

        return somme / tab.length;
    }

    static boolean valeursTabSupSeuil(int[] tab){

        Scanner scanner = new Scanner(System.in).useDelimiter("\n");

        System.out.print("Indiquez un seuil : ");
        int seuil = scanner.nextInt();
        while (seuil < 0 || seuil > 20){
            System.out.print("Erreur! Indiquez un seuil compris entre 0 et 20 : ");
            seuil = scanner.nextInt();
        }
        for (int valeur : tab){
            if (valeur < seuil){
                return false;
            }
        }
        return true;
    }

    /*
    pour 1 : [0,20]
    pour 2 : [0,9], [10,20]
    pour 4 : [0,5],[6,10],[11,15],[16,20]
    pour 5 : [0,4],[5,8],[9,12],[13,16],[17,20]
    pour 10 : [0,2],[3,4],[5,6],[7,8],[9,10],[11,12],[13,14],[15,16],[17,18],[19,20]
    pour 20 : [0],[1],[2],....[19],[20]
     */
    static void repartitionIntervalle(int[] tab){

        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Insérez l'intervalle de votre choix (diviseur de 20): ");
        int intervalle = scanner.nextInt();
        while (20 % intervalle != 0 || intervalle <= 0 || intervalle > 20){
            System.out.print("Intervalle incorrect! Insérez l'intervalle de votre choix (diviseur de 20): ");
            intervalle = scanner.nextInt();
        }
        int[] repartition = new int[intervalle];
        int min = 0;
        int max = (20/intervalle);  // On lui ajoute intervalle quand l'op est terminée
        int compteur = 0;
        int caseActuelle = 0;
        while (max <= 20){


            for (int indice = 0 ; indice < tab.length ; indice++){
                if(tab[indice] <= max && tab[indice] >= min){
                    compteur++;
                }
            }
            repartition[caseActuelle] = compteur;
            caseActuelle++;
            System.out.println("Pour [" + min + "," + max + "] : " + compteur + " valeurs");
            if(min == 0){
                min += (20/intervalle) + 1;
            } else {
                min += (20/intervalle);
            }
            max += (20/intervalle);
            compteur = 0;
        }
    }

    static void repetitionIntervalleHistogramme(int[] tab) {

        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Insérez l'intervalle de votre choix (diviseur de 20): ");
        int intervalle = scanner.nextInt();
        while (20 % intervalle != 0 || intervalle <= 0 || intervalle > 20) {
            System.out.print("Intervalle incorrect! Insérez l'intervalle de votre choix (diviseur de 20): ");
            intervalle = scanner.nextInt();
        }
        int[] repartition = new int[intervalle];
        int min = 0;
        int max = (20 / intervalle);  // On lui ajoute intervalle quand l'op est terminée
        int compteur = 0;
        int caseActuelle = 0;
        while (max <= 20) {


            for (int indice = 0; indice < tab.length; indice++) {
                if (tab[indice] <= max && tab[indice] >= min) {
                    compteur++;
                }
            }
            repartition[caseActuelle] = compteur;
            caseActuelle++;
            if (min == 0) {
                min += (20 / intervalle) + 1;
            } else {
                min += (20 / intervalle);
            }
            max += (20 / intervalle);
            compteur = 0;
        }
        max = 20;
        min = (20-(20/intervalle)+1);

        for(int indice = repartition.length - 1 ; indice >= 0 ; indice--){
            System.out.print("Pour [" + min + "," + max + "] ");
            if(min < 10 && max < 10){
                System.out.print("  : ");
            } else if((min < 10 && max >= 10) || (min >= 10 && max < 10)){
                System.out.print(" : ");
            } else {
                System.out.print(": ");
            }
            for (int nbEtoiles = 0 ; nbEtoiles < repartition[indice] ; nbEtoiles++){
                System.out.print("*");
            }

            max = min - 1;
            if (min == (20/intervalle) + 1){
                min = 0;
            } else {
                min -= (20/intervalle);
            }
            System.out.println("");
        }
    }

    public static void antizero(int[] tab){
        for(int indice = 0 ; indice < tab.length ; indice++){
            if (tab[indice] < 1){
                tab[indice] = 1;
            }
        }
    }

    public static void modifierNote(int[] tab){

        Scanner scanner = new Scanner(System.in).useDelimiter("\n");

        afficherListeNotes(tab);
        System.out.println("-----------------------------------------------");
        System.out.print("Insérez le numéro de l'élève pour lequel vous voulez modifier la note : ");
        int eleveAModifier = (scanner.nextInt() - 1);
        while (eleveAModifier < 0 || eleveAModifier >= tab.length){
            System.out.print("Élève Invalide! Insérez le numéro de l'élève pour lequel vous voulez modifier la note : ");

            eleveAModifier = (scanner.nextInt() - 1);
        }
        System.out.print("Insérez la nouvelle note de l'élève : ");
        int nouvelleNote = scanner.nextInt();
        while (nouvelleNote < 0 || nouvelleNote > 20){
            System.out.print("Note Invalide! Insérez la nouvelle note de l'élève : ");
            nouvelleNote = scanner.nextInt();
        }
        tab[eleveAModifier] = nouvelleNote;

    }

    public static void ajoutBonus(int[] tab){

        Scanner scanner = new Scanner(System.in).useDelimiter("\n");

        afficherListeNotes(tab);
        System.out.println("-----------------------------------------------");
        System.out.print("De combien voulez-vous augmenter les notes? : ");

        int bonus = scanner.nextInt();

        for (int indice = 0 ; indice < tab.length ; indice++){
            tab[indice] += bonus;
        }
    }

    public static void corrigeMoyenneTropBasse(int[] tab){

        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        double moyenneActuelle = moyenneTab(tab);
        System.out.print("La moyenne générale est de : "+ moyenneTab(tab) + "/20. Quelle moyenne générale visez-vous ? ");

        double moyenneVisee = scanner.nextDouble();

        while (moyenneVisee < moyenneTab(tab) || moyenneVisee > 20){
            System.out.print("Erreur Moyenne insérée inférieure à la moyenne actuelle ou supérieure à 20.\nLa moyenne générale est de : "+ moyenneTab(tab) + "/20. Quelle moyenne générale visez-vous ? ");

            moyenneVisee = scanner.nextDouble();
        }

        while (moyenneActuelle < moyenneVisee){
            for (int indice = 0 ; indice < tab.length ; indice++){
                if(tab[indice] < 20){
                    tab[indice] += 1;
                }
            }
            moyenneActuelle = moyenneTab(tab);
            System.out.println("Moyenne Actuelle : " + moyenneTab(tab) + "/20.");

        }
    }
}
