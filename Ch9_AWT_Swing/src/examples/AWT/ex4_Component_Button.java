package examples.AWT;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import org.apache.commons.imaging.*;


public class ex4_Component_Button extends Frame {
	
	protected int delayTime;
	Button btn1;
	Font font1;
	
	public ex4_Component_Button() throws ImageReadException, IOException {
		super();
		
		Image imgIcon = Imaging.getBufferedImage(new File("./images/favicon.ico")); // use third library to read ico file
		
		this.delayTime = 2;
		
		this.setSize(640,480);
		this.setResizable(true);
		
		this.setIconImage(imgIcon);
		this.setState(Frame.NORMAL);
		this.setLocation(500,500);
		this.setForeground(Color.blue);
		this.setBackground(new Color(64,64,64));
		
		this.setLayout(null);
		
		// add Button
		this.add(new Button("btn1"), 0); // set label index
		
		// get button from index
		btn1 = (Button)this.getComponent(0);
		btn1.setForeground(Color.blue);
		font1 = new Font("Serif", Font.ITALIC+Font.BOLD, 18);
		btn1.setFont(font1);
		btn1.setSize(100,40);
		btn1.setLocation(45,65);
		
		this.addWindowListener(new WindowAdapter() {
			
			public void windowClosing(WindowEvent e) {
				System.out.println(e.getComponent()); // ¦n¥Î
				ex4_Component_Button that = (ex4_Component_Button)e.getComponent();
				
				System.out.println("windowClosing after " + that.delayTime + " s");
				try {
					Thread.sleep(that.delayTime*1000);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				System.exit(0);
			}
		});
		
		
		
	}

	public static void main(String[] args) throws ImageReadException, IOException {
		new ex4_Component_Button().setVisible(true); // put the last to update window
	}

	public String toString() {
		String result = "";
		
		result += "ex4_Component_Button Class";
		
		return result;
	}
	
	
}
