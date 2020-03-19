package examples.Swing;

import java.io.*;
import java.util.ArrayList;
import java.awt.*;
import java.awt.event.*;

import javax.imageio.ImageIO;
import javax.swing.*;
import org.apache.commons.imaging.*;

public class ex4_JLabel1 extends JFrame implements ActionListener {
	
	// components
	private Container container;
	private JButton nextBtn;
	private JButton prevBtn;
	private JLabel label;
	private ArrayList<ImageIcon> iconList;
	private JPanel div1;
	private JPanel div2;
	private int imageCounter = 0;
	
	public ex4_JLabel1() throws ImageReadException, IOException {
		// frame setting
		Image image = Imaging.getBufferedImage(new File("./images/favicon.ico")); // use third library to read ico file
		
		this.setSize(800,600);
		this.setLocation(500,500);
		this.setResizable(true);
		this.setIconImage(image);
		this.setState(JFrame.NORMAL);
		
		// get content pane
		container = this.getContentPane();
		
		// set layout
		// https://docs.oracle.com/javase/tutorial/uiswing/layout/gridbag.html
		this.setLayout(new GridBagLayout());
		container.setLayout(new GridBagLayout()); // GridBagLayout
		
		// add btns
		div1 = new JPanel();
		div1.setLayout(new GridBagLayout());
		GridBagConstraints contraint = new GridBagConstraints();
		
//		div1.setBackground(Color.blue);
		nextBtn = new JButton("next", new ImageIcon("./images/ex4_JLabel1/right.gif"));
		nextBtn.setHorizontalTextPosition(JButton.LEFT);
		prevBtn = new JButton("prev", new ImageIcon("./images/ex4_JLabel1/left.gif"));
		prevBtn.setHorizontalTextPosition(JButton.RIGHT);
		
		div1.add(prevBtn, contraint);
		div1.add(nextBtn, contraint);
		nextBtn.addActionListener(this);
		prevBtn.addActionListener(this);
		
		// add label
		div2 = new JPanel();
		label = new JLabel();
		
		iconList = new ArrayList<ImageIcon>();
		iconList.add(new ImageIcon("./images/ex4_JLabel1/pic0.jpg", "pic0.jpg"));
		iconList.add(new ImageIcon("./images/ex4_JLabel1/pic1.jpg", "pic1.jpg"));
		iconList.add(new ImageIcon("./images/ex4_JLabel1/pic2.jpg", "pic2.jpg"));
		iconList.add(new ImageIcon("./images/ex4_JLabel1/pic3.jpg", "pic3.jpg"));
		
		label.setIcon(iconList.get(0)); // set default image
		label.setText(iconList.get(0).getDescription());
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.BOTTOM);
		
		div2.setLayout(new GridBagLayout());
		div2.add(label, contraint);
		
		contraint.gridx = 0;
		contraint.gridy = 0;
		container.add(div1, contraint);
		
		contraint.gridx = 0;
		contraint.gridy = 1;
		contraint.ipady = 10;
		container.add(div2, contraint);
		
		
		
		// set window close handler
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) throws ImageReadException, IOException {
		new ex4_JLabel1().setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton) e.getSource();
		
		if(btn == prevBtn) {
			imageCounter--;
		}
		else {
			imageCounter++;
		}
		
		imageCounter = (imageCounter<0)? iconList.size()-1 : imageCounter;
		imageCounter = (imageCounter>(iconList.size()-1))? 0 : imageCounter;
		
		label.setIcon(iconList.get(imageCounter));
		label.setText(iconList.get(imageCounter).getDescription());
		
	}

}
