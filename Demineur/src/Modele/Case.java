package Modele;

public class Case {
	
	private Commun.type type;
	private int value;
	private boolean visible;
	private boolean flag;


	
	public Case(Commun.type type){
		this.type = type;
		this.value = 0;
		this.visible = false;
		this.flag = false;
	}
	
	
	
	public boolean testMine(){
		if (this.type == Commun.type.Mine) return true;
		else return false;
	}
	
	public void setFlag(){
		this.flag = false;
	}
	
	}
	

