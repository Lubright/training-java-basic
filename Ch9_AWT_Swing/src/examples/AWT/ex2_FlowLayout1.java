package examples.AWT;
import java.io.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;
import org.apache.commons.imaging.*;

public class ex2_FlowLayout1 extends Frame {
	
	public ex2_FlowLayout1() throws ImageReadException, IOException {
		
		Image imgIcon = Imaging.getBufferedImage(new File("./images/favicon.ico")); // use third library to read ico file
		
		// set size
		this.setSize(110,110);
		
		// set layout
		this.setLayout(new FlowLayout());
		
		// add buttons
		this.add(new Button("btn1"));
		this.add(new Button("btn2"));
		this.add(new Button("btn3"));
		this.add(new Button("btn4"));
		this.add(new Button("btn5"));
		
		this.setResizable(true);
		this.setIconImage(imgIcon);
		this.setState(Frame.NORMAL);
		this.setLocation(500,500);
		this.setForeground(Color.blue);
		this.setBackground(Color.gray);
		
		// set visible
		this.setVisible(true);
		
		this.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
		
	}

	public static void main(String[] args) throws ImageReadException, IOException {
		
		new ex2_FlowLayout1();

	}

}
