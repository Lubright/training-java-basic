package examples.Swing;

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;

import org.apache.commons.imaging.*;

import examples.Event.app18_4_ActionEvent;


public class ex5_Checkbox1 extends JFrame implements ItemListener {
	
	// components
	private Container container;
	private JRadioButton radio1;
	private JRadioButton radio2;
	private JCheckBox checkBox1;
	private JCheckBox checkBox2;
	private JCheckBox checkBox3;
	private ButtonGroup group;
	private JPanel div1;
	private JPanel div2;
	
	public ex5_Checkbox1() throws ImageReadException, IOException {
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
		
		// set layout
		this.setLayout(new GridBagLayout());
		container.setLayout(new GridBagLayout());
		
		GridBagConstraints constraint = new GridBagConstraints();
		
		// initial panel
		div1 = new JPanel();
		div2 = new JPanel();
//		div1.setLayout(new GridBagLayout());
//		div2.setLayout(new GridBagLayout());
		div1.setLayout(null);
		div2.setLayout(null);
		div1.setPreferredSize(new Dimension(300, 150));
		div2.setPreferredSize(new Dimension(300, 150));
		
		// set titleBorder
		Border titledBorder = BorderFactory.createTitledBorder("radioGroup");
		((TitledBorder)titledBorder).setTitleColor(Color.blue);
		
		div1.setBorder(new TitledBorder("Panel size 300, 300"));
		div2.setBorder(BorderFactory.createTitledBorder("checkBoxGroup"));
		
		// initial ButtonGroup
		group = new ButtonGroup();
		
		// add checkbox
		radio1 = new JRadioButton("數位攝影機");
		radio2 = new JRadioButton("數位相機");
		group.add(radio1);
		group.add(radio2);
		
		checkBox1 = new JCheckBox("Sony", true);
		checkBox2 = new JCheckBox("Nikon", true);
		checkBox3 = new JCheckBox("Others", false);
		
		
		radio1.setSize(90,20);
		radio2.setSize(90,20);
		checkBox1.setSize(140, 20);
		checkBox2.setSize(140, 20);
		checkBox3.setSize(140, 20);
		
		radio1.setLocation(10, 20);
		radio2.setLocation(10+90+10, 20);
		checkBox1.setLocation(20, 20);
		checkBox2.setLocation(20, 20+20+10);
		checkBox3.setLocation(20, 20+20*2+10);
		
		
		div1.add(radio1);
		div1.add(radio2);
		div2.add(checkBox1);
		div2.add(checkBox2);
		div2.add(checkBox3);

		Color fgColor = new Color(255, 255, 255);
		
		// set all components backgroundColor
		this.setBackgroundColor(bgColor, this, container, 
								radio1, radio2, checkBox1, checkBox2,
								checkBox3);
		
		// set all components foregroundColor
		this.setForegroundColor(fgColor, radio1, radio2, checkBox1, 
								checkBox2, checkBox3);
		
		// set panel
		constraint.gridx = 0;
		constraint.gridy = 0;
		constraint.gridwidth = 1;
		constraint.gridheight = 1;
		container.add(div1, constraint); // add panel
		
//		GridBagConstraints contraint2 = new GridBagConstraints();
		constraint.gridx = 0;
		constraint.gridy = 1;
		constraint.gridwidth = 1;
		constraint.gridheight = 1;
		constraint.insets = new Insets(10,0,10,0); // set margin
		container.add(div2, constraint); // add panel
		
		// set window close handler
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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

	public static void main(String[] args) throws ImageReadException, IOException {
		new ex5_Checkbox1().setVisible(true);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		
	}

}
