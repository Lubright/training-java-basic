package examples.Swing.HF;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Track;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ex1_BeatBoxTestDrive3 {
	
	static class BeatBox extends JFrame{
		private Container container;
		private JPanel mainPanel;
		private JPanel backgroundPanel;
		private BorderLayout borderLayout;
		List<JCheckBox> checkBoxList = new ArrayList<>();
		Sequencer sequencer;
		Sequence sequence;
		Track track;
		
		String[] instrumentNames = {
				"Bass Drum",
				"Closed Hi-Hat",
				"Open Hi-Hat",
				"Acoutic Snare",
				"Crash Cymbal",
				"Hand Clap",
				"High Tom",
				"Hi Bongo",
				"Maracas",
				"Whistle",
				"Low Conga",
				"Cowbell",
				"Vibraslap",
				"Low-mid Tom",
				"High Agogo",
				"Open Hi Conga"
		};
		int[] instruments = {35, 42, 46, 38, 49, 39, 50, 60, 70, 72, 64, 56, 58, 47, 67, 63};
		Box buttonBox;
		JButton start;
		JButton stop;
		JButton upTemp;
		JButton downTemp;
		
		JPanel nameBox;
		
		public BeatBox() {
			// frame setting
			super();
			initialize();
			
			// initial component
			backgroundPanel = new JPanel();
			backgroundPanel.setBackground(Color.darkGray);
			borderLayout = new BorderLayout();
			borderLayout.setHgap(10); // padding
			borderLayout.setVgap(10); // padding
			backgroundPanel.setLayout(borderLayout);
			backgroundPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // margin to Frame
			
			buttonBox = new Box(BoxLayout.Y_AXIS);
			start = new JButton("Start");
			stop = new JButton("Stop");
			upTemp = new JButton("Tempo Up");
			downTemp = new JButton("Tempo down");
			
			GridLayout grid2 = new GridLayout(16, 1);
			grid2.setVgap(1);
			grid2.setHgap(2);
			nameBox = new JPanel(grid2);
			for(int i = 0; i < instruments.length; i++) {
				nameBox.add( new JLabel(instrumentNames[i]) );
			}
			Arrays.stream(nameBox.getComponents()).forEach((label)->{
				Font font = new Font("Serif", Font.PLAIN, 12);
				label.setFont(font);
//				label.setForeground(Color.white);
				label.setPreferredSize(new Dimension(100, 34));
			});
			
			// put components
			buttonBox.add(start);
			buttonBox.add(stop);
			buttonBox.add(upTemp);
			buttonBox.add(downTemp);
			
			backgroundPanel.add(BorderLayout.EAST, buttonBox);
			backgroundPanel.add(BorderLayout.WEST, nameBox);
			
			
			GridLayout grid = new GridLayout(16, 16);
			grid.setVgap(1);
			grid.setHgap(2);
			mainPanel = new JPanel(grid);
//			mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
			backgroundPanel.add(BorderLayout.CENTER, mainPanel);
			
			for(int i = 0; i < 256; i++) {
				JCheckBox checkBoxTemp = new JCheckBox();
				
//				if(i%16 == 0) {
//					checkBoxTemp.setText(instrumentNames[i/16]);
//				}
				
				checkBoxTemp.setSelected(false);
				checkBoxList.add(checkBoxTemp);
				mainPanel.add(checkBoxTemp);
				
			} // end loop
			
			// setUpMini
			setUpMini();
			
			// postExecute
			postExecute();
			
			
			// event handling
			eventHandling();
		}
		
		public void initialize() {
			System.out.println("sizeOfInstrument = " + instruments.length);
			
			// frame setting
			this.setSize(800, 600);
			this.setLocation(500, 500);
//			this.pack();
			this.setResizable(false);
			this.setTitle(this.getClass().getName());
			this.setState(JFrame.NORMAL);
			
			// get content pane
			container = this.getContentPane();
		}
		
		public void setUpMini() {
			try {
				sequencer = MidiSystem.getSequencer();
				sequencer.open();
				sequence = new Sequence(Sequence.PPQ, 4);
				track = sequence.createTrack();
				sequencer.setTempoInBPM(120);
				
			} catch (MidiUnavailableException | InvalidMidiDataException e) {
				e.printStackTrace();
			}
		}
		
		public void postExecute() {
			container.add(backgroundPanel);
			
			// set visible here
			this.setVisible(true);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		
		public void buildTrackAndStart() {
			int[] trackList = null;
			
			// get rid of the old track, make a fresh one
			sequence.deleteTrack(track);
			track = sequence.createTrack();
			
			for(int i = 0; i < instruments.length; i++) {
				trackList = new int[16];
				
				int key = instruments[i];
				
				for(int j = 0; j < 16; j++) {
					JCheckBox tempCheckBox = checkBoxList.get(j+16*i);
					if(tempCheckBox.isSelected()) {
						trackList[j] = key;
					}
					else {
						trackList[j] = 0;
					}
				} // close inner loop
				
				makeTracks(trackList);
				track.add(makeEvent(176, 1, 127, 0, 16));
				
			} // close loop
			
			track.add(makeEvent(192, 9, 1, 0, 15));
			try {
				sequencer.setSequence(sequence); 
				sequencer.setLoopCount(sequencer.LOOP_CONTINUOUSLY);                   
				sequencer.start();
				sequencer.setTempoInBPM(120);
			} catch(Exception e) {e.printStackTrace();}
		}
		
		public void eventHandling() {
			start.addActionListener((e)->{
				buildTrackAndStart();
			});
			stop.addActionListener((e)->{
				sequencer.stop();
			});
			upTemp.addActionListener((e)->{
				float tempoFactor = sequencer.getTempoFactor();
				System.out.println("tempoFactor@upTemp = " + tempoFactor);
				sequencer.setTempoFactor( (float) (tempoFactor * 1.03));
			});
			downTemp.addActionListener((e)->{
				float tempoFactor = sequencer.getTempoFactor();
				System.out.println("tempoFactor@downTemp = " + tempoFactor);
				sequencer.setTempoFactor( (float) (tempoFactor * 0.97));
			});
		}
		
		public void makeTracks(int[] list) {
			for(int i = 0; i < instruments.length; i++) {
				int key = list[i];
				
				if(key!=0) {
					track.add(makeEvent(144, 9, key, 100, i));
					track.add(makeEvent(128, 9, key, 100, i+1));
				}
			}
		}
		
		public MidiEvent makeEvent(int comd, int chan, int one, int two, int tick) {
			MidiEvent event = null;
			
			
			try {
				ShortMessage shortMessage = new ShortMessage();
				shortMessage.setMessage(comd, chan, one, two);
				event = new MidiEvent(shortMessage, tick);
			} catch (InvalidMidiDataException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			return event;
		}
		
	}

	public static void main(String[] args) {
		new BeatBox();

	}

}
