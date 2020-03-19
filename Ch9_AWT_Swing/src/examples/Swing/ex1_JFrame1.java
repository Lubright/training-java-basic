package examples.Swing;

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import org.apache.commons.imaging.*;

import examples.Event.app18_4_ActionEvent;



public class ex1_JFrame1 extends JFrame implements ActionListener{

	// components
	private int numOfBtn = 3;
	private JButton btnArr[] = new JButton[numOfBtn];
	private Container container; // store components
	
	public ex1_JFrame1() throws ImageReadException, IOException {
		
		// frame setting
		Image imgIcon = Imaging.getBufferedImage(new File("./images/favicon.ico")); // use third library to read ico file
		
		this.setSize(800,600);
		this.setLocation(500,500);
		this.setResizable(true);
		this.setIconImage(imgIcon);
		this.setState(JFrame.NORMAL);
		
		// set layout
		this.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		// generate container
		container = this.getContentPane();
		
		// add btn
		String btnText[] = {"Yellow", "Green", "Exit"};
		for(int i=0; i<numOfBtn; i++) {
			btnArr[i] = new JButton(btnText[i]);
			btnArr[i].addActionListener(this); // jframe register to btns
			container.add(btnArr[i]);
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
		new ex1_JFrame1().setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton) e.getSource();
		
		
		if(btn == btnArr[0]) {
			container.setBackground(Color.yellow);
		}
		else if(btn == btnArr[1]) {
			container.setBackground(Color.green);
		}
		else if(btn.getText().equals("Exit")) {
			System.exit(0);
		}
		
	}

}
