package examples.Swing.HF.Component.TextComponent;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.text.BadLocationException;

/*
 * 1. https://www.geeksforgeeks.org/java-swing-jdialog-examples/
 * 2. https://stackoverflow.com/questions/11260926/how-to-add-components-to-jdialog
 * 3. https://stackoverflow.com/questions/8561491/keep-caret-in-textarea-when-non-editable
 * 4. https://stackoverflow.com/questions/44911930/java-swing-boxlayout-center-doesnt-work
 * 
 * */

public class ex2_JTextAreaTestDrive3 {
	
	static class Model extends JFrame{
		private Container container;
		private JPanel mainPanel;
		private JButton showBtn;
		private JButton searchBtn;
		private JTextArea textArea;
		private JScrollPane scroller;
		private Controller controller;
		private View view;
		
		JPanel panel=new JPanel();
		private JButton searchBtn2;
		private Model that;
		
		public Model() {
			// frame setting
			this.setSize(400, 300);
			this.setLocation(500, 500);
			this.setResizable(true);
			this.setTitle(this.getClass().getName());
			this.setState(JFrame.NORMAL);
			that = this;
			
			
			// get content pane
			container = this.getContentPane();
			
			mainPanel = new JPanel();
			mainPanel.setBackground(Color.darkGray);
			
			showBtn = new JButton("show");
			searchBtn = new JButton("search");
			
			textArea = new JTextArea(10, 20);
			textArea.setEditable(false);
			textArea.setText("ffaaffaa");
			textArea.setLineWrap(true);
			textArea.getCaret().setVisible(true);
			scroller = new JScrollPane(textArea);
			scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
			scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
			
			mainPanel.setLayout(new BorderLayout()); // set layout
			mainPanel.add(BorderLayout.CENTER, scroller); // add scrollerPane
			mainPanel.add(BorderLayout.SOUTH, searchBtn);
			mainPanel.add(BorderLayout.NORTH, showBtn);
			
			container.add(BorderLayout.CENTER, mainPanel);
			
			
			searchBtn2 = new JButton("search");
			panel.setLayout(new FlowLayout());
			JTextField textField = new JTextField(20);
			textField.setFont(new Font("Serif", Font.PLAIN, 14));
			panel.add(textField);
			panel.add(searchBtn2);
			
			// postExecute
			postExecute();
			
			
			controller = new Controller();
			controller.eventHandling();
			
			view = new View();
			
		}
		

		
		public void postExecute() {
			// set visible here
			this.setVisible(true);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		
		
		
		private class Controller{
			String searchText = "";
			JDialog jd;
			
			public void eventHandling() {
				
				showBtn.addActionListener((e)->{
					
					if(jd == null) {
						jd=new JDialog();
	                    GridLayout grid = new GridLayout(3, 1);
	                    grid.setVgap(0);
	                    grid.setHgap(0);
	                    
	                    jd.setLayout(grid);
	                    
						jd.add(panel);
						jd.setTitle("Find");
//						jd.requestFocus();
						// setsize of dialog 
						jd.setSize(200, 100); 
//						System.out.println(that.getLocation());
						jd.setLocation(that.getLocation().x + (that.getWidth() - 200), that.getLocation().y + 30);
						
			            // set visibility of dialog 
						jd.setVisible(true);
						
						jd.addWindowListener(new WindowAdapter() {

							@Override
							public void windowClosing(WindowEvent e) {
								System.out.println("window is closed...");
								jd = null;
							}
							
						});
						
						
					}
					else if(jd.isVisible()) {
						
						jd.requestFocus();
					}
					
					
					
					
//					if(jd!=null && jd.isVisible()) {
//						System.out.println(jd.isVisible());
//						jd.dispatchEvent(new WindowEvent(jd, WindowEvent.WINDOW_CLOSING));
//					}
//					else {
// 
//					}
					

					
				});
				
				searchBtn2.addActionListener((e)->{
					JTextField textField = (JTextField)panel.getComponent(0);
					searchText = textField.getText();
					
					
					
				});
				
				searchBtn.addActionListener((e)->{
					String content = textArea.getText();
					int currentIndex = textArea.getCaretPosition();
					int totalLengh = content.length();
					String currentContent = null;
					
					try {
						currentContent = textArea.getText(currentIndex, totalLengh - currentIndex);
					} catch (BadLocationException e1) {
						e1.printStackTrace();
					}
					
					
//					searchText = "aa";
					int foundIndex = -1;
					
					if( (foundIndex = currentContent.indexOf(searchText)) > 0  ) {
						System.out.println("foundIndex = " + foundIndex);
						textArea.requestFocus(); // need to show the selected text
						textArea.select(currentIndex + foundIndex, currentIndex + foundIndex + searchText.length());
					}
					
					
					
					
//					System.out.println(textArea.getText());
//					System.out.println("current index: " + textArea.getCaretPosition());
//					textArea.setSelectionColor(Color.orange);
//					textArea.requestFocus(); // need to show the selected text
//					textArea.select(textArea.getCaretPosition(), textArea.getText().length());
					
				});
				
				textArea.addFocusListener(new FocusAdapter() {
					@Override
					public void focusGained(FocusEvent e) {
						textArea.getCaret().setVisible(true); // show the caret anyway
					}
				});
			}
		}
		
		private class View{
			
		}
		
	}
	


	public static void main(String[] args) {
		new Model();

	}

}
