package VueControleur;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.Border;


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
		
		JMenu m = new JMenu("jeu");
		
		JMenuItem mi = new JMenuItem("Partie");
		
		m.add(mi);
		jm.add(m);
		
		setJMenuBar(jm);
		
		setTitle("Demineur");
		setSize(400, 400);
		JComponent pan = new JPanel (new GridLayout(10,10));
		
		Border blackline = BorderFactory.createLineBorder(Color.black,1);
	    
		
		for(int i=0; i<100;i++){
			JComponent ptest = new Case();
			ptest.setBorder(blackline);
			pan.add(ptest);
		}
		pan.setBorder(blackline);
		add(pan);
		
		
		
		
	}

}
