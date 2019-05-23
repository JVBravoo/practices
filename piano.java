package Jmusic;

import java.util.Scanner;
import javax.sound.midi.MidiChannel;


import javax.sound.sampled.AudioSystem;
import java.io.File;
import javax.sound.sampled.Clip;


import javax.sound.midi.MidiSystem;
import javax.sound.midi.Synthesizer;
import java.io.*;
import sun.audio.*;

public class piano {
	
public static void main(String[]args) {
		
		File Space = new File ("file://Users/bravo/Desktop/JavaSoundDemo/audio/spacemusic.wav"); 
		PlaySound(Space);
	}
	
	public static void PlaySound(File space) {
		
		System.out.println("Comecou");
		
		try {
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(space));
			clip.start();
			
			Thread.sleep(clip.getMicrosecondLength()/1000);
		}
		catch(Exception e) {
			System.out.println("catch");
		}
	}
}
/*
	private Synthesizer synthesizer;
	private MidiChannel channel;
	
	public void startSynthesizer(InputStream in) {
        try {
            synthesizer = MidiSystem.getSynthesizer();
            synthesizer.open();
            channel = synthesizer.getChannels()[0];
        }
        catch (Exception e) {
            e.printStackTrace();
            System.exit(-1);
        }
    }
	
	public static void main(String[]args) throws FileNotFoundException {
	
		
		piano Piano = new piano();
	
		String introFile = "/users/bravo/Downloads/JavaSoundDemo/audio/spacemusic.au";
		InputStream in = new FileInputStream(introFile);
		
		Piano.startSynthesizer(in);

		AudioStream audioStream = new AudioStream(in);
		AudioPlayer.player.start(audioStream);
 	}
	
}
*/


