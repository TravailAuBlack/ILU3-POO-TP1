package testsFonctionnels;

import cartes.*;
import utilis.GestionCarte;
import java.util.*;

public class TestGestionCartes {
    public static void main(String[] args) {
        JeuDeCartes jeu = new JeuDeCartes();
        List<Carte> listeCarteNonMelangee = new LinkedList<>();
        for (Carte carte : jeu.donnerCartes()){
            listeCarteNonMelangee.add(carte);
        }
        List<Carte>listeCartes = new ArrayList<>(listeCarteNonMelangee);
        System.out.println("Liste avant mélange :\n");
        System.out.println(listeCartes);

        listeCartes = GestionCarte.melanger(listeCartes);
        System.out.println("Liste après mélange :\n");
        System.out.println(listeCartes);

        boolean melangeOk = GestionCarte.verifierMelange(listeCarteNonMelangee, listeCartes);
        System.out.println("Liste mélangée sans erreur ? " + melangeOk +"\n");

        listeCartes = GestionCarte.rassembler(listeCartes);
        System.out.println("Liste après rassemblement :\n");
        System.out.println(listeCartes);

        boolean rassemblementOk = GestionCarte.verifierRassemblement(listeCartes);
        System.out.println("Liste rassemblée sans erreur ? " + rassemblementOk +".\n");

//        List<List<Integer>> listesTest = Arrays.asList(
//                Collections.emptyList(),
//                Arrays.asList(1, 1, 2, 1, 3),
//                Arrays.asList(1, 4, 3, 2),
//                Arrays.asList(1, 1, 2, 3, 1)
//        );
//
//        for (List<Integer> testList : listesTest){
//            System.out.println("\nVérification de la liste " + testList + " :");
//            System.out.println("Rassemblement : " + GestionCarte.verifierRassemblement(testList));
//        }
    }
}
