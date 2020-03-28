package examples.Swing.HF;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanelWithButtonTestDrive {

	static class PanelWithButton extends JFrame{
		
		private Container container;
		private JButton btn;
		private MyCanvas canvas1;
		
		public PanelWithButton() {
			// frame setting
			super();
			
			this.setSize(400, 300);
			this.setLocation(500,500);
			this.setResizable(true);
			this.setTitle(this.getClass().getName());
			this.setState(JFrame.NORMAL);
			
			
			// get content pane
			container = this.getContentPane();
			
			// initial component
			btn = new JButton("Change Color");
			canvas1 = new MyCanvas();
			
			
			// put components to container
			container.add(BorderLayout.SOUTH, btn);
			container.add(BorderLayout.CENTER, canvas1);
			
			// event handling, using inner class
			btn.addActionListener( new ColorListener() );
			
			
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		
		private class ColorListener implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				canvas1.repaint(); // inner class can access outer class data member
			}
			
		}
		
		private class MyCanvas extends JPanel{

			@Override
			protected void paintComponent(Graphics g) {
				System.out.println("paintComponent is called...");
				
				Graphics2D g2d = (Graphics2D) g;

				g2d.fillRect(0, 0, this.getWidth(), this.getHeight()); // set background color
				
				GradientPaint gradientColor = new GradientPaint(50, 50, new Color(0, 128, 0), 150, 150, Color.orange);
				
				g2d.setPaint(gradientColor);
				g2d.fillOval(50, 50, 100, 100);
				
				
				
			}
			
		}
		
	}
	
		
		
	
	public static void main(String[] args) {
		new PanelWithButton().setVisible(true);
	}

}
