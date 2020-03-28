package examples.Swing.HF.Component.TextComponent;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ex1_JCheckBoxTestDrive {
	
	static class JCheckBox1 extends JFrame{
		private Container container;
		private JPanel mainPanel;
		private BoxLayout boxLayout;
		private List<JCheckBox> checkBoxList = new ArrayList<>();
		private int numOfCheckBox = 3;
		private String[] checkBoxContent = {"item1", "item2", "item3"};
		
		public JCheckBox1() {
			// frame setting
			super();
			initialize();
			
			
			// initial component
			mainPanel = new JPanel();
			mainPanel.setBackground(Color.darkGray);
			boxLayout = new BoxLayout(mainPanel, BoxLayout.Y_AXIS); // vertical alignment
			mainPanel.setLayout(boxLayout);
			
			// create checkBox
			for(int i = 0; i < numOfCheckBox; i++) {
				checkBoxList.add( new JCheckBox(checkBoxContent[i], false) );
			}
			
			
			
			// put components
			mainPanel.add(Box.createRigidArea(new Dimension(5, 5))); // margin
			for(int i = 0; i < numOfCheckBox; i++) {
				mainPanel.add( checkBoxList.get(i) );
				checkBoxList.get(i).setAlignmentX(Component.CENTER_ALIGNMENT);
			}
			
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
			container.add(mainPanel);
			
			// set visible here
			this.setVisible(true);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		
		public void eventHandling() {
			for(JCheckBox checkBox : checkBoxList) {
				checkBox.addItemListener((e)->{
					boolean checked = false;
					
					if(checkBox.isSelected()) {
						checked = true;
					}
					else {
						checked = false;
					}
					
					System.out.println(checkBox.getText() + ": " + checked);
					
				});
			}
		}
		
	}

	public static void main(String[] args) {
		new JCheckBox1();

	}

}
