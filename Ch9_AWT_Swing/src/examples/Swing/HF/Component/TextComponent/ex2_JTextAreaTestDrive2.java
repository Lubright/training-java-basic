package examples.Swing.HF.Component.TextComponent;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

public class ex2_JTextAreaTestDrive2 {
	
	static class UIConsole extends JFrame {

	    private Container container;
	    private JPanel mainPanel;
	    private JTextArea textArea;
	    private JScrollPane scroller;
	    private JMenuBar menuBar;
	    private JMenu fileMenu;
	    private JMenu helpMenu;
	    private JMenuItem saveItem, aboutItem, m3;
	    
		public static String hr(char c, int n)
	    {
	        StringBuffer content = new StringBuffer();
	        for(int i=0; i<n; i++)
	        {
	            content.append(c);
	        }
	        return content.toString();
	    }

		public static void print_hr(char c, int n)
	    {
	        for(int i=0; i<n; i++)
	        {
	            System.out.print(c);
	        }
	        System.out.println();
	    }
	    
	    
		private static void dumpToFile(InputStream src, OutputStream dest) throws IOException {
			int bufferSize = 1024;
			
			try(InputStream is = src;
					OutputStream os = dest){
				
				byte[] data = new byte[bufferSize];
				int lenOfData;
				
				while( (lenOfData = is.read(data)) != -1 ) { // readData
					os.write(data, 0, lenOfData); // writeData
				}
				
			}
			
		}

	    public UIConsole() {
	        // frame setting
	        super();
	        initialize();


	        // initial component
	        mainPanel = new JPanel();
	        mainPanel.setBackground(Color.darkGray);
	        textArea = new JTextArea(10, 20);
	        textArea.setLineWrap(true);
	        textArea.setEditable(false);
	        scroller = new JScrollPane(textArea);
	        scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
	        scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

	        textArea.setText(hr('-', 50) + " Welcome using UIConsole v1.0.0 " + hr('-', 50) + "\n");

	        menuBar = new JMenuBar();
	        fileMenu = new JMenu("File");
	        helpMenu = new JMenu("Help");
	        

	        
	        // create menuitems
	        saveItem = new JMenuItem("Save As...");
	        aboutItem = new JMenuItem("About UIConsole");
	        m3 = new JMenuItem("MenuItem3");

	        fileMenu.add(saveItem);
	        helpMenu.add(aboutItem);
	        
	        menuBar.add(fileMenu);
	        menuBar.add(helpMenu);




	        // put components
	        mainPanel.setLayout(new BorderLayout()); // set layout
	        mainPanel.add(BorderLayout.CENTER, scroller); // add scrollerPane

	        container.add(BorderLayout.CENTER, mainPanel);
	        this.setJMenuBar(menuBar);

	        // postExecute
	        postExecute();

	        // event handling
	        eventHandling();
	    }

	    public void initialize() {
	    	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	    	int w = 800;
	    	int h = 1000;
	    	
	        // frame setting
	        this.setSize(w, h);
	        this.setLocation((int) (screenSize.getWidth() - w), (int) (screenSize.getHeight() - h));
	        this.setResizable(true);
//	        this.setTitle(this.getClass().getName());
	        this.setTitle("UIConsole");
	        this.setState(JFrame.NORMAL);

	        // get content pane
	        container = this.getContentPane();
	    }

	    public void postExecute() {
	        // set visible here
	        this.setVisible(true);
	        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    }

	    public void eventHandling() {
	    	saveItem.addActionListener((e)->{
	    		JFileChooser fileChooser = new JFileChooser();
	            int option = fileChooser.showSaveDialog(this);
	            if(option == JFileChooser.APPROVE_OPTION){
	               File file = fileChooser.getSelectedFile();
	               
	               try {
					FileOutputStream fos = new FileOutputStream(file, false);
					if(file.exists()) {
						int n = JOptionPane.showConfirmDialog(
	                            this, file.getName() + " already exists. Do you want to overwrite it? ",
	                            "Question",
	                            JOptionPane.YES_NO_OPTION);
	                    if (n == JOptionPane.YES_OPTION) {
	                    	dumpToFile(new ByteArrayInputStream(this.textArea.getText().getBytes("UTF-8")), fos);
	                    } else if (n == JOptionPane.NO_OPTION) {
	                    	
	                    } else {
	                        
	                    }
					}
					
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	            }else{
	            	
	            }
	    	});
	    	
	    	aboutItem.addActionListener((e)->{
	    		JOptionPane.showMessageDialog(this,
                        "UIConsole v1.0.0", "UIConsole v1.0.0", JOptionPane.DEFAULT_OPTION);
	    	});
	    	
	    }

	    public void setText(String message) {
	        textArea.append("\n" + message);
	    }


	}

	public static void main(String[] args) {
		new UIConsole();

	}

}
