package examples.Swing.HF;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SimpleGui2TestDrive {
	
	static class SimpleGui1 extends JFrame implements ActionListener{
		
		private Container container;
		private JButton btn;
		
		public SimpleGui1() {
			super();
			
			this.setSize(300, 300);
			
			
			// get content pane
			container = this.getContentPane();
			
			// initial component
			btn = new JButton("clicke me");
			btn.addActionListener(this);
			
			
			// put components to container
			container.add(btn);
			
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
//			this.setVisible(true);
			
			
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton btn = (JButton) e.getSource();
			
			btn.setText("I've been clicked!");
			
		}
		
		
		
	}

	public static void main(String[] args) {
		new SimpleGui1().setVisible(true);;
	}

}
