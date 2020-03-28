package examples.Swing.HF.Component.TextComponent;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

public class ex2_JTextAreaTestDrive {
	
	static class TextArea1 extends JFrame{
		private Container container;
		private JPanel mainPanel;
		private JButton btn;
		private JButton showBtn;
		private JTextArea textArea;
		private JScrollPane scroller;
		
		public TextArea1() {
			// frame setting
			super();
			initialize();
			
			
			// initial component
			mainPanel = new JPanel();
			mainPanel.setBackground(Color.darkGray);
			btn = new JButton("Just Click It");
			showBtn = new JButton("show");
			textArea = new JTextArea(10, 20);
			textArea.setLineWrap(true);
			scroller = new JScrollPane(textArea);
			scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
			scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
			
			
			// put components
			mainPanel.setLayout(new BorderLayout()); // set layout
			mainPanel.add(BorderLayout.SOUTH, btn);
			mainPanel.add(BorderLayout.CENTER, scroller); // add scrollerPane
			mainPanel.add(BorderLayout.NORTH, showBtn);
			
			container.add(BorderLayout.CENTER, mainPanel);
			
			
			// postExecute
			postExecute();
			
			// event handling
			eventHandling();
		}
		
		public void initialize() {
			// frame setting
			this.setSize(400, 300);
			this.setLocation(500, 500);
			this.setResizable(true);
			this.setTitle(this.getClass().getName());
			this.setState(JFrame.NORMAL);
			
			// get content pane
			container = this.getContentPane();
		}
		
		public void postExecute() {
			// set visible here
			this.setVisible(true);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		
		public void eventHandling() {
			btn.addActionListener((e)->{
				textArea.append("\n");
				textArea.requestFocus(); // get focus immediately
			});
			showBtn.addActionListener((e)->{
				System.out.println(textArea.getText());
			});
		}
	}

	public static void main(String[] args) {
		new TextArea1();

	}

}
