package Modele;

import java.util.Observable;

public class Case extends Observable{
	
	private Commun.type type;
	private int value;
	private boolean visible;
	private boolean flag;
	private Grille grid;


	
	public Case(Commun.type type, Grille grille){
		this.setType(type);
		this.value = 0;
		this.visible = false;
		this.flag = false;
		this.grid = grille;
	}
	
	
	
	public boolean testMine(){
		if (this.getType() == Commun.type.Mine) return true;
		else return false;
	}
	
	public void setFlag(){
		this.flag = false;
	}
	
	public void setVisible(){
		this.visible = true;
	}
	
	public boolean getVisible(){
		return this.visible;
	}
	
	public void setValeur(int value){
		this.value = value;
	}



	public Commun.type getType() {
		return type;
	}



	public void setType(Commun.type type) {
		this.type = type;
	}
	
	public void notifyView() {
		setChanged();
		notifyObservers();
	}



	}
	

