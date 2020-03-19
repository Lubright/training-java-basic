package examples.AWT;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import org.apache.commons.imaging.*;


public class ex4_Component_TextArea extends Frame {
	
	protected double delayTime;
	protected TextArea textArea;
	Font font1;
	
	
	public ex4_Component_TextArea() throws ImageReadException, IOException {
		super();
		
		Image imgIcon = Imaging.getBufferedImage(new File("./images/favicon.ico")); // use third library to read ico file
		
		this.setDelayTime(2);
		
		this.setSize(800,600);
		this.setResizable(true);
		
		this.setIconImage(imgIcon);
		this.setState(Frame.NORMAL);
		this.setLocation(500,500);
		this.setForeground(Color.blue);
		this.setBackground(new Color(64,64,64));
		
		this.setLayout(null);
		
		font1 = new Font("Serif", Font.ITALIC+Font.BOLD, 12);
		
		// add TextArea
		textArea = new TextArea("textArea", 8, 14, TextArea.SCROLLBARS_VERTICAL_ONLY);
		textArea.setForeground(Color.black);
		textArea.setFont(font1);
		textArea.setSize(200,200);
		textArea.setLocation(45,65);
		
		this.add(textArea, 0);
		
		this.addWindowListener(new WindowAdapter() {
			
			public void windowClosing(WindowEvent e) {
				System.out.println(e.getComponent()); // ¦n¥Î
				ex4_Component_TextArea that = (ex4_Component_TextArea)e.getComponent();
				
				System.out.println("windowClosing after " + that.delayTime + " s");
				try {
					Thread.sleep((long)(that.delayTime*1000));
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				System.exit(0);
			}
		});
		
		
		
	}
	
	public void setDelayTime(double delay) {
		this.delayTime = delay;
	}

	public static void main(String[] args) throws ImageReadException, IOException {
		ex4_Component_TextArea obj1 = new ex4_Component_TextArea();
		obj1.setVisible(true); // put the last to update window
		obj1.setDelayTime(0.2); // update delay time
	}
	
	public String toString() {
		String result = "";
		
		result += "ex4_Component_TextArea Class";
		
		return result;
	}

}
