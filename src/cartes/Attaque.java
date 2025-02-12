package cartes;

public class Attaque extends Bataille {
	

	public Attaque(Type type) {
		super(type);
	}
	
	
	@Override
	public String toString(){
		switch(type) {
			case FEU:
				return "Feu Rouge";
			case ESSENCE:
				return "Panne d'essence";
			case ACCIDENT:
				return "Accident";
			case CREVAISON:
				return "Crevaison";
			default:
				return "Pas de carte Attaque";
		}
	}
	
	

}
