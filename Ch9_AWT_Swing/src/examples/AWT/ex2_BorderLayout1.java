package examples.AWT;
import java.io.*;
import java.awt.*;
import javax.swing.*;
import org.apache.commons.imaging.*;

public class ex2_BorderLayout1 extends Frame {
	
	/**
	 * @throws ImageReadException
	 * @throws IOException
	 */
	public ex2_BorderLayout1() throws ImageReadException, IOException {
		
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
		this.setLayout(new BorderLayout());
		
		// set gap
		BorderLayout layout = (BorderLayout)this.getLayout();
		layout.setHgap(2);
		layout.setVgap(2);
		
		// add btns
		this.add(new Button("EAST"), BorderLayout.EAST);
		this.add(new Button("WEST"), BorderLayout.WEST);
		this.add(new Button("SOUTH"), BorderLayout.SOUTH);
		this.add(new Button("NORTH"), BorderLayout.NORTH);
		this.add(new Button("CENTER"), BorderLayout.CENTER);
		
	}

	public static void main(String[] args) throws ImageReadException, IOException {
		
		new ex2_BorderLayout1().setVisible(true); // put the last to update window
		
	}

}
