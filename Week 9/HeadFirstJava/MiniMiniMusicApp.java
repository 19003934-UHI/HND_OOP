import javax.sound.midi.*;

public class MiniMiniMusicApp {
    public static void main(String[] args) {
        MiniMiniMusicApp mini = new MiniMiniMusicApp();
        mini.play();
    } // main end

    public void play() {
        try {
            // akin to a CD player
            Sequencer player = MidiSystem.getSequencer();
            player.open();

            // akin to a CD, just plays one song
            Sequence seq = new Sequence(Sequence.PPQ, 4);

            // Where the midi info lives
            Track track = seq.createTrack();

            ShortMessage a = new ShortMessage();

            /* 
             * When constructing a message, it is split into 4 parts
             * (1) Message type, 144 for playing a note and 128 for coming off of a note
             * (2) Channel, like a musician in a band (1 for singer, 2 for guitarist, 3 for drummer)
             * (3) Note to play, A number from 0 to 127, ranging from low to high
             * (4) Velocity, how fast/hard the key press (ranges from 0 to 100, quiet to loud)
             */
            
            a.setMessage(144, 1, 44, 100);
            MidiEvent noteOn = new MidiEvent(a, 1);
            track.add(noteOn);

            ShortMessage b = new ShortMessage();
            b.setMessage(128, 1, 44, 100);
            MidiEvent noteOff = new MidiEvent(b, 16);
            track.add(noteOff);

            // Gives the sequence to the Sequencer (putting a cd into the cd player)
            player.setSequence(seq);

            // Pushes play
            player.start();

        } catch (Exception ex) {
            ex.printStackTrace();
        } // try catch end
    } // play end
} // class end
