package examples.AWT;
import java.io.*;
import java.awt.*;
import javax.swing.*;
import org.apache.commons.imaging.*;

public class ex2_GridLayout1 extends Frame {
	
	public ex2_GridLayout1() {
		super();
	}

	public ex2_GridLayout1(int w, int h, int h_margin, int v_margin) throws ImageReadException, IOException {
		super();
		
		Image imgIcon = Imaging.getBufferedImage(new File("./images/favicon.ico")); // use third library to read ico file
		
		this.setSize(110,110);
		this.setResizable(true);
//		this.setVisible(true);
		this.setIconImage(imgIcon);
		this.setState(Frame.NORMAL);
		this.setLocation(500,500);
		this.setForeground(Color.blue);
		this.setBackground(Color.black);
		
		// set layout
		this.setLayout(new GridLayout(w,h,h_margin,v_margin));
		
		// add btns
		for(int i=0; i<w*h; i++) {
			this.add(new Button(Integer.toString(i+1)), i);
		}
		
		
		
	}
	
	public static void main(String[] args) throws ImageReadException, IOException {
		new ex2_GridLayout1(3,3,2,2).setVisible(true); // put the last to update window
	}

}
