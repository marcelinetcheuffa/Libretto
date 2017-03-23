package it.polito.tdp.libretto.model;

import java.util.*;

public class Model {
	
	private List<Esame> esami ;
	
	public Model(){
		this.esami = new ArrayList<Esame>();// Inizializzazione alla lista vuota
		
	}
	/**
	 * Aggiunge un nuovo esame all'elenco degli esami presenti,
	 * verificando che non ci sia già
	 * @param e
	 * @return true se l'ha inserito,false se esisteva già e quindi non l'ha potuto inserire
	 */
	public boolean addEsame(Esame e){
		if(! esami.contains(e)){
			esami.add(e) ;
			return true;
		} else {
			//throw new IllegalArgumentException("L'esme passato esiste già dentro la mia lista");
			return false;
		}
	}
	/**
	 * Ricerca se esiste un esame con il codice specifacoto.
	 * Se esiste ,lo restituisce ,altrimenti restituisce null.
	 * @param codice codice dell'esame da ricercare
	 * @return l'esame trovato,oppure null se non trova
	 */
	public Esame trovaEsame(String codice){
		int pos = esami.indexOf( new Esame (codice,null,null)) ;// Oggetto dello stesso tipo di quello esistante
			if(pos==-1){
			return null;// Dato il codice l'oggetto non è stato trovato
		}else{
			return esami.get(pos);
		}
		}
		
		

}
