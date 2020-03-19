package examples.Event;

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import org.apache.commons.imaging.*;

/**
 * 
 * @author Lubright
 * TextEvent Demo
 *
 */

public class app18_6_TextEvent extends Frame implements TextListener {

	// components
	private Font font1;
	private TextArea txa1;
	private TextArea txa2;
	
	public app18_6_TextEvent() throws ImageReadException, IOException {
		
		// frame setting
		Image imgIcon = Imaging.getBufferedImage(new File("./images/favicon.ico")); // use third library to read ico file

		this.setSize(800,600);
		this.setLocation(500,500);
		this.setResizable(true);
		this.setIconImage(imgIcon);
		this.setState(Frame.NORMAL);
		
		// set layout
		this.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		// define font1
//		font1 = new Font("Serif", Font.ITALIC+Font.BOLD, 16);
//		this.setFont(font1);
		
		// add components
		txa1 = new TextArea("", 6, 10, TextArea.SCROLLBARS_NONE);
		txa2 = new TextArea("", 6, 10, TextArea.SCROLLBARS_NONE);
		
		this.add(txa1);
		this.add(txa2);
		txa1.addTextListener(this);
		txa2.addTextListener(this);
		txa2.setEditable(false);
		
		// set window event handler
		this.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
	}
	
	public static void main(String[] args) throws ImageReadException, IOException {
		new app18_6_TextEvent().setVisible(true);

	}

	@Override
	public void textValueChanged(TextEvent e) {
		try {
			Thread.sleep(20);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		txa2.setText(txa1.getText());
		
	}

}
