package examples.AWT;
import java.awt.*;
import javax.swing.*;
import org.apache.commons.imaging.*;
import java.io.*;

public class ex1_Frame2 {

	public static void main(String[] args) throws ImageReadException, IOException {
		
		Frame frame = new Frame("ex1_Frame2");
//		Image imgIcon = new ImageIcon("./images/advantest-logo.gif").getImage();
		Image imgIcon = Imaging.getBufferedImage(new File("./images/favicon.ico")); // use third library to read ico file
		
		
		// get title
		System.out.println("title: " + frame.getTitle());
		
		frame.setSize(640,480);
		
		// set resizable
		frame.setResizable(true);
		
		// ³]©wª¬ºA
		frame.setState(Frame.NORMAL);
		
		frame.setIconImage(imgIcon);
		
		frame.setLocation(500,500);
		frame.setForeground(Color.blue);
		frame.setBackground(Color.gray);
		
		frame.setVisible(true);
		
		
	}

}
