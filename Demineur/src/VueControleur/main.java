package VueControleur;


import javax.swing.SwingUtilities;


public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    SwingUtilities.invokeLater(new Runnable(){
			
	    	
	    	public void run(){
					
	    			//Modele.Party game = new Party();
					Vue fenetre = new Vue();
					fenetre.setVisible(true);
					
				
			}
	    	
		});

	 }
}


