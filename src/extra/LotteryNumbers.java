package extra;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {
public static void main(String[] args) {
	for(int i = 0 ; i < 5; i ++) {
	int num = new Random().nextInt(1000);
	System.out.print(num+" ");
}
}
}
