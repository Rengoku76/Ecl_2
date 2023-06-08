package lab6_1;
import java.awt.*;
import javax.swing.JPanel;
public class JMyPanel extends JPanel {
	public static void main(String[] args) {
	}
	public static enum Figure {LINE,OVAL,RECT,ROUNDRCT,CLEAR};
		private Figure vibor = Figure.CLEAR;
		public JMyPanel() {}
		public void ris(String s) {
			vibor=Figure.valueOf(s);
			repaint();
		}
			public void paintComponent(Graphics gr) {
				super.paintComponent(gr);
				Graphics2D g = (Graphics2D)gr;
				g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
				switch (vibor) {
				case LINE: g.drawLine(20,20,100,100);break;
				case OVAL: g.drawOval(20,20,100,100);break;
				case RECT: g.drawRect(20,20,100,100);break;
				case ROUNDRCT: g.drawRoundRect(20, 20, 100, 100, 60, 60);break;
				case CLEAR: g.clearRect(0, 0, getSize().width,getSize().height);break;
				}
			}
		}