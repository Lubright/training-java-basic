package examples.Event;

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import org.apache.commons.imaging.*;

/**
 * 
 * @author Lubright
 * ItemEvent Demo
 *
 */

public class app_5_ItemEvent extends Frame implements ItemListener {
	
	// components
	private Panel panel;
	private Checkbox checkboxArr[] = new Checkbox[2];
	private CheckboxGroup group1 = new CheckboxGroup();
	private Label label;
	private Font font1;
	
	public app_5_ItemEvent(int w, int h, int h_margin, int v_margin) throws ImageReadException, IOException {
		
		// frame setting
		Image imgIcon = Imaging.getBufferedImage(new File("./images/favicon.ico")); // use third library to read ico file

		this.setSize(800,600);
		this.setLocation(500,500);
		this.setResizable(true);
		this.setIconImage(imgIcon);
		this.setState(Frame.NORMAL);

		// use gridlayout
		this.setLayout(new GridLayout(w,h,h_margin,v_margin));
		
		// define font1
		font1 = new Font("Serif", Font.ITALIC+Font.BOLD, 16);
		this.setFont(font1);
		
		// add components
		panel = new Panel();
		panel.setBackground(Color.gray);
		panel.setLayout(null);
//		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		
		label = new Label("Please select printer", Label.CENTER);
		label.setBackground(new Color(64,64,64));
		label.setForeground(Color.white);
		this.add(label);
		
		checkboxArr[0] = new Checkbox("Epson 5900L", false);
		checkboxArr[1] = new Checkbox("HP LaserJet 4p", false);
		// set checkbox group
		
		int cnt1 = 0;
		for(Checkbox o : checkboxArr) {
			o.setCheckboxGroup(group1);
			o.addItemListener(this); // frame register to checkbox
			o.setBackground(Color.gray);
			o.setSize(100, 40);
			o.setLocation(350, 20+(cnt1)*100);
			o.setFont(font1);
			panel.add(o);
			cnt1++;
		}
		this.add(panel);
//		System.out.println(checkboxArr[0].getSize());
		
		// set window event handler
		this.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
		
	}

	public static void main(String[] args) throws ImageReadException, IOException {
		new app_5_ItemEvent(2,1,5,5).setVisible(true);
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		Checkbox ckb = (Checkbox) e.getSource();
		
		if(ckb.getState()) {
			this.label.setText(ckb.getLabel());
		}
		
	}

}
