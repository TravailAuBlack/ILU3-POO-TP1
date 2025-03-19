package cartes;

public abstract class Carte {
	
	
	
	public boolean equals(Object obj) {
		return (obj.getClass() == this.getClass()) ;
	}

}
