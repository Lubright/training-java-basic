package examples.Swing.HF.Component.TextComponent;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class ex1_JTextFieldAndJTextArea {
	
	static class TextComponentDemo extends JFrame{
		private Container container;
		private JPanel panel;
		private JButton btn;
		private JLabel label;
		private JTextField textField;
		private JScrollPane scroller;
		private JTextArea textArea;
		
		public TextComponentDemo() {
			// frame setting
			super();
			this.initialize();
			
			
			// initial component
			panel = new JPanel();
			panel.setBackground(Color.darkGray);
			btn = new JButton("btn1");
			label = new JLabel("label");
			Font font1 = new Font("Serif", Font.ITALIC, 20);
			label.setFont(font1);
			label.setForeground(Color.blue);
			textField = new JTextField(20);
//			textField = new JTextField("default");
			textField.setText("default");
			
			textArea = new JTextArea(20, 20);
			scroller = new JScrollPane(textArea); // make a scrollPane and give it the textArea that is going to scroll for
			textArea.setLineWrap(true);
			scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
			scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
			
			// put components
//			panel.add(BorderLayout.SOUTH, btn);
			panel.add(btn);
			panel.add(label);
			panel.add(textField);
			panel.add(scroller);
			
			container.add(panel);
			
			
			// set visible here
			this.setVisible(true);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			// testField control
			textControl();

			
			
			// event handling
			textField.addActionListener((e)->{
//				System.out.println("textField Content: " + textField.getText());
				textArea.setText(textField.getText());
				textArea.selectAll();
				textArea.requestFocus();
				
			});
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
		
		public void textControl() {
			textField.selectAll();
			textField.requestFocus();
		}
	}

	public static void main(String[] args) {
		new TextComponentDemo();

	}

}
