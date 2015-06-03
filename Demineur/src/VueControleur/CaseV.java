package VueControleur;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

public class CaseV extends JPanel  {

	private Modele.Case caseM;
	
	private Vue view;

	/**
	 * @author Florian
	 */
	private static final long serialVersionUID = 1L;

	public CaseV(final Modele.Case caseM, Vue v) {
		
		super();
		this.caseM = caseM; 
		this.view = v;
		

		

		setBackground(Color.gray);

		addMouseListener(new MouseAdapter() {
			// @Override
			/*
			 * public void mouseEntered(MouseEvent arg0) {
			 * super.mouseClicked(arg0); setBackground(Color.BLACK); }
			 */

			public void mouseClicked(MouseEvent arg0) {
				super.mouseExited(arg0);
				int num = arg0.getButton();
				if (num == 1) {
					if (caseM.testMine()) {
						
						setBackground(Color.red);
						caseM.setVisible();
					}

					else {
						//grid.caseVoisine(caseM);
						
						

					}

				} else if (caseM.getVisible() == false) {
					setBackground(Color.yellow);
					caseM.setFlag();
				}
			}

			
		});
		
		this.caseM.addObserver(new Observer() {

	

	@Override
	public void update(Observable arg0, Object arg1) {
		if ( caseM.getVisible() == true){
			if (caseM.testMine()) {
				setBackground(Color.red);
				
				
			}
			
			else {			
				setBackground(Color.white);

			}
		}
	}
		});
		
	}
	}


		



	