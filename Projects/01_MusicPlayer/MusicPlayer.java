import javax.sound.sampled.*;
import java.io.*;
import java.util.*;

class MusicPlayer {

    private List<String> songs = new ArrayList<>();
    private Clip clip;

    // Load songs from file
    public void loadSongs(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                songs.add(line);
            }
        } catch (Exception e) {
            System.out.println("Error loading songs: " + e.getMessage());
        }
    }

    // Show songs
    public void showSongs() {
        for (int i = 0; i < songs.size(); i++) {
            System.out.println((i + 1) + ". " + songs.get(i));
        }
    }

    // Play WAV file
    public void playSong(int index) {
        try {
            String fileName = songs.get(index);
            File file = new File(fileName);

            if (!file.exists()) {
                throw new FileNotFoundException("File not found!");
            }

            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
            clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();

            System.out.println("Playing: " + fileName);

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid song number!");
        } catch (UnsupportedAudioFileException e) {
            System.out.println("Unsupported audio format!");
        } catch (LineUnavailableException e) {
            System.out.println("Audio line unavailable!");
        } catch (IOException e) {
            System.out.println("Error playing file: " + e.getMessage());
        }
    }

    // Stop song
    public void stopSong() {
        try {
            if (clip != null && clip.isRunning()) {
                clip.stop();
                clip.close();
                System.out.println("Song stopped.");
            } else {
                throw new Exception("No song is playing!");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}