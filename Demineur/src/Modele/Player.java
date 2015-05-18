package Modele;

public class Player {
	
	private String name;
	private int score;
	
	
	public Player(String name, int score){
		this.name = name;
		this.score=score;
	}
	
	
	public void addScore(int score){
		this.score += score;
	}
	
	public int getScore(){
		return this.score;
	}
	
	
	public String getName(){
		return this.name;
	}
}

