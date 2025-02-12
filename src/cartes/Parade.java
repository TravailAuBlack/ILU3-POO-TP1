package cartes;

public class Parade extends Bataille {
	
	public Parade(Type type) {
		super(type);
	}
	
	
	@Override
	public String toString() {
		switch(type) {
			case FEU :
				return "Feu vert";
			case ESSENCE:
				return "Essence";
			case ACCIDENT:
				return "Reparation";
			case CREVAISON:
				return "Roue de secours";
			default:
				return "Pas de carte parade";
		}
	}

}
