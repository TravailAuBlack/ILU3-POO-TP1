package jeu;

import cartes.*;
import jeu.*;

public class Joueur {
	private String nom;
	private ZoneDeJeu zone;
	private MainJoueur main;
	
	
	
	public Joueur(String nom, ZoneDeJeu zone, MainJoueur main) {
		this.nom = nom;
		this.zone = new ZoneDeJeu();
		this.main = new MainJoueur();
		
	}
	
	@Override
	public String toString() {
		return nom;
	}
	
	public MainJoueur getMain() {
		return main;
	}
	
	public ZoneDeJeu getZoneDeJeu() {
		return zone;
	}
	
	public boolean identiques(String joueur1, String joueur2) {
		return joueur1.toString() == joueur2.toString();
	}
	
	public void Donner(Carte carte) {
		main.prendre(carte);	
	}
	
	 public Carte prendreCarte(Sabot sabot) {
		 Carte piocher = sabot.piocher();
		 main.prendre(piocher);
		 return piocher;
	 }
	
	

}
