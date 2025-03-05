package cartes;

public enum Type {
	FEU("feu rouge", "feu vert" , "vehicule prioritaire"), 
	ESSENCE("panne d'essence", "essence", "citerne d'essence"),
	CREVAISON("crevaison", "roue de secours", "increvable"),
	ACCIDENT("accident", "reparation", "as du volant");
	private String attaque;
	private String parade; 
	private String botte;
	
	
	private Type( String attaque , String parade, String botte) {
		this.attaque = attaque;
		this.parade = parade;
		this.botte  = botte;
	}


	

}
