package examples.AWT;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ex1_Frame1 {

	public static void main(String[] args) {
		// 建立視窗實體物件
		Frame frame = new Frame("ex1_Frame1");
		
		// set size
		frame.setSize(640,480);
		
		// set visible
		frame.setVisible(true);
		
		frame.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
		

	}

}
