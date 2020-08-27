package examples.Event;

import java.io.*;
import java.awt.*;
import java.awt.event.*;

import javax.sound.midi.ControllerEventListener;
import javax.sound.midi.ShortMessage;
import javax.swing.*;
import org.apache.commons.imaging.*;


/**
 * 
 * @author Lubright
 * TextEvent Demo
 *
 */

public class ex1_KeyEvent extends JFrame {

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
			textArea.addKeyListener(new KeyAdapter() {

				@Override
				public void keyPressed(KeyEvent e) {
					if ((e.getKeyCode() == KeyEvent.VK_F) && ((e.getModifiers() & KeyEvent.CTRL_MASK) != 0)) {
						System.out.println("ctrl+F");
					}
				}
				
			});
		}
	}
	
	public static void main(String[] args) throws ImageReadException, IOException {
		new TextArea1();

	}


}
