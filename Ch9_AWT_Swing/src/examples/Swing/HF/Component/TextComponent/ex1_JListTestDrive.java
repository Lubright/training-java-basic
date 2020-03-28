package examples.Swing.HF.Component.TextComponent;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class ex1_JListTestDrive {
	
	static class JList1 extends JFrame{
		private Container container;
		private JPanel mainPanel;
		private FlowLayout flowLayout = new FlowLayout();
		private JList list;
		private String[] listEntries = {
			"Justin",
			"Monica",
			"Irene"
		};
		private JScrollPane scroller;
		
		public JList1() {
			// frame setting
			super();
			initialize();
			
			
			// initial component
			mainPanel = new JPanel();
			mainPanel.setBackground(Color.darkGray);
			mainPanel.setLayout(flowLayout);
			
			list = new JList(listEntries);
			list.setPreferredSize(new Dimension(100, 50)); // effective
//			list.setSize(new Dimension(100, 50)); // control by layout manager
			
			scroller = new JScrollPane(list);
			scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
			scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
			
			// put components
			mainPanel.add(scroller);
			
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
			
		}
		
	}

	public static void main(String[] args) {
		new JList1();

	}

}
