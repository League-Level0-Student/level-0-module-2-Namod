//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class IntroToRandom {
	public static void main(String[] args) {
		
		int r = 0;
		
		//3. Now make r random. 
		//   Create an object of the Random class
		//	 use .nextInt() to get a random number
		 Random rand=new Random();
			int  num=rand.nextInt(101);
			JOptionPane.showMessageDialog(null, num);

		//4. Limit the random number between 0 and 100
			 Random rand2=new Random();
				int  num2=rand.nextInt(51)+25;
				JOptionPane.showMessageDialog(null, num2);
		//5. Limit the random number between 25 and 75. Hint: ((highest value - lowest value)+1) + lowest value

		//6. Challenge: Limit the random number between -222 and 88
				 Random rand3=new Random();
					int  num3=rand.nextInt(311)-222;
					JOptionPane.showMessageDialog(null, num3);
		//1. Print out the value of r
		
		//2. Run the program.  What number appears in the console?
		//   Run it again. Is the number the same?
	}
}