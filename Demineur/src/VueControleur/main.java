package VueControleur;


import javax.swing.SwingUtilities;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    SwingUtilities.invokeLater(new Runnable(){
			
	    	
	    	public void run(){
					
					Vue fenetre = new Vue();
					fenetre.setVisible(true);
					
				
			}
	    	
		});

	 }
}


