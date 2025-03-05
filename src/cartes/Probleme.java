package cartes;

public abstract class Probleme extends Carte {
	protected Type type;
	
	public Probleme(Type type) {
		this.type  = type;
	}
	
	
	public Type getType() {
		return type;
	}
	
    @Override
    public boolean equals(Object obj) {
        if(super.equals(obj)) { 
        Probleme probleme = (Probleme) obj; 
        return this.type == probleme.getType();
        }
       return false; 
    }

}
