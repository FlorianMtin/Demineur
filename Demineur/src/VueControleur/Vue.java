package VueControleur;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.AbstractAction;
import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;

import Modele.Grille;


public class Vue extends JFrame{
	
	




	/**
	 * @Author Florian 
	 */
	private static final long serialVersionUID = 1L;




	public Vue() {
        super();
        
        build();
        
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent arg0) {
                super.windowClosing(arg0);
                System.exit(0);
            }
        });
        
        
    }
	
	
	
	
	public void build(){

		
		JMenuBar jm = new JMenuBar();
		
		JMenu m = new JMenu("Partie");
		JMenu l = new JMenu("?");

		
		/* Button dans le JMenu Item */
		
		JMenuItem mi = new JMenuItem("Rejouer");
		final AbstractAction scoreAction = new AbstractAction("Score"){

			@Override
			public void actionPerformed(ActionEvent e){
				JOptionPane.showMessageDialog(null,"Votre Score");
			}
		};

		m.add(mi);
		m.add(scoreAction);
		jm.add(m);
		jm.add(l);

		setJMenuBar(jm);
		
		setTitle("Demineur");
		setSize(400, 400);
		
		
		//Création de la grille point de vue Modèle
		Grille grid = new Grille(10,10,10);

		JComponent pan = new JPanel (new GridLayout(10,10));
		
		Border blackline = BorderFactory.createLineBorder(Color.black,1);
	    
		
		for (int i=0; i< 10; i++){
			for (int j=0 ; j< 10; j++){
				JComponent ptest = new CaseV(grid.getGrid()[i][j],this);
				ptest.setBorder(blackline);
				pan.add(ptest);
			}
		}
		pan.setBorder(blackline);		

		add(pan);

		
	}

}
