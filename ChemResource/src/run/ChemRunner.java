package run;

import javax.swing.JApplet;

public class ChemRunner extends JApplet {
	
	
	public ChemRunner() {
		new Window();
	}
	
	public static void main(String args[]) {
	    java.awt.EventQueue.invokeLater(new Runnable() {
	        public void run() {
	            new ChemRunner().setVisible(true);
	        }
	    });
	}
	

	
}
