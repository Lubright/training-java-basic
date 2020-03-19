package examples.AWT;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import org.apache.commons.imaging.*;


public class ex4_Component_TextField extends Frame {
	
	protected double delayTime;
	protected TextField input1 = new TextField("input1");
	protected TextField input2 = new TextField("input2");
	protected TextField input3 = new TextField("input3");
	
	Font font1;
	
	
	public ex4_Component_TextField() throws ImageReadException, IOException {
		super();
		
		Image imgIcon = Imaging.getBufferedImage(new File("./images/favicon.ico")); // use third library to read ico file
		
		this.setDelayTime(2);
		
		this.setSize(800,600);
		this.setLocation(500,500);
		this.setResizable(true);
		
		this.setIconImage(imgIcon);
		this.setState(Frame.NORMAL);
//		this.setForeground(Color.blue);
//		this.setBackground(new Color(64,64,64));
		
		this.setLayout(null);
		
		font1 = new Font("Serif", Font.ITALIC+Font.BOLD, 12);
		
		// add TextField
//		input1.setForeground(Color.blue);
//		input1.setFont(font1);
		input1.setSize(100,20);
		input1.setLocation(45,65);
		
		input2.setForeground(Color.blue);
		input2.setFont(font1);
		input2.setSize(100,20);
		input2.setLocation(45,85);
		
		input3.setForeground(Color.blue);
		input3.setFont(font1);
		input3.setSize(100,20);
		input3.setLocation(45,105);
		
		input1.setEditable(false);
		input3.setEchoChar('*');
		
		this.add(input1, 0);
		this.add(input2, 1);
		this.add(input3, 2);
		
		this.addWindowListener(new WindowAdapter() {
			
			public void windowClosing(WindowEvent e) {
				System.out.println(e.getComponent()); // ¦n¥Î
				ex4_Component_TextField that = (ex4_Component_TextField)e.getComponent();
				
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
	
	public ex4_Component_TextField setDelayTime(double delay) {
		this.delayTime = delay;
		return this;
	}

	public static void main(String[] args) throws ImageReadException, IOException {
		ex4_Component_TextField obj1 = new ex4_Component_TextField();
		obj1.setVisible(true); // put the last to update window
		obj1.setDelayTime(0.2); // update delay time
	}
	
	public String toString() {
		String result = "";
		
		result += "ex4_Component_TextField Class";
		
		return result;
	}

}
