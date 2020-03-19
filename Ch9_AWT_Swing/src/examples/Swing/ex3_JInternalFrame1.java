package examples.Swing;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.awt.*;
import java.awt.event.*;

import javax.imageio.ImageIO;
import javax.swing.*;
import org.apache.commons.imaging.*;

public class ex3_JInternalFrame1 extends JFrame implements ActionListener {
	
	// components
	private Container container;
	private JDesktopPane desktop;
	private JButton btn;
	private LinkedList<JInternalFrame> subFrames = new LinkedList<JInternalFrame>();
	private static int cnt1;
	
	public ex3_JInternalFrame1() throws ImageReadException, IOException {
		// frame setting
		Image image = Imaging.getBufferedImage(new File("./images/favicon.ico")); // use third library to read ico file
		
		this.setSize(800,600);
		this.setLocation(500,500);
		this.setResizable(true);
		this.setIconImage(image);
		this.setState(JFrame.NORMAL);
		
		// set layout
		this.setLayout(new BorderLayout());;
		
		// get content pane
		container = this.getContentPane();
		
		// add desktop
		desktop = new JDesktopPane();
		container.add(desktop);
		
		// add btn
		btn = new JButton("New Frame");
		container.add(btn, BorderLayout.SOUTH, 0);
		btn.addActionListener(this);
		
		// set window close handler
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) throws ImageReadException, IOException {
		new ex3_JInternalFrame1().setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// generate JInternalFrame
		JInternalFrame tempFrame = new JInternalFrame("subFrame"+cnt1, true, true, true, true);
		subFrames.add(tempFrame); // put to List
		JButton tempBtn = new JButton("btn");
		Container tempContainer = tempFrame.getContentPane();
		tempContainer.add(tempBtn, BorderLayout.SOUTH);
		desktop.add(tempFrame);
		subFrames.getLast().setSize(200, 150);
		tempFrame.setLocation(100*cnt1, 100*cnt1);
		tempFrame.setVisible(true);
		cnt1++;
	}

}
