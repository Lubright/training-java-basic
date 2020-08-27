package examples.HF.MIDI_Event;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.sound.midi.ControllerEventListener;
import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Track;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * 1. add register and event handling of the controllerEvent
 * 
 * */

public class MiniMusicPlayer3TestDrive {
	
	static class MiniMusicPlayer extends JFrame{
		
		Container container;
		MyDrawPanel panel;
		
		public MiniMusicPlayer() {
			// frame setting
			super();
			initialGui();
			
			// put components to container
			container.add(BorderLayout.CENTER, panel);
			
			try {
				Sequencer sequencer = MidiSystem.getSequencer();
				sequencer.open();
				
				// register for events with the sequencer
				// The event registration method takes the listener AND an array representing the list of ControllerEvents you want
				// We want only one event, # 127
				int[] eventsIWant = {127};
//				System.out.println("panel: " + panel);
				sequencer.addControllerEventListener(panel,  eventsIWant);
				
				Sequence sequence = new Sequence(Sequence.PPQ, 4);
				Track track = sequence.createTrack();
				
				int r = 0;
				for(int i = 5; i < 60; i+=4) {
					
					r = (int) (Math.random()*50+1);
					track.add(makeEvent(144, 1, r, 100, i));
					
					track.add(makeEvent(176, 1, 127, 0, i)); // #127 event code
					
					track.add(makeEvent(128, 1, r, 100, i + 2));
				} // end loop
				
				sequencer.setSequence(sequence);
				sequencer.setTempoInBPM(120);
				sequencer.start();
				
				
			} catch (MidiUnavailableException | InvalidMidiDataException e) {
				e.printStackTrace();
			}
			
			this.setVisible(true);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		} // end MiniMusicPlayer() constructor
		
		public void initialGui() {
			// frame setting
			this.setSize(400, 300);
			this.setLocation(500,500);
			this.setResizable(true);
			this.setTitle(this.getClass().getName());
			this.setState(JFrame.NORMAL);
			
			
			// get content pane
			container = this.getContentPane();
			
			// initial component
			initialComponent();
		}
		
		public void initialComponent() {
			panel = new MyDrawPanel();
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
		
		
		
		private class MyDrawPanel extends JPanel implements ControllerEventListener{
			
			boolean flagOfMsg = false; // set a flag to false, and we will set it to true only when we get an event

			@Override
			protected void paintComponent(Graphics g) {
				if(flagOfMsg) {
					Graphics2D g2d = (Graphics2D) g;
					
					int red = (int) (Math.random()*250);
					int green = (int) (Math.random()*250);
					int blue = (int) (Math.random()*250);
					
					g.setColor(new Color(red, green, blue));
					
					int height = (int) (Math.random()*120 + 10);
					int width = (int) (Math.random()*120 + 10);
					int x = (int) (Math.random()*40 + 10);
					int y = (int) (Math.random()*40 + 10);
					g.fillRect(x, y, width, height);
					flagOfMsg = false;
					
				} // end if
			} // end paintComponent

			@Override
			public void controlChange(ShortMessage event) {
				flagOfMsg = true;
				repaint();
				
			}
			
		} // end inner MyDrawPanel class



		
	}

	public static void main(String[] args) {
		new MiniMusicPlayer();
	}

}
