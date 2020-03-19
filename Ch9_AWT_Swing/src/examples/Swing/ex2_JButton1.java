package examples.Swing;

import java.io.*;
import java.awt.*;
import java.awt.event.*;

import javax.imageio.ImageIO;
import javax.swing.*;
import org.apache.commons.imaging.*;

public class ex2_JButton1 extends JFrame implements ActionListener {

	// components
	private JButton btn;
	private ImageIcon btnDefaultIcon;
	private ImageIcon btnPressedIcon;
	private ImageIcon btnRolloverIcon;
	private Container container;
	
	public ex2_JButton1() throws ImageReadException, IOException {
		// frame setting
		Image image = Imaging.getBufferedImage(new File("./images/favicon.ico")); // use third library to read ico file
		
		this.setSize(800,600);
		this.setLocation(500,500);
		this.setResizable(true);
		this.setIconImage(image);
		this.setState(JFrame.NORMAL);
		
		// set layout
		this.setLayout(new FlowLayout());
		
		// get content pane
		container = this.getContentPane();
		
		// get jpg or png file
		// https://stackoverflow.com/questions/5895829/resizing-image-in-java
		btnDefaultIcon =  new ImageIcon(ImageIO.read(new File("./images/chrome.png")).getScaledInstance(128, 128, Image.SCALE_DEFAULT)); // load jpg file, then resize to 128x128
		btnPressedIcon = new ImageIcon(ImageIO.read(new File("./images/googleg_standard_color_128dp.png")));
		btnRolloverIcon = new ImageIcon(ImageIO.read(new File("./images/google-search-png-12.png")));
		
		// add btn
		btn = new JButton("click me");
		System.out.println("btn.hashCode(): " + btn.hashCode());
		btn.setIcon(btnDefaultIcon);
		btn.setPressedIcon(btnPressedIcon);
		btn.setRolloverIcon(btnRolloverIcon);
		btn.addActionListener(this); // jframe register to btns
		container.add(btn);
		
		
		
		// set window close handler
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) throws ImageReadException, IOException {
		new ex2_JButton1().setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton) e.getSource();
		
		System.out.println("btn.hashCode() in actionPerformed: " + btn.hashCode());
		
		btn.setIcon(btnPressedIcon);
		// set text position
		btn.setHorizontalTextPosition(JButton.CENTER);
		btn.setVerticalTextPosition(JButton.BOTTOM);
		container.setBackground(Color.yellow);
		
	}

}
