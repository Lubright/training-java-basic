package examples.Swing.HF;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SimpleGui1TestDrive {
	
	static class SimpleGui1 extends JFrame{
		
		private Container container;
		private JButton btn;
		
		public SimpleGui1() {
			super();
			
			this.setSize(300, 300);
			
			
			// get content pane
			container = this.getContentPane();
			
			// initial component
			btn = new JButton("clicke me");
			
			
			// put components to container
			container.add(btn);
			
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
//			this.setVisible(true);
			
			
		}
		
	}

	public static void main(String[] args) {
		new SimpleGui1().setVisible(true);;
	}

}
