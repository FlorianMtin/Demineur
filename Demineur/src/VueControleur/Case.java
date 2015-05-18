package VueControleur;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;

public class Case extends JPanel {

	
	/**
	 * @author Florian
	 */
	private static final long serialVersionUID = 1L;

	public Case() {
		super();
		
		setBackground(Color.white);
		
		addMouseListener(new MouseAdapter() {
			//@Override
			/*public void mouseEntered(MouseEvent arg0) {
				super.mouseClicked(arg0);
				setBackground(Color.BLACK);
			}
			*/
			@Override 
			
			public void mouseClicked(MouseEvent arg0){
				super.mouseExited(arg0);
				setBackground(Color.black);
			}
		});
	}
}
