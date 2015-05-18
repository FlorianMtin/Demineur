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
		
		Border blackline = BorderFactory.createLineBorder(Color.white,1);
	    
		pan.setBorder(blackline);
		add(pan);
		
		
		
		
	}

}
