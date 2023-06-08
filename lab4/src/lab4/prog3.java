package lab4;

import java.awt.*;
import javax.swing.*;
public class prog3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame frame = new JFrame("");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel(new BorderLayout());
		JTextArea textArea = new JTextArea(20,20);
		JLabel Label1 = new JLabel("Метка 1");
		Label1.setHorizontalAlignment(JLabel.CENTER);
		JLabel Label2 = new JLabel("Метка 2");
		Label2.setHorizontalAlignment(JLabel.CENTER);
		panel.setLayout(new GridLayout(5,3));
		int count = 1;
		for (int i=0;i<5;i++) {
			for (int j=0;j<3;j++) {
				if ((i+j)%2==1) {
					panel.add(new JPanel());
				} else {
					JButton button = new JButton( "Кнопка " + count);
			panel.add(button);
			count++;
			}
		}
		}
		frame.add(panel);
		frame.setSize(700,500);
		frame.setVisible(true);
		frame.add(textArea,BorderLayout.WEST);
		frame.add(Label1,BorderLayout.NORTH);
		frame.add(Label2,BorderLayout.SOUTH);
		}
}