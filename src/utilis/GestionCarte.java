package utilis;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Random;

import cartes.Carte;

public class GestionCarte {
	private static final Random random = new Random();
	
//	public <C> C extaire( List<C> liste) {
//		if(liste.isEmpty()){
//			throw new IllegalArgumentException("La liste ne doit pas être vide !");
//		}
//		int carteRandom = random.nextInt(liste.size());
//		return liste.remove(carteRandom);
//	}
//	
	
	public static <C> C extraire( List<C> liste) {
		if(liste.isEmpty()){
			throw new IllegalArgumentException("La liste ne doit pas être vide !");
		}
		
		int carteRandom = random.nextInt(liste.size());
		ListIterator<C> iterateur = liste.listIterator();
		C elt = null;
		for(int i=0; i<= carteRandom ; i++){
			elt = iterateur.next();
		}
        iterateur.remove();
        return elt;
	}
	
	public static <C> List<C> melanger(List<C> liste) {
		 List<C> listeMelangee = new ArrayList<>();
		 while(!liste.isEmpty()) {
			 listeMelangee.add(extraire(liste));
		 }
		 return listeMelangee;
		
	}
	
	
	
	public static <T> boolean verifierMelange(List<T> liste1, List<T> liste2) {
 
        for(T element : liste1){
            if(Collections.frequency(liste1, element)!=Collections.frequency(liste2, element)) {
                return false;
            }
        }
        if(liste1.size()!=liste2.size())
            return false;
        
        return true;
    }
	
	
	
	 public static <T> List<T> rassembler(List<T> liste) {
	        Map<T,Integer> occurrences = new LinkedHashMap<>();
	        List<T> resultat = new ArrayList<>();
	        
	        for(T element : liste){
	            occurrences.put(element, occurrences.getOrDefault(element, 0) + 1);
	        }
	        
	        for(Map.Entry<T,Integer> entry: occurrences.entrySet()){
	            for(int i=0;i<entry.getValue();i++){
	                resultat.add(entry.getKey());
	            }
	        }
	        return resultat;
	    }
	 
	 
	   public static <T> boolean verifierRassemblement(List<T> liste){
	        if (liste.isEmpty()){
	            return true;
	        }
	        ListIterator<T> it1 = liste.listIterator();
	        T lastValue = it1.next();
	        while(it1.hasNext()){
	            T current =it1.next();
	            if(!current.equals(lastValue)){
	                ListIterator<T> it2 = it1;  
	                while(it2.hasNext()){
	                    if(it2.next().equals(lastValue)){
	                        return false; 
	                    }
	                }
	                lastValue = current;
	            }
	        }
	        return true;
	    }
	   
	   
	 
	 
	 
		
	
	
	

}
