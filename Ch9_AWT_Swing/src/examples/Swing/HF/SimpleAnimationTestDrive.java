package examples.Swing.HF;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class SimpleAnimationTestDrive {
	
	static class SimpleAnimation extends JFrame{
		
		private Container container;
		private MyCanvas canvas;
		private int x, y;
		
		public SimpleAnimation(){
			// frame setting
			super();

			this.setSize(400, 300);
			this.setLocation(500,500);
			this.setResizable(true);
			this.setTitle(this.getClass().getName());
			this.setState(JFrame.NORMAL);
			this.setVisible(true);
			x = 70;
			y = 70;


			// get content pane
			container = this.getContentPane();

			// initial component
			canvas = new MyCanvas();

			// put components to container
			container.add(BorderLayout.CENTER, canvas);
			
			for(int i = 0; i<100; i+=10) {
				x+=10;
				y+=10;
				canvas.repaint();
				
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			

			// event handling, using lambda


			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		}
		
		private class MyCanvas extends JPanel{

			@Override
			protected void paintComponent(Graphics g) {
				Graphics2D g2d = (Graphics2D) g;
				
//				g2d.setColor(Color.white);
				g2d.fillRect(0, 0, this.getWidth(), this.getHeight()); // set background color, reset paint again
				
				g2d.setColor(Color.orange);
				g2d.fillOval(x, y, 20, 20);
				
			}
			
		}
		
		
	}

	public static void main(String[] args) {
		new SimpleAnimation();

	}

}
