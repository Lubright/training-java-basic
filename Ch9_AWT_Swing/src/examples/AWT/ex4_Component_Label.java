package examples.AWT;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import org.apache.commons.imaging.*;


public class ex4_Component_Label extends Frame {
	
	protected int delayTime;
	Label label1;
	Font font1;
	
	public ex4_Component_Label() throws ImageReadException, IOException {
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
		this.setBackground(new Color(64,64,64));
		
		this.setLayout(new BorderLayout());
		
		// add Label
		this.add(new Label("label1", Label.CENTER), BorderLayout.CENTER, 0); // set label index
		
		// get label from index
		((Label)this.getComponent(0)).setText("update label1");
		label1 = (Label)this.getComponent(0);
		label1.setForeground(Color.white);
		font1 = new Font("Serif", Font.ITALIC+Font.BOLD, 18);
		label1.setFont(font1);
		
		
		this.addWindowListener(new WindowAdapter() {
			
			public void windowClosing(WindowEvent e) {
				System.out.println(e.getComponent()); // ¦n¥Î
				ex4_Component_Label that = (ex4_Component_Label)e.getComponent();
				
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
		new ex4_Component_Label().setVisible(true); // put the last to update window
	}

	public String toString() {
		String result = "";
		
		result += "ex4_Component_Label Class";
		
		return result;
	}
	
	
}
