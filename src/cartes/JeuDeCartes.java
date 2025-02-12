package cartes;

public class JeuDeCartes {
	private Configuration[] configuration;
	
	
	
	public String affichageJeuDeCartes() {
		StringBuilder string = newStringBuilder();
		
	}
	
	public JeuDeCartes() {
        configurations = new Configuration[] {
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
