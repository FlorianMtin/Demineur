package VueControleur;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;






public class Case extends JPanel {
	
	private Modele.Case cube ;

	
	/**
	 * @author Florian
	 */
	private static final long serialVersionUID = 1L;

	public Case() {
		super();
		
		float alea = (float) Math.random() * 10;
		if (alea < 5 ) {
		cube = new Modele.Case(Modele.Commun.type.Mine);}
		else {
			cube = new Modele.Case(Modele.Commun.type.Terre);}
	
		
		setBackground(Color.white);
		
		addMouseListener(new MouseAdapter() {
			//@Override
			/*public void mouseEntered(MouseEvent arg0) {
				super.mouseClicked(arg0);
				setBackground(Color.BLACK);
			}
			*/
			//@Override 
			
			
	


			public void mouseClicked(MouseEvent arg0){
				super.mouseExited(arg0); 	
				int num = arg0.getButton();
				if(num==1){
					if(cube.testMine()){
					
							setBackground(Color.red);
					}
				
					else setBackground(Color.black);
				}
				else{
					setBackground(Color.yellow);
					cube.setFlag();
				}
					
					
				
			}
			
			
		});
			 
	}
}