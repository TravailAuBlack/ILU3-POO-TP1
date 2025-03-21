package cartes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class JeuDeCartes {
	private Configuration[] typesDeCartes;
	
	
	
	
	
	public JeuDeCartes() {
        typesDeCartes = new Configuration[] {
                new Configuration(new Borne(25), 10),
                new Configuration(new Borne(50), 10),
                new Configuration(new Borne(75), 10),
                new Configuration(new Borne(100), 12),
                new Configuration(new Borne(200), 4),
                new Configuration(new Parade(Type.FEU), 14),          // Feu Vert
                new Configuration(new FinLimite(), 6),                // Fin Limite
                new Configuration(new Parade(Type.ESSENCE), 6),       // Roue de secours
                new Configuration(new Parade(Type.ACCIDENT), 6), // R�paration
                new Configuration(new Parade(Type.CREVAISON), 6), // R�paration
                new Configuration(new Attaque(Type.FEU), 5),          // Feu Rouge
                new Configuration(new DebutLimite(), 4),              // Limite 50
                new Configuration(new Attaque(Type.ESSENCE), 3),      // Panne d'essence
                new Configuration(new Attaque(Type.CREVAISON), 3),    // Crevaison
                new Configuration(new Attaque(Type.ACCIDENT), 3),     // Accident
                new Configuration(new Botte(Type.FEU), 1),            // Prioritaire (V�hicule Prioritaire)
                new Configuration(new Botte(Type.ESSENCE), 1),        // Citerne
                new Configuration(new Botte(Type.CREVAISON), 1),      // Increvable
                new Configuration(new Botte(Type.ACCIDENT), 1),       // As du volant
            };
	}
	
	
	public void affichageJeuDeCartes() {
		for(Configuration configuration : typesDeCartes ) {
			System.out.println (configuration.getNbExemplaires() + " " + configuration.getCarte() + "\n");
		}
	}
	
	
	public Carte[] donnerCartes() {
		ArrayList<Carte> carte= new ArrayList<>(); 
		for(Configuration configuration : typesDeCartes ) {
			for(int i =0; i<configuration.getNbExemplaires(); i++) {
				carte.add(configuration.getCarte());
			}
		}
		return carte.toArray(new Carte[0]);
	}
	
	public boolean checkCount() {
		Carte[] carte = donnerCartes();
		Map<Carte, Integer> carteCount = new HashMap<>();
		
		for(Carte cartes : carte) {
			carteCount.put(cartes, carteCount.getOrDefault(carte, 0) + 1);
		}
		
		for(Configuration config : typesDeCartes) {
			Carte carteInit = config.getCarte();
			int i = config.getNbExemplaires();
			int carteActuelle = carteCount.getOrDefault(carteInit, 0);
			
			if(i != carteActuelle)
				return false;
		}
		return true;
	}
	
	
	
	
	
	
	public class Configuration extends Carte{
		private int nbExemplaires;
		private Carte carte;
		
		
		public Configuration(Carte carte, int nbExemplaires) {
			this.carte = carte;
			this.nbExemplaires = nbExemplaires;
		}
		
		
		public Carte getCarte() {
			return carte;
		}
		
		public int getNbExemplaires() {
			return nbExemplaires;
		}
		
	}
	
	
	
	
	
	

	

}
