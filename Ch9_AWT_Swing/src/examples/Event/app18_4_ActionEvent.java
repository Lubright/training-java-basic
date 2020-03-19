package examples.Event;

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import org.apache.commons.imaging.*;


/**
 * 
 * @author Lubright
 * add more button demo
 *
 */

public class app18_4_ActionEvent extends Frame implements ActionListener {
	// components
	private int numOfBtn = 3;
	private Button btnArr[] = new Button[numOfBtn];
	Font font1;
	
	public app18_4_ActionEvent() throws ImageReadException, IOException {
		
		// frame setting
		Image imgIcon = Imaging.getBufferedImage(new File("./images/favicon.ico")); // use third library to read ico file
		
		this.setSize(800,600);
		this.setLocation(500,500);
		this.setResizable(true);
		this.setIconImage(imgIcon);
		this.setState(Frame.NORMAL);
		
		this.setLayout(new FlowLayout());
		
		// define font1
		font1 = new Font("Serif", Font.ITALIC+Font.BOLD, 12);
		this.setFont(font1);
		
		// add btns
		String btnText[] = {"Yellow", "Green", "Exit"};
		for(int i=0; i<numOfBtn; i++) {
			btnArr[i] = new Button(btnText[i]);
			btnArr[i].setSize(100, 40);
			btnArr[i].addActionListener(this); // frame register to btns
			this.add(btnArr[i], i);
		}
		
		// set window event handler
		this.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
		
	}

	public static void main(String[] args) throws ImageReadException, IOException {
		new app18_4_ActionEvent().setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Button btn = (Button) e.getSource();
		
//		System.out.println(btn);
		
		if(btn.getLabel().equals("Yellow")) {
			this.setBackground(Color.yellow);
		}
		else if(btn.getLabel().equals("Green")) {
			this.setBackground(Color.green);
		}
		else if(btn == btnArr[2]) {
			System.exit(0);
		}
		
		
	}

}
