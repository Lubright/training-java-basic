package examples.Swing.HF.Layout.FlowLayout;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class ex1_PanelFlowLayout {

	static class Panel1 extends JFrame{
		private Container container;
		private JPanel panel;
		private JButton btn1, btn2, btn3;
		
		public Panel1() {
			// frame setting
			super();
			this.initialize();
			
			// initial component
			panel = new JPanel();
			panel.setBackground(Color.darkGray);
			
			btn1 = new JButton("shock me");
			btn2 = new JButton("bliss");
			btn3 = new JButton("btn3");
			panel.add(btn1);
			panel.add(btn2);
			panel.add(btn3);
			
			// put components to container
			this.add(BorderLayout.EAST, panel);
			
			
		}
		
		public void initialize() {
			// frame setting
			this.setSize(400, 300);
			this.setLocation(500, 500);
			this.setResizable(true);
			this.setTitle(this.getClass().getName());
			this.setState(JFrame.NORMAL);
			this.setVisible(true);
			
			// get content pane
			container = this.getContentPane();
			
			
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		new Panel1();

	}

}
