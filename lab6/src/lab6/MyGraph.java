package lab6;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import lab6_1.JMyPanel;
public class MyGraph extends JFrame implements ActionListener{
private JMyPanel2 myPanel= new JMyPanel2();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyGraph("Окно с графикой");
	}
public MyGraph(String s) {
	super(s);
	Box myBox = new Box(BoxLayout.X_AXIS);
	JButton[] figs=new JButton[5];
	for (int i=0;i<5;i++) {
		figs[i]=new JButton (JMyPanel2.Figure.values()[i].toString());
		figs[i].addActionListener(this);
		myBox.add(figs[i]);
		if (i!=4) {
			myBox.add(Box.createHorizontalGlue());
		}
	}
	myBox.setAlignmentX(CENTER_ALIGNMENT);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	add(myBox,BorderLayout.NORTH);
	add(myPanel,BorderLayout.CENTER);
	Dimension size = getSize();
	size.setSize(size.width, size.height+200);
	setMinimumSize(size);
	pack();
	setVisible(true);
}
public void actionPerformed(ActionEvent e) {
	myPanel.ris(e.getActionCommand());
}
}
