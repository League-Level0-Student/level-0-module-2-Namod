package methods;

import javax.swing.JOptionPane;

public class votingbooth {
public static void main(String[] args) {
	String l = JOptionPane.showInputDialog( "How old are you?");
	int i = Integer.parseInt(l);
if(i>=18) {

JOptionPane.showConfirmDialog(null, "Who do you think the next President should be?");
}
else if(i<18) {
	JOptionPane.showMessageDialog(null, "You cant vote?");
}
}
}
