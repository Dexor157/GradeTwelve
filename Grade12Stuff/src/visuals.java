
import javax.swing.*;
import java.awt.*;






public class visuals extends JFrame {

	public visuals(){
		super ("hello world");
		setSize(500,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setResizable(false);
		//JLabel pageLabel = new JLabel("title");
		//FlowLayout flo = new FlowLayout();
		//setLayout(flo);
		//add(pageLabel);
		
		JLabel nameLabel = new JLabel("fite me");
		nameLabel.setSize(400,20);
		nameLabel.setLocation(10, 10);
		JLabel schoolLabel = new JLabel("you wont");
		setLayout(null);
		schoolLabel.setSize(400,20);
		schoolLabel.setLocation(10, 60);
		add(nameLabel);
		add(schoolLabel);
		setVisible(true);
		
		
	}
	
	public static int makeitbigger(int a){
		a++;
		return a;
	}
	
	public static void changeArraylabel(JLabel[] name,int index, String text, int height, int width, int x, int y){
		name[index].setSize(width,height);
		name[index].setLocation(x, y);
		name[index].setText(text);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		visuals vis = new visuals();
		
	}

}
