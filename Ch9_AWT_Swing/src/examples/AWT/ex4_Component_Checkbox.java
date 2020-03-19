package examples.AWT;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import org.apache.commons.imaging.*;


public class ex4_Component_Checkbox extends Frame {
	
	protected int delayTime;
	protected int numOfCheckbox = 3;
	Checkbox[] checkbox_arr = new Checkbox[numOfCheckbox];
	Font font1;
	
	
	public ex4_Component_Checkbox() throws ImageReadException, IOException {
		super();
		
		Image imgIcon = Imaging.getBufferedImage(new File("./images/favicon.ico")); // use third library to read ico file
		
		this.setDelayTime(2);
		
		this.setSize(640,480);
		this.setResizable(true);
		
		this.setIconImage(imgIcon);
		this.setState(Frame.NORMAL);
		this.setLocation(500,500);
		this.setForeground(Color.blue);
		this.setBackground(new Color(64,64,64));
		
		this.setLayout(null);
		
		font1 = new Font("Serif", Font.ITALIC+Font.BOLD, 18);
		
		// add Checkbox
		for(int i=0; i<numOfCheckbox; i++) {
			checkbox_arr[i] = new Checkbox("checkbox " + i, true);
			
			checkbox_arr[i].setForeground(Color.white);
			
			checkbox_arr[i].setFont(font1);
			checkbox_arr[i].setSize(100,40);
			checkbox_arr[i].setLocation(45,65+i*40);
			
			this.add(checkbox_arr[i], i);
		}
		checkbox_arr[2].setState(false);

		
		this.addWindowListener(new WindowAdapter() {
			
			public void windowClosing(WindowEvent e) {
				System.out.println(e.getComponent()); // ¦n¥Î
				ex4_Component_Checkbox that = (ex4_Component_Checkbox)e.getComponent();
				
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
	
	public void setDelayTime(int delay) {
		this.delayTime = delay;
	}

	public static void main(String[] args) throws ImageReadException, IOException {
		ex4_Component_Checkbox obj1 = new ex4_Component_Checkbox();
		obj1.setVisible(true); // put the last to update window
		obj1.setDelayTime(1); // update delay time
	}
	
	public String toString() {
		String result = "";
		
		result += "ex4_Component_Checkbox Class";
		
		return result;
	}

}
