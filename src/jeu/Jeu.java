package jeu;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import cartes.Carte;
import cartes.JeuDeCartes;

public class Jeu {
    private Sabot sabot;

    public Jeu() {
        Carte[] tableauCartes = new JeuDeCartes().donnerCartes();

        List<Carte> listeCartes = new ArrayList<>();
        Collections.addAll(listeCartes, tableauCartes);
        Collections.shuffle(listeCartes);

        sabot = new Sabot(listeCartes.toArray(new Carte[0]));
    }

    public Sabot getSabot() {
        return sabot;
    }

    public void afficherSabot() {
        System.out.print("Cartes du sabot : ");
        for (Carte carte : sabot) { // Utilisation de l'itérateur de Sabot
            System.out.print(carte + ", ");
        }
        System.out.println();
    }
}