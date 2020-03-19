package examples.AWT;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import org.apache.commons.imaging.*;

public class ex3_WindowEvent1 extends Frame implements WindowListener {
	
	protected int delayTime;

	public ex3_WindowEvent1() throws ImageReadException, IOException {
		super();
		
		Image imgIcon = Imaging.getBufferedImage(new File("./images/favicon.ico")); // use third library to read ico file
		
		this.delayTime = 2;
		
		this.setSize(110,110);
		this.setResizable(true);
//		this.setVisible(true);
		this.setIconImage(imgIcon);
		this.setState(Frame.NORMAL);
		this.setLocation(500,500);
		this.setForeground(Color.blue);
		this.setBackground(Color.black);
		
		// add event listener
		this.addWindowListener(this);
		
		
	}
	
	public static void main(String[] args) throws ImageReadException, IOException {
		
		new ex3_WindowEvent1().setVisible(true); // put the last to update window

	}
	
	public void windowOpened(WindowEvent e) {
		System.out.println("windowOpened");
	}
	
	public void windowClosing(WindowEvent e) {
		System.out.println("windowClosing after " + this.delayTime + " s");
		try {
			Thread.sleep(this.delayTime*1000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		System.exit(0);
	}
	
	public void windowClosed(WindowEvent e) {
		System.out.println("windowClosed");
	}
	
	public void windowIconified(WindowEvent e) {
		System.out.println("windowIconified");
	}
	
	public void windowDeiconified(WindowEvent e) {
		System.out.println("windowDeiconified");
	}
	
	public void windowActivated(WindowEvent e) {
		System.out.println("windowActivated");
	}
	
	public void windowDeactivated(WindowEvent e) {
		System.out.println("windowDeactivated");
	}

}
