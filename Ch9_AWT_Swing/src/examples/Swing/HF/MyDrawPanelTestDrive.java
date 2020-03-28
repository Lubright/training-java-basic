package examples.Swing.HF;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.GridBagLayout;
import java.awt.Image;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyDrawPanelTestDrive {

	static class MyDrawPanelGui extends JFrame{
		
		private Container container;
		private MyDrawPanel panel1;
		private MyImagePanel panel2;
		
		public MyDrawPanelGui() {
			super();
			
			this.setSize(500, 500);
			
			// get content pane
			container = this.getContentPane();
			container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS)); // set container layout
			
			// initial component
			panel1 = new MyDrawPanel();
			panel2 = new MyImagePanel();
			
			// put components to container
			container.add(panel1);
			container.add(panel2);
			
			
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		}
		
		private class MyDrawPanel extends JPanel{

			@Override
			protected void paintComponent(Graphics g) {
				
				g.fillRect(0, 0, this.getWidth(), this.getHeight()); // first default black color
				
				g.setColor(Color.orange); // set color to orange
				g.fillRect(20, 50, 100, 100);
				
			}
			
		}
		
		private class MyImagePanel extends JPanel{

			@Override
			protected void paintComponent(Graphics g) {
				Image image = new ImageIcon("./images/chrome.jpg").getImage(); // get jpg image
				
				int red = (int) (Math.random()*256);
				int green = (int) (Math.random()*256);
				int blue = (int) (Math.random()*256);
				Color randomColor = new Color(red, green, blue);
				
				g.setColor(randomColor);
				g.fillRect(0, 0, this.getWidth(), this.getHeight()); // first default black color
				g.drawImage(image, 140, 160, this); // draw image
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		new MyDrawPanelGui().setVisible(true);

	}

}
