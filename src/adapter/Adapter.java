/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

/**
 *
 * @author r618b
 */
public class Adapter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MediaPlayer player = new MP3();
        player.play("musica.mp3");
        player = new FormatAdapter(new AVI());
        player.play("video.avi");
        player = new FormatAdapter(new MPC());
        player.play("peli.mkv");
    }
     private static class FormatAdapter implements MediaPlayer {
        private MediaPackage media;
        public FormatAdapter(MediaPackage m) {
            media = m;
        }
        @Override
        public void play(String filename) {
            System.out.print("Using Adapter --> ");
     
            media.playFile(filename);
        }
    }
    
}
