package examples.HF.MIDI_Event;

import java.awt.BorderLayout;
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

public class MiniMusicPlayer2TestDrive {
	
	static class MiniMusicPlayer extends JFrame implements ControllerEventListener{
		
		Container container;
		MyDrawPanel panel;
		
		public MiniMusicPlayer() {
			// frame setting
			super();
			initialGui();
			
			try {
				Sequencer sequencer = MidiSystem.getSequencer();
				sequencer.open();
				
				// register for events with the sequencer
				// The event registration method takes the listener AND an array representing the list of ControllerEvents you want
				// We want only one event, # 127
				int[] eventsIWant = {127};
				sequencer.addControllerEventListener(this,  eventsIWant);
				
				Sequence sequence = new Sequence(Sequence.PPQ, 4);
				Track track = sequence.createTrack();
				
				for(int i = 5; i < 60; i+=4) {
					track.add(makeEvent(144, 1, i, 100, i));
					
					track.add(makeEvent(176, 1, 127, 0, i)); // #127 event code
					
					track.add(makeEvent(128, 1, i, 100, i + 2));
				} // end loop
				
				sequencer.setSequence(sequence);
				sequencer.setTempoInBPM(220);
				sequencer.start();
				
				
			} catch (MidiUnavailableException | InvalidMidiDataException e) {
				e.printStackTrace();
			}
			
			

			// put components to container
			container.add(BorderLayout.CENTER, panel);


			// event handling, using lambda


			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		}
		
		public void initialGui() {
			// frame setting
			this.setSize(400, 300);
			this.setLocation(500,500);
			this.setResizable(true);
			this.setTitle(this.getClass().getName());
			this.setState(JFrame.NORMAL);
			this.setVisible(true);
			
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
		
		@Override
		public void controlChange(ShortMessage event) {
			System.out.println("la");
			
		}
		
		
		private class MyDrawPanel extends JPanel implements ControllerEventListener{

			@Override
			protected void paintComponent(Graphics g) {
				Graphics2D g2d = (Graphics2D) g;
				
				
				
			}

			@Override
			public void controlChange(ShortMessage event) {
				
				
			}
			
		}



		
	}

	public static void main(String[] args) {
		new MiniMusicPlayer();
	}

}
