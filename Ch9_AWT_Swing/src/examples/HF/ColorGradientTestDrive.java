package examples.HF;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorGradientTestDrive {

	static class MyDrawPanelGui extends JFrame{
		
		private Container container;
		private MyGradientPanel panel1;
		
		public MyDrawPanelGui() {
			super();
			
			this.setSize(500, 500);
			
			// get content pane
			container = this.getContentPane();
			
			// initial component
			panel1 = new MyGradientPanel();
			
			// put components to container
//			container.add(panel1);
			container.add(BorderLayout.CENTER, panel1);
			
			
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		}
		
		private class MyGradientPanel extends JPanel{

			@Override
			protected void paintComponent(Graphics g) {
				
				Graphics2D g2d = (Graphics2D)g; // downcasting
				
				g2d.fillRect(0, 0, this.getWidth(), this.getHeight()); // set background default color
				
				GradientPaint gradientColor = new GradientPaint(70, 70, Color.blue, 150, 150, Color.orange);
				
				g2d.setPaint(gradientColor);
				g2d.fillOval(70, 70, 100, 100);
				
				
			}
			
		}
		
		
	}
	
	public static void main(String[] args) {
		new MyDrawPanelGui().setVisible(true);

	}

}
