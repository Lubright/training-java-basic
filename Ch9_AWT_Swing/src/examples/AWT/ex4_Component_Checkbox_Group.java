package examples.AWT;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import org.apache.commons.imaging.*;


public class ex4_Component_Checkbox_Group extends Frame {
	
	protected double delayTime;
	protected int numOfCheckbox = 5;
	Checkbox[] checkbox_arr = new Checkbox[numOfCheckbox];
	CheckboxGroup group1 = new CheckboxGroup();
	Font font1;
	
	
	public ex4_Component_Checkbox_Group() throws ImageReadException, IOException {
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
		
		// add Checkbox
		for(int i=0; i<numOfCheckbox; i++) {
			checkbox_arr[i] = new Checkbox("checkbox " + i);
			
			checkbox_arr[i].setForeground(Color.white);
			
			checkbox_arr[i].setFont(font1);
			checkbox_arr[i].setSize(100,20);
			checkbox_arr[i].setLocation(45,65+i*20);
			
			this.add(checkbox_arr[i], i);
		}
		checkbox_arr[0].setState(true);
		checkbox_arr[1].setState(true);
		
		// set checkbox group
		checkbox_arr[3].setCheckboxGroup(group1);
		checkbox_arr[4].setCheckboxGroup(group1);
		
		this.addWindowListener(new WindowAdapter() {
			
			public void windowClosing(WindowEvent e) {
				System.out.println(e.getComponent()); // ¦n¥Î
				ex4_Component_Checkbox_Group that = (ex4_Component_Checkbox_Group)e.getComponent();
				
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
		ex4_Component_Checkbox_Group obj1 = new ex4_Component_Checkbox_Group();
		obj1.setVisible(true); // put the last to update window
		obj1.setDelayTime(0.2); // update delay time
	}
	
	public String toString() {
		String result = "";
		
		result += "ex4_Component_Checkbox_Group Class";
		
		return result;
	}

}
