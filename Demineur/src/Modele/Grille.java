package Modele;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import Modele.Commun.type;




public class Grille {
	
	public class Point{
		private int x;
		private int y;
		
		public Point(int x, int y){
			this.x = x;
			this.y = y;
		}
		public int getX() {
			return x;
		}
		public void setX(int x) {
			this.x = x;
		}
		public int getY() {
			return y;
		}
		public void setY(int y) {
			this.y = y;
		}
	}
	
	private HashMap<Case,Point> datagrid;
	private int largeur;
	private int hauteur;
	private Case [][] grid;
	private int bomb;
	
	public Grille(int x, int y, int bomb){
		this.datagrid = new HashMap<Case, Point>();
		this.hauteur = x;
		this.largeur = y;
		this.grid = new Case [x][y];
		this.bomb = bomb;
		this.makeGrid(bomb);
	}
	
	
	
	public void caseVoisine(Case bloc){
		bloc.getVisible();
		Point pos = this.datagrid.get(bloc);
		ArrayList<Point> listp = new ArrayList<Point>();
		
		listp.add(new Point(pos.x-1 , pos.y-1));
		listp.add( new Point(pos.x,pos.y-1));
		listp.add( new Point(pos.x+1, pos.y-1));
		listp.add( new Point(pos.x-1, pos.y));
		listp.add( new Point(pos.x+1, pos.y));
		listp.add( new Point(pos.x-1, pos.y+1));
		listp.add(new Point(pos.x,pos.y+1));
		listp.add(new Point(pos.x+1,pos.y+1));
		int bombe = 0;			
		for (Point p : listp){
			if(p.x>= 0 && p.x<largeur && p.y>=0 && p.y< hauteur ){
				if( grid[p.x][p.y].getType() == Commun.type.Mine){
					bombe++;
				}
			
			}
			else{
				listp.remove(p);
			}
		}
		if( bombe == 0 ) {
			bloc.setVisible();
			for(Point p : listp){
				caseVoisine(grid[p.x][p.y]);
			}
			
		}
		else{
			bloc.setVisible();
			bloc.setValeur(bombe);
			bloc.notifyView();
		}
		
	}
	
	public void add(Case bloc,int x, int y){
		this.grid[x][y] = bloc;
		Point p = new Point(x,y);
		this.datagrid.put(bloc, p);
		
	}
	
	public void makeGrid( int nb ){
		Random rand = new Random();
		int bombrest = nb;
		
		for(int i = 0; i< largeur ; i++){
			for( int j = 0; j< hauteur ; j++) {
				if ( nb != 0  && rand.nextInt( hauteur/2 * largeur/2) < bombrest ){
					add(new Case(type.Mine,this),i,j);
					bombrest --;
				}
				
				else { 
					add(new Case(type.Vide,this),i,j);
				}
			}
		}
		
		if(nb!=0){
			while(nb!=0) {
				int x = rand.nextInt(largeur);
				int y = rand.nextInt(hauteur);
				if (grid[x][y].testMine() == false){
					grid[x][y].setType(type.Mine);
					bombrest--;
				}
			}
		}
	}
	
	public Case[][] getGrid(){
		return this.grid;
	}
	


	}


	


	

	
