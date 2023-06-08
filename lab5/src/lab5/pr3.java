package lab5;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.*;
import javax.swing.*;

public class pr3 extends JFrame {
public JFrame myFrame;
public JButton myButton;
public JTextField myText1;
public JCheckBox myCheck;
public JRadioButton myRButton;
public static JLabel myLabel;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new pr3();
	}
public pr3() {
myFrame = new JFrame("Окно");
myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
myButton = new JButton("1");
myCheck = new JCheckBox("2");
myRButton = new JRadioButton("3");
myText1 = new JTextField();
myLabel = new JLabel(" ");
JPanel myPanel = new JPanel();
myPanel.add(myButton);
myPanel.add(myCheck);
myPanel.add(myRButton);
myButton.addMouseListener(new MyMouseListener());
myCheck.addMouseListener(new MyMouseListener());
myRButton.addMouseListener(new MyMouseListener());
myText1.addMouseListener(new MyMouseListener());
myFrame.add(myText1,BorderLayout.NORTH);
myFrame.add(myPanel,BorderLayout.CENTER);
myFrame.add(myLabel,BorderLayout.SOUTH);
myFrame.setMinimumSize(new Dimension(200,100));
myFrame.setVisible(true);
}
}
class MyMouseListener implements MouseListener{
	public void mouseClicked(MouseEvent e) {
		pr3.myLabel.setText(e.getComponent().getClass().toString());
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
		
}
