import javax.swing.*;
import java.awt.*;

public class drawNumbers extends JFrame{
	
	
	public drawNumbers(){
		
		super ("heres some numbers");
		setSize(500,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setResizable(false);
		
		JLabel number[] = new JLabel[3];
		int xpos = 0;
		int ypos = 0;
		//if(number[0].equals(null)){System.out.println("you're fucked");}
		
		for (int i = 0; i < number.length; i++){
			
			number[i].setText(Integer.toString(i));
			number[i].setSize(20, 20);
			number[i].setLocation(xpos, ypos);
			xpos += 20;
			ypos += 20;
			number[i].setVisible(true);
		}
		JLabel test = new JLabel("hi");
		test.setSize(50,50);
		test.setLocation(100, 100);
		setLayout(null);
		setVisible(true);
		
		
	}
	
	
	public static void main(String[] args) {
		
		int array[][] = new int[3][3];

		PlaysWithArrays.fillarray(1, array);
		PlaysWithArrays.print2darray(array);
		drawNumbers drawn = new drawNumbers();
	}

}
