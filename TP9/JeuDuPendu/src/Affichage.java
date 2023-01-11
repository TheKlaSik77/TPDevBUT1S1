import java.io.IOException;
import java.util.ArrayList;

public class Affichage {

    public static void jeu() throws IOException {

        int essaiActuel = 1;
        int nbErreur = 0;
        int difficulte = FonctionsPendu.demanderDifficulte();
        String mot = FonctionsPendu.motAleatoire();
        String motCache = FonctionsPendu.transformerMotEnMotCache(mot);
        ArrayList<String> listeLettre = new ArrayList<String>();
        String temp = "";

        switch (difficulte){
            case 1:
                while (nbErreur < 9){
                    temp = motCache;
                    System.out.println("Mot à deviner : " + motCache);
                    motCache = FonctionsPendu.placerLettreDansMotCache(mot, motCache,FonctionsPendu.demanderLettre(listeLettre), listeLettre);
                    if(temp.equals(motCache)){
                        nbErreur++;
                        FonctionsPendu.affichePendu(difficulte,nbErreur);
                    }
                    if (motCache.equals(mot)){
                        System.out.println("Bravo! Tu as trouvé! C'était : " + mot);
                        break;
                    }
                    essaiActuel++;
                    System.out.println("----------------------------------------------------------------");
                }
                System.out.println("Vous avez perdu! Le mot était : " + mot);
                break;


            case 2:
                while (nbErreur < 6){
                    temp = motCache;
                    System.out.println("Mot à deviner : " + motCache);
                    motCache = FonctionsPendu.placerLettreDansMotCache(mot, motCache,FonctionsPendu.demanderLettre(listeLettre), listeLettre);
                    if(temp.equals(motCache)){
                        nbErreur++;
                        FonctionsPendu.affichePendu(difficulte,nbErreur);
                    }
                    if (motCache.equals(mot)){
                        System.out.println("Bravo! Tu as trouvé! C'était : " + mot);
                    }
                    essaiActuel++;
                    System.out.println("----------------------------------------------------------------");
                }
                System.out.println("Vous avez perdu! Le mot était : " + mot);
                break;
            case 3:
                while (nbErreur < 3){
                    temp = motCache;
                    System.out.println("Mot à deviner : " + motCache);
                    motCache = FonctionsPendu.placerLettreDansMotCache(mot, motCache,FonctionsPendu.demanderLettre(listeLettre), listeLettre);
                    if(temp.equals(motCache)){
                        nbErreur++;
                        FonctionsPendu.affichePendu(difficulte,nbErreur);
                    }
                    if (motCache.equals(mot)){
                        System.out.println("Bravo! Tu as trouvé! C'était : " + mot);
                    }
                    essaiActuel++;
                    System.out.println("----------------------------------------------------------------");
                }

                System.out.println("Vous avez perdu! Le mot était : " + mot);
                break;
        }



    }
}
