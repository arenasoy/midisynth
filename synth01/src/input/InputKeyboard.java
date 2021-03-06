package input;

import java.util.List;

import javax.sound.midi.MidiDevice;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Transmitter;


/**
 * communication with the MIDI controller
 * 
 * @author Carolina Arenas Okawa
 * @author Eric
 * @author Fernando Akio
 * @author Vin�cius
 */
public class InputKeyboard {

	/**
	 * Starts a input keyboard
	 */
	public static void start() {
		new InputKeyboard();
	}
	
	
	private InputKeyboard() {
		MidiDevice device;
		MidiDevice.Info[] infos = MidiSystem.getMidiDeviceInfo();
		for (int i = 0; i < infos.length; i++) {
			try {
				device = MidiSystem.getMidiDevice(infos[i]);
				// does the device have any transmitters?
				// if it does, add it to the device list
				//System.out.println(infos[i]);

				// get all transmitters
				List<Transmitter> transmitters = device.getTransmitters();
				// and for each transmitter

				for (int j = 0; j < transmitters.size(); j++) {
					// create a new receiver
					transmitters.get(j).setReceiver(
					// using my own MidiInputReceiver
							new MidiInputReceiver(device.getDeviceInfo()
									.toString()));
				}

				Transmitter trans = device.getTransmitter();
				trans.setReceiver(new MidiInputReceiver(device.getDeviceInfo()
						.toString()));

				// open each device
				device.open();
				// if code gets this far without throwing an exception
				// print a success message
				//System.out.println(device.getDeviceInfo() + " Was Opened");

			} catch (MidiUnavailableException e) {
				//e.printStackTrace();
			}
		}
	}
}
