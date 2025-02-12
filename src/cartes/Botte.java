package cartes;

public class Botte extends Probleme{
	
	
	public Botte(Type type) {
		super(type);
	}
	
	public String toString() {
		switch(type) {
			case FEU : 
				return "Vehicule prioritaire";
			case ESSENCE: 
				return "Citerne d'essence";
			case ACCIDENT:
				return "As du volant";
			case CREVAISON:
				return "Increvable";
			default : 
				return "Pas de Botte";
		}
	}

}
