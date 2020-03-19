package examples.Event;

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import org.apache.commons.imaging.*;

/**
 * 
 * @author Lubright
 * Simple button event demo
 *
 */

public class app18_2_ActionEvent extends Frame implements ActionListener{
	// component
	Button btn1;
	Font font1;
	boolean bgColorToggle = false;
	
	public app18_2_ActionEvent() throws ImageReadException, IOException {
		Image imgIcon = Imaging.getBufferedImage(new File("./images/favicon.ico")); // use third library to read ico file
		
		this.setSize(800,600);
		this.setLocation(500,500);
		this.setResizable(true);
		this.setIconImage(imgIcon);
		this.setState(Frame.NORMAL);
		
		this.setLayout(null);
		
		// define font1
		font1 = new Font("Serif", Font.ITALIC+Font.BOLD, 12);
		this.setFont(font1);
		
		// define btn
		btn1 = new Button("toggle bgColor");
		btn1.setForeground(Color.blue);
		btn1.setSize(100,40);
		btn1.setLocation(45,65);
		
		// add btn
		this.add(btn1, 0);
		
		// get btn
		Button tempBtn = (Button) this.getComponent(0);
		tempBtn.addActionListener(this);
		
		// set window event handler
		this.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
		
		
	}

	public static void main(String[] args) throws ImageReadException, IOException {
		new app18_2_ActionEvent().setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		System.out.println(e.getSource());
		
		bgColorToggle = !bgColorToggle;
		
		if(bgColorToggle) {
			this.setBackground(new Color(64,64,64));
		}
		else {
			this.setBackground(new Color(255,255,255));
		}
		
	}

}
