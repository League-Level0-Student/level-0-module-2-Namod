package methods;

import javax.swing.JOptionPane;

public class rollercoaster {
public static void main(String[] args) {
	String l = JOptionPane.showInputDialog("How tall are you?");
int i = Integer.parseInt(l);
	if(i<48) {
	
	
	JOptionPane.showConfirmDialog(null, "you cannot ride the ROLLER COASTER.");
	}
	else if(i>=48) {
		JOptionPane.showConfirmDialog(null," you may ridethe ROLLER COASTER");
	}
	
	
}
}