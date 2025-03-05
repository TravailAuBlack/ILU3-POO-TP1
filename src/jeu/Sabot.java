package jeu;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

import cartes.Carte;
import cartes.JeuDeCartes;

public class Sabot implements Iterable<Carte> {
	private int nbCartes;
	private Carte[] jeu;
	private int capaciteMax;
	private int nombreOperations=0;
	
	
	public Sabot(Carte[] cartes) {
	    this.jeu =  cartes; 
		this.nbCartes = jeu.length;
		this.capaciteMax = jeu.length;
	}
	
	public boolean estVide() {
		return nbCartes == 0;
	}
	
	
	public void ajouterCarte(Carte carte) throws Exception{
		if(nbCartes > capaciteMax) {
			throw new IllegalStateException("Capcité trop grande");
		}
		jeu[nbCartes] = carte;
		nbCartes++;
		nombreOperations++;
	}
	
	public Carte piocher() {
		if(estVide()) {
			throw new NoSuchElementException("la pioche est vide");
		}
		Iterator<Carte> iter = this.iterator();
		Carte pioche = iter.next();
		iter.remove();
		return pioche;
	}
	
	@Override
	public Iterator<Carte> iterator(){
		return new Iterateur();
	}
	
	private class Iterateur implements Iterator<Carte>{
		private int indiceIterateur = 0;
		private boolean nextEffectue = false;
		private int nombreOperationsReference = nombreOperations;
		
		
		@Override
		public boolean hasNext() {
			return indiceIterateur < nbCartes;
		}

		@Override
		public Carte next() {
			verificationConcurrence();
			if(hasNext()) {
				Carte carte  = jeu[indiceIterateur];
				indiceIterateur++;
				nextEffectue = true;
				return carte;
			}else {
				throw new NoSuchElementException();
			}
		}
		
		@Override
		public void remove() {
			verificationConcurrence();
			if(estVide()|| !nextEffectue) {
				throw new IllegalStateException();
			}
			for(int i =indiceIterateur -1; i< nbCartes -1; i++) {
				jeu[i] = jeu[i+1];
			}
			nextEffectue = false;
			indiceIterateur--;
			nbCartes--;
		}
		
		private void verificationConcurrence(){
		 if (nombreOperations != nombreOperationsReference)
			 throw new ConcurrentModificationException();
		}
		
		
	}

	

}
