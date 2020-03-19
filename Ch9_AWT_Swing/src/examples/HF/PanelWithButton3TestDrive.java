package examples.HF;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import javafx.scene.layout.Border;

public class PanelWithButton3TestDrive {

	static class PanelWithButton extends JFrame{
		
		private Container container;
		private JButton colorBtn;
		private JButton labelBtn;
		private JLabel label;
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
			colorBtn = new JButton("Change Canvas");
			labelBtn = new JButton("Change Label");
			label = new JLabel("I'm a lebel");
			canvas1 = new MyCanvas();
			
			
			// put components to container
			container.add(BorderLayout.SOUTH, colorBtn);
			container.add(BorderLayout.CENTER, canvas1);
			container.add(BorderLayout.EAST, labelBtn);
			container.add(BorderLayout.WEST, label);
			
			// event handling, using lambda
			colorBtn.addActionListener( (e)->{
				JButton btn = (JButton) e.getSource();
				
				canvas1.repaint();
			});
			labelBtn.addActionListener((e)->{
				label.setText("Changed...");
			});
			
			
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
