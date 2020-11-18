import javax.sound.midi.*;

public class MusicTest1 {
    public void play() {
        try {
            // the main part of the MIDI device, sequences the data into a song
            Sequencer sequencer = MidiSystem.getSequencer();
            System.out.println("Successfully got a sequencer. ");

        } catch (MidiUnavailableException ex) {
            System.out.println("Couldn't grab sequencer.");
        } // end try catch
    } // play end

    public static void main(String[] args) {
        MusicTest1 mt = new MusicTest1();

        mt.play();

    } // main end
} // class end
