package jeu;

import java.util.Iterator;
import java.util.List;

import cartes.Carte;

public class MainJoueur {
	private List<Carte> main;
	
	
	
	public void prendre(Carte carte) {
		main.add(carte);
	}
	
	
	public void jouer(Carte carte) {
		assert(main.contains(carte));
		main.remove(carte);
	}
	
	
	public Iterator<Carte> iterator(){
		return main.iterator();
	}
	
	@Override
	public String toString() {
		return "main joueur : \n" + main;
	}
	
	

}
