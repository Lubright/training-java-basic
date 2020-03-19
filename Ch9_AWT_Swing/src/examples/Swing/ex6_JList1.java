package examples.Swing;

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.border.TitledBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;

import org.apache.commons.imaging.*;

import examples.Event.app18_4_ActionEvent;

public class ex6_JList1 extends JFrame implements ListSelectionListener, ActionListener{
	
	// components
	private Container container;
	private JButton btn;
	private boolean isToggle = true; // default true, show the scroll pane
	private JScrollPane scrollPane;
	private JList<String> jList;
	private GridBagConstraints constraint;
	private JLabel label;
	private static enum ex6_JList1_Color{
		red, blue, green;
		
		// self defined int to ex6_JList1_Color
		public static ex6_JList1_Color toEx6_JList1_Color(int v) {
			switch(v) {
			case 0:
				return red;
			case 1:
				return blue;
			case 2:
				return green;
			default:
				break;
			}
			
			return null;
		}
	}
	
	public ex6_JList1() throws ImageReadException, IOException {
		// frame setting
		Image imgIcon = Imaging.getBufferedImage(new File("./images/favicon.ico")); // use third library to read ico file
		Color bgColor = new Color(64, 64, 64);
		
		this.setSize(800,600);
		this.setLocation(500,500);
		this.setResizable(true);
		this.setIconImage(imgIcon);
		this.setTitle("ex5_Checkbox1");
		this.setState(JFrame.NORMAL);
		
		
		// get content pane
		container = this.getContentPane();
		container.setLayout(new GridBagLayout()); // set container layout
		
		// initial constraint
		constraint = new GridBagConstraints();
		
		// add btn
		btn = new JButton("Get Colors");
		btn.setPreferredSize(new Dimension(140, 40)); // real set size
//		btn.setSize(140, 40); // using specific layout, so no use here
		btn.addActionListener(this);
		

		
		// add jList
		String data[] = {"red", "blue", "green"};
		jList = new JList<String>();
		jList.setListData(data);
		jList.addListSelectionListener(this);
		
		// add scrollPane
		scrollPane = new JScrollPane(jList); // put view to scroll pane
		scrollPane.setPreferredSize(new Dimension(300, 300));
		// scrollPane.add(jList); // no work

		// add label
		label = new JLabel();
		label.setText("Select the color");
		label.setForeground(Color.lightGray);
		
		// put components to container
		constraint.gridx = 0;
		constraint.gridy = 2;
		constraint.gridwidth = 1;
		constraint.gridheight = 1;
		container.add(btn, constraint);
		
		constraint.gridx = 0;
		constraint.gridy = 1;
		constraint.gridwidth = 1;
		constraint.gridheight = 1;
		container.add(scrollPane, constraint);
		
		constraint.gridx = 0;
		constraint.gridy = 0;
		constraint.gridwidth = 1;
		constraint.gridheight = 1;
		container.add(label, constraint);
		
		
		// set window close handler
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

	public static void main(String[] args) throws ImageReadException, IOException {
		new ex6_JList1().setVisible(true);

	}
	
	// ----- common setting function begin -----
	public void setBackgroundColor(Color color, Component ...components) {
		// set components backgroundColor
		for(Component component : components) {
			component.setBackground(color);
		}
	}
	public void setForegroundColor(Color color, Component ...components) {
		// set components foregroundColor
		for(Component component : components) {
			component.setForeground(color);
		}
	}
	// ----- common setting function end -----

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton) e.getSource();
		isToggle = !isToggle;
		
		scrollPane.setVisible(isToggle);
		
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		label.setForeground(Color.black);
		
		@SuppressWarnings("unchecked")
		JList<String> jList = (JList<String>) e.getSource();
		
		label.setText(jList.getSelectedValue().toString());
		
		ex6_JList1_Color selectColor = ex6_JList1_Color.toEx6_JList1_Color(jList.getSelectedIndex());
		switch(selectColor) {
		case red:
			container.setBackground(Color.red);
			break;
		case blue:
			container.setBackground(Color.blue);
			break;
		case green:
			container.setBackground(Color.green);
			break;
		default:
			break;
		}		
		
	}

}
