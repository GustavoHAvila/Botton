package Atividade06;

import javax.swing.JFrame;

public class CheckBoxTest {

	public static void main(String[] args) {
		CheckBoxFrame checkBoxFrame = new CheckBoxFrame(); 
		checkBoxFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		checkBoxFrame.setSize( 275, 100 ); // configura o tamanho do frame
		checkBoxFrame.setVisible( true );
		
		//Radio Button Test
		RadioButtonFrame radioButtonFrame = new RadioButtonFrame();
		radioButtonFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		radioButtonFrame.setSize( 300, 100 );
		radioButtonFrame.setVisible( true ); 
	}

}
