import javax.swing.*;
import java.awt.*;

public class drawNumbers extends JFrame{
	
	
	public drawNumbers(){
		
		super ("heres some numbers");
		setSize(500,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setResizable(false);
		JLabel nameLabel = new JLabel("fite me");
		nameLabel.setSize(400,20);
		nameLabel.setLocation(10, 10);
		add(nameLabel);
		setLayout(null);
		JLabel number[] = new JLabel[3];
		number[0].setSize(20, 20);
//		number[0].setLocation(95, 95);
//		add(number[0]);
		
		
		
		
		//System.out.println(number.length);
		//int xpos = 0;
		//int ypos = 0;
		//visuals.changeArraylabel(number, 1, "biitch", 20, 20, 150, 300);
		
//		for (int i = 0; i < number.length; i++){
//			
//			number[i].setText(Integer.toString(i));
//			number[i].setSize(20, 20);
//			number[i].setLocation(xpos, ypos);
//			xpos += 20;
//			ypos += 20;
//			number[i].setVisible(true);
//			add(number[i]);
//	}
//		JLabel test = new JLabel("hi");
//		test.setSize(50,50);
//		test.setLocation(100, 100);
//		setLayout(null);
//		setVisible(true);
//		add(test);
		
	}
	
	
	public static void main(String[] args) {
		
		int array[][] = new int[3][3];

		PlaysWithArrays.fillarray(1, array);
		PlaysWithArrays.print2darray(array);
		drawNumbers drawn = new drawNumbers(); //this is an issue line
	}

}
